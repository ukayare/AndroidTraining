package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.view.*;
import android.support.v4.app.Fragment;

public class MainFragment extends Fragment {	
	public MainFragment(){}
	
	// 初期化専用のメソッド。Fragment に対する初期化用の引数はここで管理する
    public static Fragment createInstance() {
        Fragment fragment = new MainFragment();
        
        return fragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // LayoutInflater を利用して、レイアウトをリソースとして読み込む
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
