package com.example.appferal;

import com.zhangshun.chengkezhangshunproject.HomePageActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends Activity {
	Button btn,register_btn,password_btn;
	ImageView back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		btn = (Button) findViewById(R.id.login_butn);
		btn.setOnClickListener(l);
		register_btn=(Button) findViewById(R.id.register_btn);
		register_btn.setOnClickListener(l);
		password_btn=(Button) findViewById(R.id.password_btn);
		password_btn.setOnClickListener(l);
		back=(ImageView) findViewById(R.id.fanhui);
		back.setOnClickListener(l);
	}

	OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.login_butn:
				Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
				startActivity(intent);
				break;
			case R.id.register_btn:
				Intent inten = new Intent(LoginActivity.this, RegisterPhoneActicity.class);
				startActivity(inten);
				break;
			case R.id.password_btn:
				Intent intents = new Intent(LoginActivity.this, SetPasswordActivity.class);
				startActivity(intents);
				break;
			case R.id.fanhui:
				Intent fanhui = new Intent(LoginActivity.this, Login_registerActivity.class);
				startActivity(fanhui);
				break;
			default:
				break;
			}
		}
	};
}
