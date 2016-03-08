package com.xiaozhang.myferal;

import com.example.appferal.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SortFragmentBListviewAdapter extends BaseAdapter {
	
	private String[] data;
	private Context context;
	public SortFragmentBListviewAdapter(Context context,String[] data){
		this.data=data;
		this.context=context;	
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data==null?0:data.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return data[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ViewHolder viewholder;
		if(arg1==null){
			viewholder=new ViewHolder();
			arg1=LayoutInflater.from(context).inflate(R.layout.sort_listview_item, null);
			viewholder.list_item_text=(TextView) arg1.findViewById(R.id.list_item_text);
		    arg1.setTag(viewholder);
		}
		viewholder=(ViewHolder) arg1.getTag();
		viewholder.list_item_text.setText(data[arg0]);
		return arg1;
	}
	 public static class ViewHolder{
	        private TextView list_item_text;
	       


	    }

}
