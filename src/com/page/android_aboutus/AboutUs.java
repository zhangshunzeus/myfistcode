package com.page.android_aboutus;


import com.example.appferal.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class AboutUs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about_us);
	}

}
