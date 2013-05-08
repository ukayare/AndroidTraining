package jp.mixi.assignment.res.drawable.beg;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		
		Button button = (Button)findViewById(R.id.dbutton);
		
		Log.v("orient", newConfig.orientation+"");

		switch (newConfig.orientation) {
		case Configuration.ORIENTATION_PORTRAIT:
			Drawable drawable_v = getResources().getDrawable(R.drawable.rectan);
			button.setBackgroundDrawable(drawable_v);
			break;
		case Configuration.ORIENTATION_LANDSCAPE:
			Drawable drawable_h = getResources().getDrawable(R.drawable.rectan_horizon);
			button.setBackgroundDrawable(drawable_h);
			break;
		}
	}
}
