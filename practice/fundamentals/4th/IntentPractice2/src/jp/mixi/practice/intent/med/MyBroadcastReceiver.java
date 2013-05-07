package jp.mixi.practice.intent.med;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context contecxt, Intent intent) {
		// TODO Auto-generated method stub
		
		if(intent.getAction().equals(MainActivity.ACTION_FIRST)){
			Log.v("log","action first");
		}
		else if(intent.getAction().equals(MainActivity.ACTION_SECOND)){
			Log.v("log","action second");
		}
		else if(intent.getAction().equals(MainActivity.ACTION_THIRD)){
			Log.v("log","action third");
		}
	}

}
