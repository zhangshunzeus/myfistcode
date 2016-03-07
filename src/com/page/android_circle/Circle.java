package com.page.android_circle;

import java.util.ArrayList;
import java.util.List;

import com.example.appferal.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;

public class Circle extends Activity {
	List<String> data;
	Circle_Adapter circle_adapter;
	ListView listView;
	Button buttonMain;
	Button buttonClassification;
	Button buttonCircle;
	Button buttonMe;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.circle);
		listView = (ListView) findViewById(R.id.list_circle);
		getData();
		circle_adapter = new Circle_Adapter(data, Circle.this);
		listView.setAdapter(circle_adapter);

		buttonMain = (Button) findViewById(R.id.button_intent_main);
		buttonMain.setOnClickListener(onClickListener);
		buttonMain = (Button) findViewById(R.id.button_intent_classification);
		buttonClassification.setOnClickListener(onClickListener);
		buttonCircle = (Button) findViewById(R.id.button_intent_circle);
		buttonCircle.setOnClickListener(onClickListener);
		buttonMe = (Button) findViewById(R.id.button_intent_me);
		buttonMe.setOnClickListener(onClickListener);
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			switch (arg0.getId()) {
			case R.id.button_intent_main:
				Intent intentMain=new Intent();
				startActivity(intentMain);
				break;
			case R.id.button_intent_classification:
				Intent intentClassification=new Intent();
				startActivity(intentClassification);
				break;
			case R.id.button_intent_circle:
				Intent intentCircle=new Intent();
				startActivity(intentCircle);
				break;
			case R.id.button_intent_me:
				Intent intentMe=new Intent();
				startActivity(intentMe);
				break;

			default:
				break;
			}
		}

	};

	public void getData() {
		data = new ArrayList<String>();
		data.add("");
		data.add("");
		data.add("");

	}

}
