package com.zhangshun.adapter;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.appferal.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyStorAdapter extends BaseAdapter {
	ArrayList<HashMap<String, Object>> list;
	Context context;
	LayoutInflater inflater;
	Holder holder = new Holder();

	public MyStorAdapter() {
		// TODO Auto-generated constructor stub
	}

	public MyStorAdapter(ArrayList<HashMap<String, Object>> list, Context context) {
		this.list = list;
		this.context = context;
		this.inflater = LayoutInflater.from(context);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.lv_my_stor, null);
			holder.img = (ImageView) convertView.findViewById(R.id.lv_my_stor_img);
			holder.text1 = (TextView) convertView.findViewById(R.id.lv_my_stor_1_tex);
			holder.text2 = (TextView) convertView.findViewById(R.id.lv_my_stor_2_tex);
			holder.text2_1 = (TextView) convertView.findViewById(R.id.lv_my_stor_2_1_tex);
			holder.text3 = (TextView) convertView.findViewById(R.id.lv_my_stor_2_tex);
			holder.text3_1 = (TextView) convertView.findViewById(R.id.lv_my_stor_3_1_tex);
			holder.text4 = (TextView) convertView.findViewById(R.id.lv_my_stor_4_1_tex);
			convertView.setTag(holder);
		}
		holder = (Holder) convertView.getTag();
		// holder.img.setImageDrawable();

		return convertView;
	}

	class Holder {
		ImageView img;
		TextView text1;
		TextView text2;
		TextView text2_1;
		TextView text3;
		TextView text3_1;
		TextView text4;
	}
}
