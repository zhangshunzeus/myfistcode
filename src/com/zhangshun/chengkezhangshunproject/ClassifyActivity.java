package com.zhangshun.chengkezhangshunproject;

import java.util.ArrayList;

import com.zhangshun.adapter.ClassifyAdapter;
import com.zhangshun.demo.ClassifyDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class ClassifyActivity extends Activity {

	ClassifyAdapter mAdapter;
	ListView mList;
	ArrayList<ClassifyDemo> list = new ArrayList<ClassifyDemo>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classify);

		mList = (ListView) findViewById(R.id.classify_list);
		getData();
		mAdapter = new ClassifyAdapter(this, list);
		mList.setAdapter(mAdapter);

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
