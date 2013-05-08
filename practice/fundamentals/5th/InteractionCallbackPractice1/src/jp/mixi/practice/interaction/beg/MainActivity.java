package jp.mixi.practice.interaction.beg;

import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity implements
		OnNavigationListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		getSupportActionBar().setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.main, menu);

		menu.add("settings")
				.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		menu.add("login")
				.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		menu.add("refresh")
				.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		return true;
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// ここで、状態に応じてメニューの有効・無効を切り替えたりなどの処理をする
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// 選択されたメニューに対応するイベント処理をここで実行する
		Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();
		return super.onOptionsItemSelected(item);
	}

	// List Navigation の一覧から項目を選択したら呼び出されるコールバック
	@Override
	public boolean onNavigationItemSelected(int itemPosition, long itemId) {
		return false;
	}
}


/*
 * レポート、どこに書けばいいかわかんなかったんでここに記載
 * 上の状態　WXGA720だと縦向きでrefreshが隠れる（横だと出る）QVGAもおなじ
 * WXGA800だと縦横ともに全部出た
 * 
 * */
