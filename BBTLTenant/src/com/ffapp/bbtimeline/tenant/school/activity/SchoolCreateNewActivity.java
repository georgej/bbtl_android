package com.ffapp.bbtimeline.tenant.school.activity;

import com.ffapp.bbtimeline.common.base.BaseActivity;
import com.ffapp.bbtimeline.tenant.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SchoolCreateNewActivity extends BaseActivity {

	private TextView titleName;// 标题名
	private ImageView title_btn_back;

	private Button createNewBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_create_new);

		initTitle();
		createNewSchool();

	}

	private void initTitle(){
		titleName = (TextView) findViewById(R.id.title_txt1);
		titleName.setText(R.string.createNewSchool_btn);//
		findViewById(R.id.title_btn_right1).setVisibility(View.INVISIBLE);

		title_btn_back = (ImageView) findViewById(R.id.title_btn_left);
		title_btn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SchoolCreateNewActivity.this.finish();
			}
		});
	}
	private void createNewSchool() {
		// 新建安妮
		createNewBtn = (Button) findViewById(R.id.createNewBtn);
		createNewBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println(((EditText)findViewById(R.id.schoolName)).getText().toString());
			}
		});
	}

	public void changeLogoImage(View v) {
		System.out.println("变更logo图    ");
	}

	/*
	 * (non-Javadoc) <p>Title: setContentLayout</p> <p>Description: </p>
	 * 
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#setContentLayout()
	 */
	@Override
	public void setContentLayout() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc) <p>Title: dealLogicBeforeInitView</p> <p>Description: </p>
	 * 
	 * @see
	 * com.ffapp.bbtimeline.common.base.BaseActivity#dealLogicBeforeInitView()
	 */
	@Override
	public void dealLogicBeforeInitView() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc) <p>Title: initView</p> <p>Description: </p>
	 * 
	 * @see com.ffapp.bbtimeline.common.base.BaseActivity#initView()
	 */
	@Override
	public void initView() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc) <p>Title: dealLogicAfterInitView</p> <p>Description: </p>
	 * 
	 * @see
	 * com.ffapp.bbtimeline.common.base.BaseActivity#dealLogicAfterInitView()
	 */
	@Override
	public void dealLogicAfterInitView() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc) <p>Title: onClickEvent</p> <p>Description: </p>
	 * 
	 * @param view
	 * 
	 * @see
	 * com.ffapp.bbtimeline.common.base.BaseActivity#onClickEvent(android.view
	 * .View)
	 */
	@Override
	public void onClickEvent(View view) {
		// TODO Auto-generated method stub

	}
}
