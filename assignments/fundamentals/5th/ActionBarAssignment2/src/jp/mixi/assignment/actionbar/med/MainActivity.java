package jp.mixi.assignment.actionbar.med;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

public class MainActivity extends SherlockActivity implements TabListener,
		OnNavigationListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ActionBar mActionBar = getSupportActionBar();

		mActionBar.addTab(mActionBar.newTab().setText("tab1")
				.setTabListener(this));
		mActionBar.addTab(mActionBar.newTab().setText("tab2")
				.setTabListener(this));
		mActionBar.addTab(mActionBar.newTab().setText("tab3")
				.setTabListener(this));

		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		getSupportActionBar()
				.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// メニューの要素を追加して取得
		MenuItem actionItem = menu.add("new");
		MenuItem actionItem2 = menu.add("exit");

		// SHOW_AS_ACTION_IF_ROOM:余裕があれば表示
		actionItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		actionItem2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		actionItem.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent i = new Intent(MainActivity.this, SubActivity.class);
				startActivity(i);
				return false;
			}
		});
		actionItem2.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				finish();
				return false;
			}
		});
		return true;
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onNavigationItemSelected(int itemPosition, long itemId) {
		// TODO Auto-generated method stub
		return false;
	}

}
