package com.zhangshun.fragment;

import java.util.ArrayList;

import com.example.appferal.R;
import com.zhangshun.adapter.HomePageAdapter;
import com.zhangshun.demo.HomePageDemo;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

@SuppressLint("NewApi")
public class HomeFragment extends Fragment {
	
	HomePageAdapter mAdapter;
	ListView mList;
	ArrayList<HomePageDemo> list = new ArrayList<HomePageDemo>();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.home_page, null);
		mList = (ListView) findViewById(R.id.home_page_list);
		getData();
		mAdapter = new HomePageAdapter(getActivity(), list);
		mList.setAdapter(mAdapter);
		return view;
	}
	
	private ListView findViewById(int homePageList) {
		// TODO Auto-generated method stub
		return null;
	}

	private void getData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			HomePageDemo buy = new HomePageDemo();
			buy.setClick_image_left(R.drawable.erhu);
			buy.setClick_image_right(R.drawable.erhu);
			buy.setTitle_text_left("二胡十段兴趣班");
			buy.setTitle_text_right("二胡十段兴趣班");
			buy.setApply_left("已报1人   渝中汉昌");
			buy.setApply_right("已报1人   渝中汉昌");
			buy.setTime_surplus_left("余 3 天");
			buy.setTime_surplus_rightl("余 3 天");
			list.add(buy);
		}
	}
	
}
