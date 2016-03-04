package com.zhangshun.adapter;

import java.util.ArrayList;
import com.zhangshun.chengkezhangshunproject.R;
import com.zhangshun.demo.ClassifyDemo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ClassifyAdapter extends BaseAdapter {

	Context context;
	LayoutInflater mInflater;
	ArrayList<ClassifyDemo> list;
	
	public ClassifyAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	public ClassifyAdapter(Context context , ArrayList<ClassifyDemo> list){
		this.context = context;
		this.list = list;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		// 在此适配器中所代表的数据集中的条目数
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		// 获取数据集中与指定索引对应的数据项
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		// 取在列表中与指定索引对应的行id
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHodler;
		if(convertView == null){
			convertView = mInflater.inflate(R.layout.classify_listview, null);
			viewHodler = new ViewHolder();
			viewHodler.text = (TextView) convertView.findViewById(R.id.text);
			convertView.setTag(viewHodler);
		}
		viewHodler = (ViewHolder) convertView.getTag();
		ClassifyDemo classifyDemo = (ClassifyDemo) getItem(position);
		classifyDemo.setText(classifyDemo.getText());
		return convertView;
	}
	
	class ViewHolder {

		public TextView text;}

}
