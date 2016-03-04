package com.page.android_post_details;

import java.util.List;

import com.page.android_feral.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PostDetailsAdapter extends BaseAdapter {
	List<String> data;
	Context context;
	LayoutInflater inflatyer;
	
	public PostDetailsAdapter() {
		// TODO Auto-generated constructor stub
	}
	public PostDetailsAdapter(List<String> data,Context context){
		this.context=context;
		this.data=data;
		inflatyer=LayoutInflater.from(context);
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
		if (view==null) {
			view=inflatyer.inflate(R.layout.list_post_details_item, null);
			holder=new ViewHolder();
			holder.imageView=(ImageView)view.findViewById(R.id.post_details_pinglun_img);
			holder.textViewPingLunContent=(TextView)view.findViewById(R.id.post_details_pinglun_content);
			holder.textViewPingLunName=(TextView)view.findViewById(R.id.post_details_pinglun_textname);
			holder.textViewPingLunTime=(TextView)view.findViewById(R.id.post_details_pinglun_time);
			view.setTag(holder);
			
		}
		holder=(ViewHolder)view.getTag();
		holder.imageView.setBackgroundDrawable(view.getResources().getDrawable(R.drawable.share_bg_right));
		holder.textViewPingLunName.setText("小鸟");
		holder.textViewPingLunContent.setText("还真是.......撒旦法撒旦飞洒阿斯蒂芬");
		holder.textViewPingLunTime.setText("2015-12-4");
		
		return view;
	}
	
	class ViewHolder{
		ImageView imageView;
		TextView textViewPingLunName;
		TextView textViewPingLunContent;
		TextView textViewPingLunTime;
	}

}
