package com.example.appferal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login_registerActivity extends Activity {
	Button register;
	Button login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_register);
		register = (Button) findViewById(R.id.register);
		login = (Button) findViewById(R.id.login);

		register.setOnClickListener(listener);
		login.setOnClickListener(listener);

	}

	OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.register:
				Intent intent = new Intent(Login_registerActivity.this, RegisterPhoneActicity.class);
				startActivity(intent);
				break;
			case R.id.login:
				Intent intent1 = new Intent(Login_registerActivity.this, LoginActivity.class);
				startActivity(intent1);
				break;

			default:
				break;
			}
		}
	};
}
