package com.example.appferal;

import com.zhangshun.chengkezhangshunproject.HomePageActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegisterInfoActivity extends Activity {
	Button info_next,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_info);
		info_next=(Button) findViewById(R.id.info_next);
		info_next.setOnClickListener(l);
		back=(Button) findViewById(R.id.back);
		back.setOnClickListener(l);
		
	}
	OnClickListener l=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.info_next:
				Intent intent = new Intent(RegisterInfoActivity.this, HomePageActivity.class);
				startActivity(intent);
				break;
			case R.id.back:
				Intent inten = new Intent(RegisterInfoActivity.this, RegisterPhoneActicity.class);
				startActivity(inten);
				break;

			default:
				break;
			}
		}
	};
}
