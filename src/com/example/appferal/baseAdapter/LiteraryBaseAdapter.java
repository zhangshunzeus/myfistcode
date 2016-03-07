package com.example.appferal.baseAdapter;

import java.util.ArrayList;

import com.example.appferal.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LiteraryBaseAdapter extends BaseAdapter {

	ArrayList<LiteraryInfo> list;
	Context context;
	LayoutInflater inflater;

	public LiteraryBaseAdapter(ArrayList<LiteraryInfo> list, Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.list = list;
		inflater = LayoutInflater.from(context);
	}

	public void setData(ArrayList<LiteraryInfo> list) {
		this.list = list;
		this.notifyDataSetChanged();
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
		ViewHolder holder;
		if(convertView==null){
			convertView=inflater.inflate(R.layout.literary_listview_item, null);
			holder=new ViewHolder();
			holder.name=(TextView)convertView.findViewById(R.id.name);
			holder.conntent=(TextView)convertView.findViewById(R.id.conntent);
			holder.user_id=(TextView)convertView.findViewById(R.id.user_id);
			holder.user_numb=(TextView)convertView.findViewById(R.id.user_numb);
			holder.time=(TextView)convertView.findViewById(R.id.time);
			holder.time_text=(TextView)convertView.findViewById(R.id.time_text);
			convertView.setTag(holder);
		}
		holder=(ViewHolder) convertView.getTag();
		LiteraryInfo info=(LiteraryInfo) getItem(position);
		holder.name.setText(info.getName());
		holder.conntent.setText(info.getConntent());
		holder.user_id.setText(info.getUser_id());
		holder.user_numb.setText(info.getUser_numb());
		holder.time.setText(info.getTime());
		holder.time_text.setText(info.getTime_text());
		return convertView;
	}
	
	class ViewHolder{
		TextView name;
		TextView conntent;
		TextView user_id;
		TextView user_numb;
		TextView time;
		TextView time_text;
	}
	

}
