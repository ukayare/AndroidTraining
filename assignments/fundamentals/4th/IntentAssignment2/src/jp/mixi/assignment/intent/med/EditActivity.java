package jp.mixi.assignment.intent.med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class EditActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        findViewById(R.id.Submit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここで、id が MyEdit の EditText からテキストを取得して、結果にセットする
            	EditText etext = (EditText)findViewById(R.id.MyEdit);
            	Intent i = new Intent(EditActivity.this,MainActivity.class);
            	i.putExtra("edittext", etext.getText().toString());
            	Log.v("test",i.getExtras().getString("edittext"));
            	setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}