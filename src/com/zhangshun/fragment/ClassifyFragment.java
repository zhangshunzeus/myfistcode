package com.zhangshun.fragment;

import java.util.ArrayList;
import com.example.appferal.R;
import com.zhangshun.adapter.ClassifyAdapter;
import com.zhangshun.demo.ClassifyDemo;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

@SuppressLint("NewApi")
public class ClassifyFragment extends Fragment {
	
	ClassifyAdapter mAdapter;
	ListView mList;
	ArrayList<ClassifyDemo> list = new ArrayList<ClassifyDemo>();

	@SuppressLint("InflateParams")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.classify,null);
		getData();

		mAdapter = new ClassifyAdapter(getActivity(), list);
		mList.setAdapter(mAdapter);
		return view;
	}

	private void getData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			ClassifyDemo buy = new ClassifyDemo();
			buy.setText("钢琴");
			list.add(buy);
		}
	}
	
}
