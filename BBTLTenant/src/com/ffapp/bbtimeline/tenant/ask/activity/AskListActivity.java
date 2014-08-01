/**   
* @Title: AskListActivity.java 
* @Package com.ffapp.bbtimeline.executive.activity 
* @Description: 学校管理activity
* @author www.5fapp.com
* @date 2014-6-6 下午4:36:04 
* @version V1.0   
*/
package com.ffapp.bbtimeline.tenant.ask.activity;

import java.util.ArrayList;

import com.ffapp.bbtimeline.common.base.BaseActivity;
import com.ffapp.bbtimeline.common.domain.BBTLStudent;
import com.ffapp.bbtimeline.tenant.R;
import com.ffapp.bbtimeline.tenant.activity.MainActivity;
import com.ffapp.bbtimeline.tenant.ask.adapter.AskAdapter;

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
 * @ClassName: askListActivity 
 * @Description: 老师管理activity
 * @author jiangzhiqi
 *
 */
public class AskListActivity extends BaseActivity  {

	private final String TAG="askListActivity";
	private ListView askListView;
	private ArrayList<BBTLStudent> studentItems;
	private TextView titleName;//标题名
	private Button title_btn_right;
	private ImageView title_btn_back;

	public AskListActivity() {
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
		setContentView(R.layout.ask_list);
		initData();
		
		askListView = (ListView)findViewById(R.id.askList);
		askListView.setAdapter(new AskAdapter(this, studentItems));
		
		askListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(AskListActivity.this, "你当前选择了第"+arg2+"个item", Toast.LENGTH_SHORT).show();
				Intent intent=new Intent(AskListActivity.this,AskInfoActivity.class);
				startActivity(intent);
			}
			
		});
		
		title_btn_right=(Button)findViewById(R.id.title_btn_right1);
		title_btn_right.setText(R.string.createNew_btn);//创建新分校
		titleName = (TextView)findViewById(R.id.title_txt1);
		titleName.setText(R.string.askManagerString);
		
		title_btn_back = (ImageView)findViewById(R.id.title_btn_left);
		title_btn_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AskListActivity.this.finish();
			}
		});
		
		
//		SimpleAdapter askDataAdapter = new SimpleAdapter(this,list,android.R.layout.simple_expandable_list_item_2, null, null);
		
//		askListView.setAdapter(askDataAdapter);
//		askListView.setItem
		
		
	}
	private void initData(){
		studentItems = new ArrayList<BBTLStudent>();
		BBTLStudent ask=new BBTLStudent();
		ask.setTenantId(123456);
		ask.setId(123);
		ask.setName("蒋志奇2222");
		ask.setAddress("18610871086");
		ask.setSlogan("小孩补习第一品牌，快速提高成绩");
		studentItems.add(ask);
		
		ask=new BBTLStudent();
		ask.setTenantId(123456);
		ask.setId(124);
		ask.setName("佟金鑫3333");
		ask.setAddress("38410871086");
		ask.setSlogan("快速提高成绩");
		studentItems.add(ask);
		
		ask=new BBTLStudent();
		ask.setTenantId(123456);
		ask.setId(124);
		ask.setName("佟金句4444");
		ask.setAddress("38410871086");
		ask.setSlogan("快速提高成绩");
		studentItems.add(ask);
		
		ask=new BBTLStudent();
		ask.setTenantId(123456);
		ask.setId(124);
		ask.setName("蒋柏宇5555");
		ask.setAddress("38410871086");
		ask.setSlogan("快速提高成绩");
		studentItems.add(ask);
	}
	public void backToMain(View view) {
		Intent intent = new Intent(AskListActivity.this,MainActivity.class);
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
