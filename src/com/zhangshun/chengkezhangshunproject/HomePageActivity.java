package com.zhangshun.chengkezhangshunproject;

import java.util.ArrayList;

import com.example.appferal.R;
import com.zhangshun.adapter.HomePageAdapter;
import com.zhangshun.demo.HomePageDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.RadioButton;

public class HomePageActivity extends Activity {

	HomePageAdapter mAdapter;
	ListView mList;
	ArrayList<HomePageDemo> list = new ArrayList<HomePageDemo>();
	RadioButton classifybtn,circlebtn,mebtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);

		mList = (ListView) findViewById(R.id.home_page_list);
		getData();
		mAdapter = new HomePageAdapter(this, list);
		mList.setAdapter(mAdapter);
		classifybtn = (RadioButton) findViewById(R.id.classify);
		circlebtn = (RadioButton) findViewById(R.id.circle);
		mebtn = (RadioButton) findViewById(R.id.me);
		
		classifybtn.setOnClickListener(clickListener);
		circlebtn.setOnClickListener(clickListener);
		mebtn.setOnClickListener(clickListener);
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
	
	OnClickListener clickListener=new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.classify:
				@SuppressWarnings("unused")
				Intent intent = new Intent();
				intent.setClass(HomePageActivity.this, ClassifyActivity.class);
				startActivity(intent);
				break;
			case R.id.circle:
				//Intent intent = new Intent(HomePageActivity.this,ClassifyActivity.class);
				break;
			case R.id.me:
				@SuppressWarnings("unused")
				Intent intent1 = new Intent();
				intent1.setClass(HomePageActivity.this,PersonalCenterActivity.class);
				startActivity(intent1);
				break;
			default:
				break;
			}
		}
		
	};

}
