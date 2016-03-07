package com.xiaozhang.myferal;

import com.example.appferal.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TwoMessage extends Activity{

    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_message);
        back= (ImageView) findViewById(R.id.posts_back_button);
        //返回的监听事件
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TwoMessage.this, "返回事件", Toast.LENGTH_SHORT).show();
            }
        });

    }




}

