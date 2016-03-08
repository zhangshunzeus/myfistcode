package com.xiaozhang.myferal;

import com.example.appferal.R;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class SortFragmentA extends Fragment {
	private RadioGroup group;
	FragmentManager manager;
	FragmentTransaction tran;
	SortFragmentC fragmetc;
	SortFragmentB fragmeB;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		manager=getFragmentManager();
		tran=manager.beginTransaction();
		fragmeB=new SortFragmentB();
		fragmetc=new SortFragmentC();
		tran.add(R.id.sort_fragment_B, fragmetc);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.sout_fragment_a, container,false);
		group=(RadioGroup) view.findViewById(R.id.sout_fragmenta_raidogroup);
		group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				manager=getFragmentManager();
				tran=manager.beginTransaction();
				switch (arg1) {
				case R.id.sort_title_radio1:
					
				fragmetc=new SortFragmentC();
					tran.replace(R.id.sort_fragment_B, fragmetc);
					

					break;
				case R.id.sort_title_radio2:
					
				fragmeB=new SortFragmentB();
					tran.replace(R.id.sort_fragment_B, fragmeB);
				

					break;
				
			

				}
				tran.commit();
				
			}
		});
		return view;
	}
	

		
	
	
	

}
