package jp.mixi.practice.notification.beg;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// TODO ここで通知を表示する
		Intent intent = new Intent(this, FromNotifyActivity.class);
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
				intent, PendingIntent.FLAG_UPDATE_CURRENT);

		NotificationCompat.Builder builder = new NotificationCompat.Builder(
				this);
		Notification notification = builder.setWhen(System.currentTimeMillis())
				.setContentTitle("test").setContentText("tetetest")
				.setSmallIcon(R.drawable.ic_launcher).setTicker("this is test")
				.setContentIntent(pendingIntent).setOnlyAlertOnce(true)
				.setAutoCancel(true).build();

		NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		manager.notify(0, notification);
	}
}