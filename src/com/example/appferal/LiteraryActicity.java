package com.example.appferal;

import java.util.ArrayList;

import com.example.appferal.baseAdapter.LiteraryBaseAdapter;
import com.example.appferal.baseAdapter.LiteraryInfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class LiteraryActicity extends Activity {
	ArrayList<LiteraryInfo> list = new ArrayList<LiteraryInfo>();
	ListView listView;
	LiteraryBaseAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.literary);

		listView = (ListView) findViewById(R.id.literary_listview);
		getData();
		adapter = new LiteraryBaseAdapter(list, getApplicationContext());
		listView.setAdapter(adapter);
	}

	private void getData() {
		// TODO Auto-generated method stub
		LiteraryInfo info = new LiteraryInfo();
		info.setName("中国文学大典");
		info.setConntent("热爱文学，四书五经，中国文学宝典");
		info.setUser_id("菜豆");
		info.setUser_numb("150");
		info.setTime("30");
		info.setTime_text("分钟前");
		list.add(info);
		list.add(info);
		list.add(info);
		list.add(info);
		list.add(info);
		list.add(info);
	}
}
