package com.page.android_circle;

import java.util.List;

import com.page.android_feral.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Circle_Adapter extends BaseAdapter {
	List<String> data;
	Context context;
	LayoutInflater inflater;
	public Circle_Adapter(){
		
	}
	public Circle_Adapter(List<String> data,Context context){
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

	@SuppressLint("InflateParams")
	@SuppressWarnings("deprecation")
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(view==null){
			view=inflater.inflate(R.layout.list_circle_item, null);
			holder=new ViewHolder();
			holder.imageView=(ImageView)view.findViewById(R.id.title_image);
			holder.textView=(TextView)view.findViewById(R.id.title_text);
			holder.textView2=(TextView)view.findViewById(R.id.second_text);
			holder.imageView2=(ImageView)view.findViewById(R.id.second_image);
			holder.textView3=(TextView)view.findViewById(R.id.three_text);
			view.setTag(holder);
			
		}
		holder=(ViewHolder)view.getTag();
		holder.imageView.setBackgroundDrawable(view.getResources().getDrawable(R.drawable.rub_course_build_posts_non_sel));
		holder.textView.setText("ͬ同城英语圈");
		holder.textView2.setText("热爱英语，疯狂英语");
		holder.imageView2.setBackgroundDrawable(view.getResources().getDrawable(R.drawable.rub_course_group_person_number));
		holder.textView3.setText("1050");
		return view;
	}
	
	class ViewHolder{
		ImageView imageView;
		ImageView imageView2;
		TextView textView;
		TextView textView2;
		TextView textView3;
	}

}
