package com.ffapp.bbtimeline.tenant.activity;

import com.ffapp.bbtimeline.tenant.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewbieGuideActivity extends Activity {

	private Button btnBegin;

	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newbieguide);
		
		
		btnBegin = (Button) this.findViewById(R.id.btnBegin);
		btnBegin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(NewbieGuideActivity.this, MainActivity.class);
				startActivity(intent);
				
				//改变 是否启用引导页的状态
				SharedPreferences preferences = getSharedPreferences("FirstUse", Context.MODE_PRIVATE);
				Editor editor = preferences.edit();
				editor.putBoolean("FirstUse", false);
				editor.commit();
				
				finish();
			}
		});
	};
}
