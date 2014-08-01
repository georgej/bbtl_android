/**   
* @Title: ClassListActivity.java 
* @Package com.ffapp.bbtimeline.executive.activity 
* @Description: 学校管理activity
* @author www.5fapp.com
* @date 2014-6-6 下午4:36:04 
* @version V1.0   
*/
package com.ffapp.bbtimeline.tenant.bbtlclass.activity;

import java.util.ArrayList;

import com.ffapp.bbtimeline.common.base.BaseActivity;
import com.ffapp.bbtimeline.common.domain.BBTLClass;
import com.ffapp.bbtimeline.tenant.R;
import com.ffapp.bbtimeline.tenant.activity.MainActivity;
import com.ffapp.bbtimeline.tenant.bbtlclass.adapter.ClassAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @ClassName: classListActivity 
 * @Description: 老师管理activity
 * @author jiangzhiqi
 *
 */
public class ClassListActivity extends BaseActivity  {

	private final String TAG="ClassListActivity";
	private ListView classListView;
	private ArrayList<BBTLClass> classItems;
	private TextView titleName;//标题名
	private Button title_btn_right;
	private ImageView title_btn_back;

	public ClassListActivity() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * <p>Title: onCreate</p> 
	 * <p>Description: </p> 
	 * @param savedInstanceState 
	 * @see android.app.Activity#onCreate(android.os.Bundle) 
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.class_list);
		initData();
		
		classListView = (ListView)findViewById(R.id.classList);
		classListView.setAdapter(new ClassAdapter(this, classItems));
		
		classListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(ClassListActivity.this, "你当前选择了第"+arg2+"个item", Toast.LENGTH_SHORT).show();
				Intent intent=new Intent(ClassListActivity.this,ClassInfoActivity.class);
				startActivity(intent);
			}
			
		});
		
		title_btn_right=(Button)findViewById(R.id.title_btn_right1);
		title_btn_right.setText(R.string.createNew_btn);//创建新分校
		titleName = (TextView)findViewById(R.id.title_txt1);
		titleName.setText(R.string.classManagerString);
		
		title_btn_back = (ImageView)findViewById(R.id.title_btn_left);
		title_btn_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ClassListActivity.this.finish();
			}
		});
		
		
//		SimpleAdapter classDataAdapter = new SimpleAdapter(this,list,android.R.layout.simple_expandable_list_item_2, null, null);
		
//		classListView.setAdapter(classDataAdapter);
//		classListView.setItem
		
		
	}
	private void initData(){
		classItems = new ArrayList<BBTLClass>();
		BBTLClass bbtlClass=new BBTLClass();
		bbtlClass.setTenantId(123456);
		bbtlClass.setId(123);
		bbtlClass.setName("蒋志奇2222");
		bbtlClass.setAddress("18610871086");
		bbtlClass.setSlogan("小孩补习第一品牌，快速提高成绩");
		classItems.add(bbtlClass);
		
		bbtlClass=new BBTLClass();
		bbtlClass.setTenantId(123456);
		bbtlClass.setId(124);
		bbtlClass.setName("佟金鑫3333");
		bbtlClass.setAddress("38410871086");
		bbtlClass.setSlogan("快速提高成绩");
		classItems.add(bbtlClass);
		
		bbtlClass=new BBTLClass();
		bbtlClass.setTenantId(123456);
		bbtlClass.setId(124);
		bbtlClass.setName("佟金句4444");
		bbtlClass.setAddress("38410871086");
		bbtlClass.setSlogan("快速提高成绩");
		classItems.add(bbtlClass);
		
		bbtlClass=new BBTLClass();
		bbtlClass.setTenantId(123456);
		bbtlClass.setId(124);
		bbtlClass.setName("蒋柏宇5555");
		bbtlClass.setAddress("38410871086");
		bbtlClass.setSlogan("快速提高成绩");
		classItems.add(bbtlClass);
	}
	public void backToMain(View view) {
		Intent intent = new Intent(ClassListActivity.this,MainActivity.class);
		startActivity(intent);
	}

	/* (non-Javadoc)
	 * <p>Title: setContentLayout</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#setContentLayout() 
	*/
	@Override
	public void setContentLayout() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * <p>Title: dealLogicBeforeInitView</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#dealLogicBeforeInitView() 
	*/
	@Override
	public void dealLogicBeforeInitView() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * <p>Title: initView</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#initView() 
	*/
	@Override
	public void initView() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * <p>Title: dealLogicAfterInitView</p> 
	 * <p>Description: </p>  
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#dealLogicAfterInitView() 
	*/
	@Override
	public void dealLogicAfterInitView() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * <p>Title: onClickEvent</p> 
	 * <p>Description: </p> 
	 * @param view 
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#onClickEvent(android.view.View) 
	*/
	@Override
	public void onClickEvent(View view) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * <p>Title: onItemClick</p> 
	 * <p>Description: </p> 
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3 
	 * @see android.widget.AdapterView.OnItemClickListener#onItemClick(android.widget.AdapterView, android.view.View, int, long) 
	*/
//	@Override
//	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//		// TODO Auto-generated method stub
//		//Toast.makeText(this, "你当前点击了第"+arg2+"个item", Toast.LENGTH_SHORT).show();
//	}
	

}
