package jp.mixi.assignment.controller.adv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InputAreaFragment extends Fragment {
	public InputAreaFragment(){}
	
    public static Fragment createInstance() {
        Fragment fragment = new InputAreaFragment();
        
        return fragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input_area, container, false);
        return view;
    }
}
