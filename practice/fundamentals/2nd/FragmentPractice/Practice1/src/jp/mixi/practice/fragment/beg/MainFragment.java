package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.view.*;
import android.support.v4.app.Fragment;

public class MainFragment extends Fragment {	
	public MainFragment(){}
	
	// ��������p�̃��\�b�h�BFragment �ɑ΂��鏉�����p�̈����͂����ŊǗ�����
    public static Fragment createInstance() {
        Fragment fragment = new MainFragment();
        
        return fragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // LayoutInflater �𗘗p���āA���C�A�E�g�����\�[�X�Ƃ��ēǂݍ���
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
