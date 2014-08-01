/**   
* @Title: SchoolAdapter.java 
* @Package com.ffapp.bbtimeline.tenant.school.adapter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author www.5fapp.com
* @date 2014-7-13 下午1:20:43 
* @version V1.0   
*/
package com.ffapp.bbtimeline.tenant.student.adapter;

import java.util.List;

import com.ffapp.bbtimeline.common.domain.BBTLStudent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @ClassName: studentAdapter 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author jiangzhiqi
 *
 */
public class StudentAdapter extends BaseAdapter {
	private LayoutInflater mLayoutInflater;
	private ViewHolder viewHolder;
	private List<BBTLStudent> studentList;
	private Context context;
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public StudentAdapter(Context context,List<BBTLStudent> messages) {
		this.mLayoutInflater = LayoutInflater.from(context);
		this.context = context;
		this.studentList = messages;
	}

	/* (non-Javadoc)
	 * <p>Title: getCount</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see android.widget.Adapter#getCount() 
	 */
	@Override
	public int getCount() {
		if(studentList==null){
			return 0;
		}
		return studentList.size();
	}

	/* (non-Javadoc)
	 * <p>Title: getItem</p> 
	 * <p>Description: </p> 
	 * @param position
	 * @return 
	 * @see android.widget.Adapter#getItem(int) 
	 */
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return studentList.get(position);
	}

	/* (non-Javadoc)
	 * <p>Title: getItemId</p> 
	 * <p>Description: </p> 
	 * @param position
	 * @return 
	 * @see android.widget.Adapter#getItemId(int) 
	 */
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	/* (non-Javadoc)
	 * <p>Title: getView</p> 
	 * <p>Description: </p> 
	 * @param position
	 * @param convertView
	 * @param parent
	 * @return 
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup) 
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null) {
			viewHolder = new ViewHolder();
			convertView = mLayoutInflater.inflate(com.ffapp.bbtimeline.tenant.R.layout.student_list_item, null);
			viewHolder.shortName = (TextView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.student_shortName);
			viewHolder.address = (TextView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.student_address);
			viewHolder.slogan = (TextView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.student_slogan);
			viewHolder.logo_s = (ImageView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.student_logo_s);
			convertView.setTag(viewHolder);
		}else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		BBTLStudent student = studentList.get(position);
	     viewHolder.shortName.setText(student.getName());
	     viewHolder.address.setText(student.getName());
	     viewHolder.slogan.setText(student.getName());
	     viewHolder.logo_s.setImageResource(com.ffapp.bbtimeline.tenant.R.drawable.ic_launcher);
	     
		return convertView;
	}
	public final class ViewHolder{
		public ImageView logo_s;
		public TextView shortName;
		public TextView slogan;
		public TextView address;
		//public Button viewBtn;
	}
}
