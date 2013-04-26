package jp.mixi.assignment.controller.med;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/**
 * TODO: 課題2 画面回転や、他のアプリ・画面の起動等で、状態遷移が起こると、それ以前の状態で持っていたデータが失われてしまいます。
 * これを防ぐため、この Activity の中で状態管理をしてください。
 * 
 * @author keishin.yokomaku
 */
public class SubActivity extends Activity implements TextWatcher {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Hint: 状態遷移が何も起こっていない場合は、savedInstanceState は null です
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
	}

	@Override
	protected void onStart() {
		super.onStart();
		EditText text = (EditText) findViewById(R.id.Editor);
		text.addTextChangedListener(this);
	}

	/**
	 * TODO: 復帰処理はこちらか onCreate
	 */
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);

		if (savedInstanceState != null) {
			String str = savedInstanceState.getString("stored_text");
			TextView textv = (TextView) findViewById(R.id.SyncedText);
			textv.setText(str);

			EditText etext = (EditText) findViewById(R.id.Editor);
			etext.setText(str);
		}
	}

	/**
	 * TODO: 保存処理はこちら
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		EditText text = (EditText) findViewById(R.id.Editor);
		Editable str = text.getText();
		outState.putString("stored_text", str.toString());
	}

	@Override
	protected void onStop() {
		super.onStop();
		EditText text = (EditText) findViewById(R.id.Editor);
		text.removeTextChangedListener(this);
	}

	@Override
	public void afterTextChanged(Editable s) {
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		TextView text = (TextView) findViewById(R.id.SyncedText);
		text.setText(s);
	}
}