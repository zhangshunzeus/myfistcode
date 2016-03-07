package com.page.android_set;

import com.page.android_feral.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Set_feral extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_feral);
	}

}
