package com.page.android_my_resgiration;

import java.util.ArrayList;
import java.util.List;

import com.example.appferal.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class MyResgiration extends Activity{
	MyResgirationAdapter myResgirationAdapter;
	List<String> data;
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.my_regiration);
		listView=(ListView)findViewById(R.id.list_my_regiration);
		getData();
		myResgirationAdapter=new MyResgirationAdapter(data,MyResgiration.this);
		listView.setAdapter(myResgirationAdapter);
		
	}
	public void getData(){
		data=new ArrayList<String>();
		data.add("");
		data.add("");
		data.add("");
		
	}

}
