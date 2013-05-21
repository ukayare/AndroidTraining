package jp.mixi.practice.test.target.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import jp.mixi.practice.test.target.TestTarget3;
import jp.mixi.practice.test.target.R;

public class TestPractice3 extends
		ActivityInstrumentationTestCase2<TestTarget3> {

	private TestTarget3 mActivity;
	//各オブジェクトとリソースを結び付ける
	private EditText title;
	private EditText content;
    private TextView titleCounter;
    private TextView contentCounter;

	
	public TestPractice3() {
		super("jp.mixi.practice.test.target",TestTarget3.class);
	}

	public TestPractice3(Class<TestTarget3> class1) {
		// TODO Auto-generated constructor stub
		super(class1);
	}
	
	@Override
	protected void setUp() throws Exception {
	    // TODO Auto-generated method stub
	    super.setUp();

		//アクティビティを取得する
		mActivity = getActivity();
		//各オブジェクトとリソースを結び付ける
		title = (EditText) mActivity.findViewById(R.id.TitleEditor);
		content = (EditText) mActivity.findViewById(R.id.ContentEditor);
        titleCounter = (TextView) mActivity.findViewById(R.id.TitleCounter);
        contentCounter = (TextView) mActivity.findViewById(R.id.ContentCounter);
	}

	public void testTextChange() throws Exception {

		getActivity().runOnUiThread(new Runnable() {
			@Override
			public void run() {
				title.requestFocus();
			}
		});
		getInstrumentation().waitForIdleSync();
		assertTrue(title.isFocused());
		sendKeys(KeyEvent.KEYCODE_T);
        sendKeys(KeyEvent.KEYCODE_E);
        sendKeys(KeyEvent.KEYCODE_S);
        
        mActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
        		content.requestFocus();
            }
        });
        //UIスレッドが終了するまで待つ
        getInstrumentation().waitForIdleSync();
		assertTrue(content.isFocused());
		sendKeys(KeyEvent.KEYCODE_T);
        sendKeys(KeyEvent.KEYCODE_E);
        sendKeys(KeyEvent.KEYCODE_S);
        sendKeys(KeyEvent.KEYCODE_S);
        getInstrumentation().waitForIdleSync();

		
		assertEquals("3 / 10",titleCounter.getText().toString());
		assertEquals("4 / 10000",contentCounter.getText().toString());
	}
}