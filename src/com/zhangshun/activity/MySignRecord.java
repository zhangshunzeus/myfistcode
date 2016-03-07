package com.zhangshun.activity;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.appferal.R;
import com.zhangshun.adapter.MySign;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
/**
 * 我的报名记录
 * @author jkqme
 *
 */
public class MySignRecord extends Activity {
	private TextView quanbu;
	private TextView yuyue;
	private TextView yishouli;
	private ListView listView;
	private MySign adpter;
	private ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_sign_record);
		loadvary();
	}

	private void loadvary() {
		quanbu = (TextView) findViewById(R.id.my_sign_record_quanbu_tx);
		yuyue = (TextView) findViewById(R.id.my_sign_record_yuyue_tx);
		yishouli = (TextView) findViewById(R.id.my_sign_record_yishouli_tx);
		quanbu.setOnClickListener(listener);
		yuyue.setOnClickListener(listener);
		yishouli.setOnClickListener(listener);
		listView = (ListView) findViewById(R.id.my_sign_record_list_lv);
		getList();
		adpter = new MySign(list, this);
		listView.setAdapter(adpter);
		whenButtonChange(1);
	}

	/**
	 * button 状态监听
	 * 
	 * @param i
	 */
	@SuppressLint("ResourceAsColor")
	private void whenButtonChange(int i) {
		switch (i) {
		case 1:

			quanbu.setBackgroundColor(R.color.orange);
			yuyue.setBackgroundColor(Color.WHITE);
			yishouli.setBackgroundColor(Color.WHITE);
			break;
		case 2:
			yuyue.setBackgroundColor(R.color.orange);
			quanbu.setBackgroundColor(Color.WHITE);
			yishouli.setBackgroundColor(Color.WHITE);
			break;
		case 3:
			yishouli.setBackgroundColor(R.color.orange);
			yuyue.setBackgroundColor(Color.WHITE);
			quanbu.setBackgroundColor(Color.WHITE);
			break;

		default:
			break;
		}
	}

	private OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.my_sign_record_quanbu_tx:
				whenButtonChange(1);
				break;
			case R.id.my_sign_record_yuyue_tx:
				whenButtonChange(2);
				break;
			case R.id.my_sign_record_yishouli_tx:
				whenButtonChange(3);
				break;

			default:
				break;
			}
		}
	};

	private void getList() {
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("img", R.drawable.ic_launcher);
		map.put("text1", "汉昌IT岗前实训中心");
		map.put("text2", "3");
		map.put("text3", "二胡八段干货讲座");
		map.put("text4", "03-99-下午 55:33");
		map.put("text5", "未受理");
		list.add(map);
		list.add(map);
		list.add(map);
		list.add(map);

		list.add(map);
		list.add(map);
		list.add(map);
		list.add(map);
		list.add(map);
	}
}
