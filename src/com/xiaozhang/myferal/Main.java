package com.xiaozhang.myferal;


import com.example.appferal.R;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
 
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
   
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                intent = new Intent(Main.this, OneSigned.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(Main.this, TwoMessage.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(Main.this, ThreeMyPosts.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent = new Intent(Main.this, FourPostsRecord.class);
                startActivity(intent);
                break;
            case R.id.button5:
                intent = new Intent(Main.this, FistActivity.class);
                startActivity(intent);
                break;
           

        }

    }
}
