/**
 * 版权所有：北京五指云峰科技有限公司
 */
package com.ffapp.bbtimeline.tenant.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ffapp.bbtimeline.tenant.R;
import com.ffapp.bbtimeline.tenant.R.layout;
import com.ffapp.bbtimeline.tenant.R.menu;
import com.ffapp.bbtimeline.tenant.school.activity.SchoolListActivity;

import android.os.Bundle;
import android.R.anim;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
/**
 * 主界面，首页
 * @author jiangzhiqi
 *
 */
public class MainActivity extends Activity {

	
//	private ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
	}

	public void onBtnSchoolMClick(View view) {
//		Toast.makeText(this, "onBtnSchoolMClick clicked!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(MainActivity.this,SchoolListActivity.class);
		startActivity(intent);
	}
	public void onBtnTeacherMClick(View view) {
		Toast.makeText(this, "onBtnTeacherMClick clicked!", Toast.LENGTH_SHORT).show();
	}
	public void onBtnStudentMClick(View view) {
		Toast.makeText(this, "onBtnStudentMClick clicked!", Toast.LENGTH_SHORT).show();
	}
	public void onBtnAskMClick(View view) {
		Toast.makeText(this, "onBtnAskMClick clicked!", Toast.LENGTH_SHORT).show();
	}
	public void onBtnClassMClick(View view) {
		Toast.makeText(this, "onBtnClassMClick clicked!", Toast.LENGTH_SHORT).show();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
