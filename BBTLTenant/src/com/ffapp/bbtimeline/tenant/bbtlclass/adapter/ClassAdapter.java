/**   
* @Title: ClassAdapter.java 
* @Package com.ffapp.bbtimeline.tenant.bbtlclass.adapter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author www.5fapp.com
* @date 2014-7-13 下午1:20:43 
* @version V1.0   
*/
package com.ffapp.bbtimeline.tenant.bbtlclass.adapter;

import java.util.List;

import com.ffapp.bbtimeline.common.domain.BBTLClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @ClassName: classAdapter 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author jiangzhiqi
 *
 */
public class ClassAdapter extends BaseAdapter {
	private LayoutInflater mLayoutInflater;
	private ViewHolder viewHolder;
	private List<BBTLClass> classList;
	private Context context;
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ClassAdapter(Context context,List<BBTLClass> messages) {
		this.mLayoutInflater = LayoutInflater.from(context);
		this.context = context;
		this.classList = messages;
	}

	/* (non-Javadoc)
	 * <p>Title: getCount</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see android.widget.Adapter#getCount() 
	 */
	@Override
	public int getCount() {
		if(classList==null){
			return 0;
		}
		return classList.size();
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
		return classList.get(position);
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
			convertView = mLayoutInflater.inflate(com.ffapp.bbtimeline.tenant.R.layout.class_list_item, null);
			viewHolder.shortName = (TextView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.class_shortName);
			viewHolder.address = (TextView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.class_address);
			viewHolder.slogan = (TextView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.class_slogan);
			viewHolder.logo_s = (ImageView) convertView.findViewById(com.ffapp.bbtimeline.tenant.R.id.class_logo_s);
			convertView.setTag(viewHolder);
		}else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		BBTLClass bbtlclass = classList.get(position);
	     viewHolder.shortName.setText(bbtlclass.getName());
	     viewHolder.address.setText(bbtlclass.getName());
	     viewHolder.slogan.setText(bbtlclass.getName());
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
