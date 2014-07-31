/**
 * 版权所有：北京五指云峰科技有限公司
 * 
 */
package com.ffapp.bbtimeline.tenant.activity;

import com.ffapp.bbtimeline.tenant.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;

/**
 * 欢迎类，3秒美图欣赏，后期可做盈利广告.
 * 
 * @author jiangzhiqi
 * 
 */
public class WelcomeActivity extends Activity {
	private SharedPreferences preferences;
	private int DelayTime = 3000; // 欢迎界面时间

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 全屏设置，隐藏窗口所有装饰
		// getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题

		// 在<activity中配置一次，就不用上面的2句话了：
		// android:theme="@android:style/Theme.NoTitleBar.Fullscreen"

		setContentView(R.layout.activity_welcome);

		// 测试当前屏幕像素值
		// DisplayMetrics dm = new DisplayMetrics();
		// getWindowManager().getDefaultDisplay().getMetrics(dm);
		// int width = dm.widthPixels;
		// int height = dm.heightPixels;
		// System.out.println("width = " + width);
		// System.out.println("height = " + height);

		// 定时3s之后，关闭广告，跳转到主界面
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = null;

				// 判断跳转：第一次进入教程界面，非第一次进入主界面
				preferences = getSharedPreferences("FirstUse",
						Context.MODE_PRIVATE);
				Boolean firstUse = preferences.getBoolean("FirstUse", true);
				if (firstUse) {
					intent = new Intent(WelcomeActivity.this,
							NewbieGuideActivity.class);
				} else {
					intent = new Intent(WelcomeActivity.this,
							MainActivity.class);
				}
				WelcomeActivity.this.startActivity(intent);
				WelcomeActivity.this.finish();
			}
		}, DelayTime);
	}

}
