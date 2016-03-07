package adpter;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.work.teem_work.R;

/**
 * musicClass and muxicCorse shar
 * 音乐类
 * @author Administrator
 * 
 */
public class MusicClassAdapter extends BaseAdapter {
	ArrayList<HashMap<String, Object>> list;
	Context context;
	LayoutInflater inflater;
	Holder holder = new Holder();

	public MusicClassAdapter() {
		// TODO Auto-generated constructor stub
	}

	public MusicClassAdapter(ArrayList<HashMap<String, Object>> list,
			Context context) {
		this.list = list;
		this.context = context;
		this.inflater = LayoutInflater.from(context);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.gv_my_music_class, null);
			holder.img = (ImageView) convertView
					.findViewById(R.id.gv_my_music_class_img);
			holder.text1 = (TextView) convertView
					.findViewById(R.id.gv_my_music_class_1_tx);

			holder.text2 = (TextView) convertView
					.findViewById(R.id.gv_my_music_class_2_tx);
			holder.text2_1 = (TextView) convertView
					.findViewById(R.id.gv_my_music_class_2_1_tx);

			holder.text3 = (TextView) convertView
					.findViewById(R.id.gv_my_music_class_3_tx);
			holder.text3_1 = (TextView) convertView
					.findViewById(R.id.gv_my_music_class_3_1_tx);

			holder.text4 = (TextView) convertView
					.findViewById(R.id.gv_my_music_class_4_1_tx);

			convertView.setTag(holder);
		}
		holder = (Holder) convertView.getTag();
		holder.img.setImageDrawable(convertView.getResources().getDrawable(
				(Integer) list.get(position).get("img")));
		// holder.img.setImageDrawable();
		holder.text1.setText((String) list.get(position).get("text1"));
		holder.text2.setText((String) list.get(position).get("text2"));
		holder.text2_1.setText((String) list.get(position).get("text2_1"));
		holder.text3.setText((String) list.get(position).get("text3"));
		holder.text3_1.setText((String) list.get(position).get("text3_1"));
		holder.text4.setText((String) list.get(position).get("text4"));
		return convertView;
	}

	class Holder {
		ImageView img;
		TextView text1;
		TextView text2;
		TextView text2_1;
		TextView text3;
		TextView text3_1;
		TextView text4;

	}

}
