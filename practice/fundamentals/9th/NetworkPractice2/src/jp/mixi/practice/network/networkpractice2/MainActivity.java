package jp.mixi.practice.network.networkpractice2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
			HttpClient client = new DefaultHttpClient();
			String result = "";
			try {
				
				result = client.execute(new HttpGet(uri[0]),
						new ResponseHandler<String>() {
							public String handleResponse(HttpResponse response)
									throws ClientProtocolException, IOException {
								return EntityUtils.toString(response
										.getEntity());
							}
						});
				
				
			} catch (IOException e) {
				e.printStackTrace();
				return "error";
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
			HttpClient client = new DefaultHttpClient();
			String result = "";
			try {
				
				result = client.execute(new HttpPost(uri[0]),
						new ResponseHandler<String>() {
							public String handleResponse(HttpResponse response)
									throws ClientProtocolException, IOException {
								return EntityUtils.toString(response
										.getEntity());
							}
						});
				
				
			} catch (IOException e) {
				e.printStackTrace();
				return "error";
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
