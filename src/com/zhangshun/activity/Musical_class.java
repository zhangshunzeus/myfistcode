package com.zhangshun.activity;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.appferal.R;
import com.zhangshun.adapter.MusicClassAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
/**
 * 音乐种类
 * @author jkqme
 *
 */
public class Musical_class extends Activity {
	private TextView quanbu;
	private TextView gangqing;
	private TextView dajiyueqi;
	private TextView yunyue;
	private TextView guanyue;
	private GridView musicGrid;
	private Button back;
	private ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	private MusicClassAdapter adpter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music_class);
		loadVary();
	}

	private void loadVary() {
		quanbu = (TextView) findViewById(R.id.my_music_class_quanbu_tx);
		gangqing = (TextView) findViewById(R.id.my_music_class_gangqing_tx);
		dajiyueqi = (TextView) findViewById(R.id.my_music_class_dajiyue_tx);
		yunyue = (TextView) findViewById(R.id.my_music_class_yuanyue_tx);
		guanyue = (TextView) findViewById(R.id.my_music_class_guanyue_tx);
		musicGrid = (GridView) findViewById(R.id.my_music_class_gv);

		quanbu.setOnClickListener(listener);
		gangqing.setOnClickListener(listener);
		dajiyueqi.setOnClickListener(listener);
		yunyue.setOnClickListener(listener);
		guanyue.setOnClickListener(listener);
		getList();
		adpter = new MusicClassAdapter(list, this);
		musicGrid.setAdapter(adpter);
	}

	private void getList() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("img", R.drawable.ic_launcher);
		map.put("text1", "二胡十段兴趣班");
		map.put("text2", "已报一人");
		map.put("text2_1", "渝中汉昌");
		map.put("text3", "乐器");
		map.put("text3_1", "小学");
		map.put("text4", "3");
		list.add(map);
		list.add(map);
		list.add(map);
		list.add(map);
	}

	private OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.my_music_class_quanbu_tx:

				break;
			case R.id.my_music_class_gangqing_tx:

				break;
			case R.id.my_music_class_dajiyue_tx:

				break;
			case R.id.my_music_class_yuanyue_tx:

				break;
			case R.id.my_music_class_guanyue_tx:

				break;

			default:
				break;
			}
		}
	};
}
