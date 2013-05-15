package jp.mixi.practice.network.networkpractice1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

import android.app.Activity;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View buttonGet = findViewById(R.id.buttonGet);
		buttonGet.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				EditText et = (EditText) findViewById(R.id.accessUrl);

				String request = et.getText().toString();

				HttpGetTask httpget = new HttpGetTask();

				httpget.execute(request);
			}

		});
		View buttonPost = findViewById(R.id.buttonPost);
		buttonPost.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// http postの処理を書く
				EditText et = (EditText) findViewById(R.id.accessUrl);

				String request = et.getText().toString();

				HttpPostTask httppost = new HttpPostTask();

				httppost.execute(request);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public class HttpGetTask extends AsyncTask<String, Void, String> {
		// doInBackground() に、バックグラウンド処理の内容を記述する。
		// ここではAndroidHttpClientによるHTTP GET実行
		protected String doInBackground(String... uri) {
			// http getの処理を書く
			URL url;
			String result = "";
			try {
				url = new URL(uri[0]);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}

			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) url.openConnection();
				connection.connect();
				InputStream is = connection.getInputStream();

				StringBuilder src = new StringBuilder();
				while (true) {
					byte[] line = new byte[1024];
					int size = is.read(line);
					if (size <= 0)
						break;
					src.append(new String(line, "euc-jp"));

					result = src.toString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				connection.disconnect();
			}

			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			EditText et = (EditText) findViewById(R.id.httpBody);
			et.setText(result);
		}
	}

	public class HttpPostTask extends AsyncTask<String, Void, String> {
		// doInBackground() に、バックグラウンド処理の内容を記述する。
		// ここではAndroidHttpClientによるHTTP GET実行
		protected String doInBackground(String... uri) {
			URL url;
			String result = "";
			try {
				url = new URL(uri[0]);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return "";
			}
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("POST");
				connection.setDoOutput(true);

				String postData = "hoge=fuga&piyo=test";
				OutputStream os = connection.getOutputStream();
				os.write(postData.getBytes());
				os.flush();
				os.close();

				InputStream is = connection.getInputStream();

				StringBuilder src = new StringBuilder();
				while (true) {
					byte[] line = new byte[1024];
					int size = is.read(line);
					if (size <= 0)
						break;
					src.append(new String(line, "euc-jp"));
					result = src.toString();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				connection.disconnect();
			}
			
			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			EditText et = (EditText) findViewById(R.id.httpBody);
			et.setText(result);
		}
	}

}
