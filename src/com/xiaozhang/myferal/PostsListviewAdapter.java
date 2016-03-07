package com.xiaozhang.myferal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.appferal.R;




/**
 * Created by zhang on 2016/3/3.
 */
public class PostsListviewAdapter extends BaseAdapter{
    private  Context context;
    private ArrayList<Info> infoData;
    LayoutInflater inflater;
    public PostsListviewAdapter(Context context,ArrayList<Info> infoData){
        this.context=context;
        this.infoData=infoData;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return infoData==null?0:infoData.size();
    }

    @Override
    public Object getItem(int position) {
        return infoData.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Info info=new Info();
        ViewHolder viewHolder=new ViewHolder();
        if(convertView==null){
            convertView= inflater.inflate(R.layout.item_posts_listview,null);
            viewHolder.title= (TextView) convertView.findViewById(R.id.item_post_listview_title);
            viewHolder.time= (TextView) convertView.findViewById(R.id.item_post_listview_time);
            viewHolder.comment= (TextView) convertView.findViewById(R.id.item_posts_listview_comment_text);
            viewHolder.praise= (TextView) convertView.findViewById(R.id.item_comment_listview_praise);
            convertView.setTag(viewHolder);

        }else{
            viewHolder= (ViewHolder) convertView.getTag();

        }
        //进行数据操作
       // viewHolder.title.setText();



        return convertView;
    }
    public static class ViewHolder{
        private TextView title;
        private TextView time;
        private TextView comment;
        private TextView praise;


    }
}
