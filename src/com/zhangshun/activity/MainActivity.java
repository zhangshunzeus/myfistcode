package com.zhangshun.activity;

import com.example.appferal.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button butto;
	private int bdi[] = { R.id.main_1_bt, R.id.main_2_bt, R.id.main_3_bt, R.id.main_4_bt, R.id.main_5_bt,
			R.id.main_6_bt, R.id.main_7_bt };
	private Intent intent;
	private String bName[] = { "我的报名记录", "音乐种类", "我的储藏", "音乐课程" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		for (int i = 0; i < bdi.length; i++) {
			butto = (Button) findViewById(bdi[i]);
			butto.setOnClickListener(listener);
			if (i < 4) {
				butto.setText(bName[i]);
			}
		}
		intent = new Intent();
	}

	private OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.main_1_bt:
				intent.setClass(MainActivity.this, MySignRecord.class);
				startActivity(intent);
				break;
			case R.id.main_2_bt:
				intent.setClass(MainActivity.this, Musical_class.class);
				startActivity(intent);
				break;
			case R.id.main_3_bt:
				intent.setClass(MainActivity.this, MyStor.class);
				startActivity(intent);
				break;
			case R.id.main_4_bt:
				intent.setClass(MainActivity.this, MusicCorse.class);
				startActivity(intent);
				break;
			case R.id.main_5_bt:

				break;
			case R.id.main_6_bt:

				break;
			case R.id.main_7_bt:

				break;

			default:
				break;
			}
		}
	};
}
