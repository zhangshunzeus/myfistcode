package com.zhangshun.activity;

import com.example.appferal.R;
import com.zhangshun.fragment.ClassifyFragment;
import com.zhangshun.fragment.HomeFragment;
import com.zhangshun.fragment.PersonalFragment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class FragmentActivity extends Activity {
	
	HomeFragment homeFragment = new HomeFragment();
	ClassifyFragment classifyFragment = new ClassifyFragment();
	PersonalFragment personalFragment = new PersonalFragment();
	RadioGroup radioGroup;
	@SuppressLint("NewApi")
	FragmentManager fragmentManager = getFragmentManager();

	@SuppressLint({ "NewApi", "CommitTransaction" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.commit();
		
	}
	
	OnCheckedChangeListener checkedChangeListener = new OnCheckedChangeListener() {

		@SuppressLint("NewApi")
		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			
			switch (group.getCheckedRadioButtonId()) {
		
			case R.id.home_page:
				fragmentTransaction.show(homeFragment);
				fragmentTransaction.hide(classifyFragment);
				fragmentTransaction.hide(personalFragment);
				fragmentTransaction.commit();
				break;
				
			case R.id.classify:
				fragmentTransaction.hide(homeFragment);
				fragmentTransaction.show(classifyFragment);
				fragmentTransaction.hide(personalFragment);
				fragmentTransaction.commit();
				break;
				
			case R.id.me:
				fragmentTransaction.hide(homeFragment);
				fragmentTransaction.hide(classifyFragment);
				fragmentTransaction.show(personalFragment);
				fragmentTransaction.commit();
				break;
				
			case R.id.circle:
				fragmentTransaction.hide(homeFragment);
				fragmentTransaction.hide(classifyFragment);
				fragmentTransaction.hide(personalFragment);
				fragmentTransaction.commit();
				
			default:
				break;
			}
			
		}
	};
		
}
