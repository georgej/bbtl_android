package com.ffapp.bbtimeline.tenant.school.activity;

import com.ffapp.bbtimeline.tenant.R;
import com.ffapp.bbtimeline.tenant.R.layout;
import com.ffapp.bbtimeline.tenant.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SchoolModifyInfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_info_modify);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.school_modify_info, menu);
		return true;
	}

}
