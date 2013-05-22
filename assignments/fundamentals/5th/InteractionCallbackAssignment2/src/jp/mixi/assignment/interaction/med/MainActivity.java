
package jp.mixi.assignment.interaction.med;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements TextWatcher {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText editText = (EditText)findViewById(R.id.editText1);
        editText.addTextChangedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		TextView tv = (TextView)findViewById(R.id.textView1);
		
		tv.setText(s.toString().length()+"");
		
	}

	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence text, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
		
	}

}
