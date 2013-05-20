package jp.mixi.practice.test.target.test;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.test.AndroidTestCase;
import android.test.mock.MockContext;
import jp.mixi.practice.test.target.SubActivity;
import jp.mixi.practice.test.target.TestTarget1;
import jp.mixi.practice.test.target.MainActivity;

public class Target1Test extends AndroidTestCase {
	// テストの前準備のメソッド。テストケースの実行ごとに呼ばれる。
	// 事前準備中に何らかの例外が起こる可能性があるので、例外をスローする宣言をする。
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	// テストの後始末のメソッド。テストケースの実行ごとに呼ばれる。
	// 後始末中に何らかの例外が起こる可能性があるので、例外をスローする宣言をする。
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	// テストケース本体。名前は必ず test から始まる
	// テスト中に異常が発生した場合（=例外がスローされた場合）、テストを Fail とするためその例外をそのまま投げるようにする
	public void testisValidIntent() throws Exception {
		TestTarget1 target = new TestTarget1();

		Intent i = new Intent();
		assertFalse(target.isValidIntent(i));
		Intent i2 = new Intent();
		i2.putExtra(Intent.EXTRA_TEXT, "hoge");
		assertFalse(target.isValidIntent(i2));
		Intent i3 = new Intent();
		i3.putExtra(Intent.EXTRA_TEXT, "hoge");
		i3.setData(Uri.parse("test.co.jp"));
		assertTrue(target.isValidIntent(i3));

		// 第 1 引数 に期待値、第 2 引数に実際の計算を入れて、等しいかどうか比較する
	}

	public void teststartSubActivity() throws Exception {
		TestTarget1 target = new TestTarget1();

		target.startSubActivity(new SampleTestTarget1Context(getContext()),
				"srart sub");
	}

	private static class SampleTestTarget1Context extends MockContext {
		private Context mContext;

		public SampleTestTarget1Context(Context baseContext) {
			mContext = baseContext;
		}

		@Override
		public String getPackageName() {
			return mContext.getPackageName();
		}

		@Override
		public void startActivity(Intent intent) {
			// Intent から、Intent の送り先のコンポーネント情報を取り出して、期待値と一致するか確認する
			ComponentName component = intent.getComponent();
			assertEquals(SubActivity.class.getCanonicalName(),
					component.getClassName());
			// Extra に期待するものが有るか確認する
			assertEquals(Intent.FLAG_ACTIVITY_FORWARD_RESULT
					| Intent.FLAG_ACTIVITY_REORDER_TO_FRONT, intent.getFlags());
			assertTrue(intent.hasExtra(Intent.EXTRA_SUBJECT));
			assertEquals("srart sub",
					intent.getStringExtra(Intent.EXTRA_SUBJECT));
			assertEquals(Uri.parse("http://mixi.jp"),
					intent.getData());
		}
	}
}