package com.xiaozhang.myferal;

import com.example.appferal.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FourPostsRecord extends Activity {
    private ImageView back;
    private ImageView post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_posts_record);
        back= (ImageView) findViewById(R.id.posts_back_button);
        post= (ImageView) findViewById(R.id.posts_build_post_button);
      //back�¼��ļ���
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourPostsRecord.this,  "�����¼�", Toast.LENGTH_SHORT).show();
            }
        });
      //�������¼��ļ���
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourPostsRecord.this, "�������¼�", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
