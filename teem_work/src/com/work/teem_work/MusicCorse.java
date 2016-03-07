package com.work.teem_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import adpter.MusicClassAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
/**
 * 音乐课程
 * @author jkqme
 *
 */
public class MusicCorse extends Activity {
	private ImageView img[] = new ImageView[3];
	private ImageView topTrange;
	private ImageView bottomTrange;
	private int id[] = { R.id.music_corse_img, R.id.music_corse_img1,
			R.id.music_corse_img2 };
	private ListView listview;
	private ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	private MusicClassAdapter adpter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music_corse);
		for (int i = 0; i < id.length; i++) {
			img[i] = (ImageView) findViewById(id[i]);
			img[i].setOnClickListener(listener);
		}
		listview = (ListView) findViewById(R.id.music_corse_lv);
		getList();
		adpter = new MusicClassAdapter(list, this);
		listview.setAdapter(adpter);
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
			case R.id.music_corse_img:

				break;
			case R.id.music_corse_img1:

				break;
			case R.id.music_corse_img2:

				break;

			default:
				break;
			}
		}
	};
}
