
package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.view.Menu;
import android.support.v4.app.*;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       // FragmentManager ���Aandroid.support.v4.app.FragmentManager �𗘗p����
        FragmentManager manager = getSupportFragmentManager();
        // ���C�A�E�g���� Fragment �������o���ăC���X�^���X�𓾂�
        Fragment fragment = manager.findFragmentById(R.id.Frag);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
