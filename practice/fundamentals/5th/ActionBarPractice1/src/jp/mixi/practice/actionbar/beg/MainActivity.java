package jp.mixi.practice.actionbar.beg;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.ActionBar.Tab;

public class MainActivity extends SherlockActivity implements
		 TabListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ActionBar mActionBar = getSupportActionBar();
		 
        mActionBar.addTab(mActionBar.newTab().setText("tab1").setTabListener(this));
        mActionBar.addTab(mActionBar.newTab().setText("tab2").setTabListener(this));
        mActionBar.addTab(mActionBar.newTab().setText("tab3").setTabListener(this));
 
        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 	}


	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
		Toast.makeText(this, tab.getText(), Toast.LENGTH_LONG).show();
	}
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}
