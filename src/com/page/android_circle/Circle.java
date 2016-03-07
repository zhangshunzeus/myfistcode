package com.page.android_circle;


import java.util.ArrayList;
import java.util.List;

import com.page.android_feral.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class Circle extends Activity {
	List<String> data;
	Circle_Adapter circle_adapter;
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.circle);
		listView=(ListView)findViewById(R.id.list_circle);
		getData();
		circle_adapter=new Circle_Adapter(data,Circle.this);
		listView.setAdapter(circle_adapter);
	}
	public void getData(){
		data=new ArrayList<String>();
		data.add("");
		data.add("");
		data.add("");
		
		
	}

}
