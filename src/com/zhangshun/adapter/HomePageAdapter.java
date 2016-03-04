package com.zhangshun.adapter;

import java.util.ArrayList;

import com.example.appferal.R;
import com.zhangshun.demo.HomePageDemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePageAdapter extends BaseAdapter {

	Context context;
	LayoutInflater mInflater;
	ArrayList<HomePageDemo> list;
	
	public HomePageAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	public HomePageAdapter(Context context, ArrayList<HomePageDemo> list) {
		
		this.context=context;
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
		// 得到一个视图显示数据集的数据在指定的位置
		ViewHolder viewHodler;
		if(convertView == null){
			convertView = mInflater.inflate(R.layout.home_page_listview, null);
			viewHodler = new ViewHolder();
			viewHodler.click_image_left = (ImageView) convertView.findViewById(R.id.click_image_left);
			viewHodler.click_image_right = (ImageView) convertView.findViewById(R.id.click_image_right);
			viewHodler.title_text_left = (TextView) convertView.findViewById(R.id.title_text_left);
			viewHodler.title_text_right = (TextView) convertView.findViewById(R.id.title_text_right);
			viewHodler.apply_left = (TextView) convertView.findViewById(R.id.apply_left);
			viewHodler.apply_right = (TextView) convertView.findViewById(R.id.apply_right);
			viewHodler.time_surplus_left = (TextView) convertView.findViewById(R.id.time_surplus_left);
			viewHodler.time_surplus_right = (TextView) convertView.findViewById(R.id.time_surplus_right);
			convertView.setTag(viewHodler);
		}
		viewHodler = (ViewHolder) convertView.getTag();
		HomePageDemo homePageDemo = (HomePageDemo) getItem(position);
		homePageDemo.setClick_image_left(homePageDemo.getClick_image_left());
		homePageDemo.setClick_image_right(homePageDemo.getClick_image_right());
		homePageDemo.setTitle_text_left(homePageDemo.getTitle_text_left());
		homePageDemo.setTitle_text_right(homePageDemo.getTitle_text_right());
		homePageDemo.setApply_left(homePageDemo.getApply_left());
		homePageDemo.setApply_right(homePageDemo.getApply_right());
		homePageDemo.setTime_surplus_left(homePageDemo.getTime_surplus_left());
		homePageDemo.setTime_surplus_rightl(homePageDemo.getTime_surplus_rightl());
		return convertView;
	}
	
		class ViewHolder {

			public TextView time_surplus_right;
			public TextView time_surplus_left;
			public TextView apply_right;
			public TextView apply_left;
			public TextView title_text_right;
			public TextView title_text_left;
			public ImageView click_image_right;
			public ImageView click_image_left;
			
	}

}
