package com.page.android_my_resgiration;

import java.util.List;

import com.page.android_feral.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MyResgirationAdapter extends BaseAdapter {
	List<String > data;
	Context context;
	LayoutInflater inflater;
	
	public MyResgirationAdapter() {
		// TODO Auto-generated constructor stub
	}
	public MyResgirationAdapter(List<String> data,Context context){
		this.context=context;
		this.data=data;
		inflater=LayoutInflater.from(context);
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(view==null){
			view=inflater.inflate(R.layout.list_my_regiration_item, null);
			holder=new ViewHolder();
			holder.imageView=(ImageView)view.findViewById(R.id.my_regitation_image);
			holder.textView=(TextView)view.findViewById(R.id.title_text);
			holder.textView2=(TextView)view.findViewById(R.id.second_text);
			holder.textView3=(TextView)view.findViewById(R.id.three_text);
			holder.textView4=(TextView)view.findViewById(R.id.time_text);
			view.setTag(holder);
			
		}
		holder=(ViewHolder)view.getTag();
		holder.imageView.setBackgroundDrawable(view.getResources().getDrawable(R.drawable.my_regitation_image_one));
		holder.textView.setText("二胡八段干货讲座");
		holder.textView2.setText("汉昌IT岗前实训中心");
		holder.textView3.setText("02-01 上午 9：00");
		holder.textView4.setText("余5天");
		return view;
	}
	class ViewHolder{
		ImageView imageView;
		TextView textView;
		TextView textView2;
		TextView textView3;
		TextView textView4;
		
	}

}
