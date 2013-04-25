
package jp.mixi.assignment.controller.beg;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

/**
 * TODO: 課題1
 * {@link Toast#makeText(Context, CharSequence, int)} または
 * {@link Toast#makeText(Context, int, int)} を利用して、各ライフサイクルメソッドがどのような順番で
 * 実行されているかを確認してください。
 * 確認したら、assignments/fundamentals/2nd/Report.md にその順番を記述してください。
 * @author keishin.yokomaku
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "create", Toast.LENGTH_LONG).show();
        Log.v("life", "ukayare create");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
        Toast.makeText(this, "start", Toast.LENGTH_LONG).show();
        Log.v("life", "ukayare start");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
        Toast.makeText(this, "resume", Toast.LENGTH_LONG).show();
        Log.v("life", "ukayare resume");
    }

    @Override
    protected void onPause() {
    	super.onPause();
        Toast.makeText(this, "pause", Toast.LENGTH_LONG).show();
        Log.v("life", "ukayare pause");
    }

    @Override
    protected void onStop() {
    	super.onStop();
        Toast.makeText(this, "stop", Toast.LENGTH_LONG).show();
        Log.v("life", "ukayare stop");
    }

    @Override
    protected void onDestroy() {
    	super.onDestroy();
        Toast.makeText(this, "destroy", Toast.LENGTH_LONG).show();
        Log.v("life", "ukayare destroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}