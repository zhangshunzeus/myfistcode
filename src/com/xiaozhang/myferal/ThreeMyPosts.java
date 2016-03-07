package com.xiaozhang.myferal;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.appferal.R;


public class ThreeMyPosts extends Activity {
    private ImageView back;
    private ImageView post;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_my_posts);
        back= (ImageView) findViewById(R.id.posts_back_button);
        post= (ImageView) findViewById(R.id.posts_build_post_button);
        list= (ListView) findViewById(R.id.posts_listview);
       // ArrayList<Info> infoData=new ArrayList<Info>();
       // PostsListviewAdapter adapter=new PostsListviewAdapter(this,infoData);
        //调用死数据，以后更换
        
        //list.setAdapter(adapter);
      //数据源

        //back事件的监听
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThreeMyPosts.this, "返回事件", Toast.LENGTH_SHORT).show();
            }
        });
        //公布栏事件的监听
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThreeMyPosts.this, "公布栏事件", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
