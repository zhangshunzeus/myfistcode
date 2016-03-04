package com.zhangshun.chengkezhangshunproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;

public class ClassifyActivity extends Activity {

	Button btn;
	LinearLayout linearLayout;
	String[] btnArray = new String[] {"钢琴","打击乐器","弦乐器"};
	private RelativeLayout mInfo;
	private int bubble_num;
	private Button[] buttonA;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classify);

		linearLayout = (LinearLayout) findViewById(R.id.course_linear);
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);

		for (int i = 0; i < btnArray.length; i++) {
			Button button = new Button(this);
			button.setLayoutParams(layoutParams);
			button.setText(btnArray[i]);
			button.setOnClickListener(new MyOnClickListener());
			layoutParams = new LinearLayout.LayoutParams(80, 30);
			layoutParams.leftMargin = 20 + 19 * i;
			layoutParams.topMargin = 16 + 10 * i;
			linearLayout.addView(button);
		}

		/*for (int i = 0; i < bubble_num; i++) {
			mInfo = new RelativeLayout(this);
			Button bt = new Button(this);
			buttonA[i] = bt;
			RelativeLayout.LayoutParams btParams = new RelativeLayout.LayoutParams(80, 30); // button的宽高
			btParams.leftMargin = 20 + 19 * i; // 定位
			btParams.topMargin = 16 + 10 * i; // 定位
			mInfo.addView(bt, btParams);
		}
		
		//  你用for循环按照上面来加BUTTON控件应该是行的通的。 设置监听：

		for (int i = 0; i < buttonA.length; i++) {
			final int n = i;
			buttonA[n].setOnClickListener(new Button.OnClickListener() {
				public void onClick(View v) {
				}
			});
		}*/

	}

	class MyOnClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	}

}
