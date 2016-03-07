package com.example.appferal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegisterPhoneActicity extends Activity {
	Button next;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_phone);
		next=(Button) findViewById(R.id.next);
		next.setOnClickListener(l);
	}
	OnClickListener l=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.next:
				Intent intent = new Intent(RegisterPhoneActicity.this, RegisterInfoActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};
}
