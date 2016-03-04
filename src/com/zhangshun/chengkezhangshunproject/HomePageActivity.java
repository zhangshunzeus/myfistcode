package com.zhangshun.chengkezhangshunproject;

import java.util.ArrayList;

import com.zhangshun.adapter.HomePageAdapter;
import com.zhangshun.demo.HomePageDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class HomePageActivity extends Activity {

	HomePageAdapter mAdapter;
	ListView mList;
	ArrayList<HomePageDemo> list = new ArrayList<HomePageDemo>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);

		mList = (ListView) findViewById(R.id.home_page_list);
		getData();
		mAdapter = new HomePageAdapter(this, list);
		mList.setAdapter(mAdapter);

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
