package com.example.appferal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SetPasswordActivity extends Activity {
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setpassword);
		btn = (Button) findViewById(R.id.yes);
		btn.setOnClickListener(l);
	}

	OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.yes:
				Intent intent = new Intent(SetPasswordActivity.this, LoginActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};
}
