package com.xiaozhang.myferal;

import com.example.appferal.R;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SortFragmentB extends Fragment{
	private ListView lv;
	private FistActivity mainActivity;
	SortFragmentBListviewAdapter adapter;
	private static String[] data={"������","����/��ѧ","�˶���"};
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		mainActivity=(FistActivity) activity;
		
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.sout_fragment_b, container,false);
          lv=(ListView) view.findViewById(R.id.fragment_b_lsitview);
         adapter=new SortFragmentBListviewAdapter(mainActivity,data);
		  
          return view;
	}
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 lv.setAdapter(adapter);
	}

}
