package com.zhangshun.activity;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.appferal.R;
import com.zhangshun.adapter.MyStorAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
/**
 * 我的储藏
 * @author jkqme
 *
 */
public class MyStor extends Activity {
	private ImageView back;
	private ListView listView;
	private MyStorAdapter adapter;
	private ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_stor);

		back = (ImageView) findViewById(R.id.my_stor_img);
		back.setOnClickListener(listener);
		listView = (ListView) findViewById(R.id.my_stor_list);
		adapter = new MyStorAdapter(list, this);
		listView.setAdapter(adapter);
	}

	OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	};
}
