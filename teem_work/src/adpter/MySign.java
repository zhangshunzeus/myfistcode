package adpter;

import java.util.ArrayList;
import java.util.HashMap;

import com.work.teem_work.R;

import android.R.drawable;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * 我的报名
 * @author jkqme
 *
 */
public class MySign extends BaseAdapter {
	ArrayList<HashMap<String, Object>> list;
	Context context;
	LayoutInflater inflater;
	Holder holder = new Holder();

	public MySign() {
		// TODO Auto-generated constructor stub
	}

	public MySign(ArrayList<HashMap<String, Object>> list, Context context) {
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
			convertView = inflater.inflate(R.layout.lv_my_sign_record, null);
			holder.img = (ImageView) convertView.findViewById(R.id.lv_my_sign_record_img);
			holder.text1 = (TextView) convertView.findViewById(R.id.lv_my_sign_record_1_tex);
			holder.text2 = (TextView) convertView.findViewById(R.id.lv_my_sign_record_2_1_tex);
			holder.text3 = (TextView) convertView.findViewById(R.id.lv_my_sign_record_3_tex);
			holder.text4 = (TextView) convertView.findViewById(R.id.lv_my_sign_record_4_tex);
			holder.text5 = (TextView) convertView.findViewById(R.id.lv_my_sign_record_5_tex);
			convertView.setTag(holder);
		}
		holder.img.setImageDrawable(context.getResources().getDrawable((Integer) list.get(position).get("img")));
		holder.text1.setText((String) list.get(position).get("text1"));
		holder.text2.setText((String) list.get(position).get("text2"));
		holder.text3.setText((String) list.get(position).get("text3"));
		holder.text4.setText((String) list.get(position).get("text4"));
		holder.text5.setText((String) list.get(position).get("text5"));
		holder = (Holder) convertView.getTag();
		// holder.img.setImageDrawable();

		return convertView;
	}

	class Holder {
		ImageView img;
		TextView text1;
		TextView text2;
		TextView text3;
		TextView text4;
		TextView text5;
	}

	

}
