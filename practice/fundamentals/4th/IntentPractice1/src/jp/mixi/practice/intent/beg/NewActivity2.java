package jp.mixi.practice.intent.beg;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class NewActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        
        Toast.makeText(this,getIntent().getExtras().getString("toast_message"),Toast.LENGTH_LONG).show();
        
    }
}
