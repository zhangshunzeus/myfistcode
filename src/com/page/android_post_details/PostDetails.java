package com.page.android_post_details;

import java.util.ArrayList;
import java.util.List;

import com.page.android_feral.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class PostDetails extends Activity{
	List<String> data;
	ListView listView;
	PostDetailsAdapter postDetailsAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.post_details);
		listView=(ListView)findViewById(R.id.list_post_details);
		getData();
		postDetailsAdapter=new PostDetailsAdapter(data,PostDetails.this);
		listView.setAdapter(postDetailsAdapter);
	}
	
	public void getData(){
		
		data=new ArrayList<String>();
		data.add("");
		data.add("");
		
	}
    
}
