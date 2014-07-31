/**   
 * @Title: BaseActivity.java 
 * @Package com.ffapp.bbtimeline.common.base 
 * @Description: activity基础类封装：view层公用函数封装，抽象函数定义。 
 * @author www.5fapp.com
 * @date 2014-6-18 上午10:48:00 
 * @version V1.0   
 */
package com.ffapp.bbtimeline.common.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.WindowManager.BadTokenException;
import android.widget.Toast;

/**
 * @ClassName: BaseActivity
 * @Description: activity基础类封装：view层公用函数封装，抽象函数定义。
 * @author jiangzhiqi
 * 
 */
public abstract class BaseActivity extends Activity implements OnClickListener{
	public boolean isAllowFullScreen;//是否允许全屏
	public boolean hasMenu;//是否有菜单显示
	private ProgressDialog progressDialog;
	protected Resources resources;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		resources=getResources();
		if(isAllowFullScreen){
			setFullScreen(true);
		}else{
			setFullScreen(false);
		}
		setContentLayout();
		dealLogicBeforeInitView();
		initView();
		dealLogicAfterInitView();
		
	}
	
	/**
	 * 设置布局文件
	 */
	public abstract void setContentLayout();
	/**
	 * 在实例化布局之前处理的逻辑
	 */
	public abstract void dealLogicBeforeInitView();
	/**
	 * 实例化布局文件/组件
	 */
	public abstract void initView();
	/**
	 * 在实例化布局之后处理的逻辑
	 */
	public abstract void dealLogicAfterInitView();
	
	/**
	 * 得到屏幕宽度
	 * @return 宽度
	 */
	public int getScreenWidth() {
		DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        return screenWidth;
	}
	/**
	 * 得到屏幕高度
	 * @return 高度
	 */
	public int getScreenHeight() {
		DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenHeight = dm.heightPixels;
        return screenHeight;
	}
	
	/**
	 * 是否全屏和显示标题，true为全屏和无标题，false为无标题，请在setContentView()方法前调用
	 * @param fullScreen
	 */
	public void setFullScreen(boolean fullScreen) {
		if(fullScreen) {
			requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		} else {
			requestWindowFeature(Window.FEATURE_NO_TITLE);
		}
		
	}
    /**
     * 短时间显示Toast
     * @param info 显示的内容
     */
	public void showToast(String info) {
		Toast.makeText(this,info, Toast.LENGTH_SHORT).show();
	}
	/**
	 * 长时间显示Toast
	 * @param info 显示的内容
	 */
	public void showToastLong(String info) {
		Toast.makeText(this,info, Toast.LENGTH_LONG).show();
	}
	/**
     * 短时间显示Toast
     * @param info 显示的内容
     */
	public void showToast(int resId){
		Toast.makeText(this,resId, Toast.LENGTH_SHORT).show();
	}
	/**
	 * 长时间显示Toast
	 * @param info 显示的内容
	 */
	public void showToastLong(int resId){
		Toast.makeText(this,resId, Toast.LENGTH_LONG).show();
	}
	/**
	 * onClick方法的封装，在此方法中处理点击
	 * @param view 被点击的View对象
	 */
	abstract public void onClickEvent(View view);
	
	
	
	@Override
	public void onClick(View v) {
		onClickEvent(v);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	
	/**
	 * 显示正在加载的进度条
	 * 
	 */
	public void showProgressDialog(){
		if(progressDialog != null && progressDialog.isShowing()){
			progressDialog.dismiss();
			progressDialog = null;
		}
		progressDialog = new ProgressDialog(BaseActivity.this);
		progressDialog.setCanceledOnTouchOutside(false);
		progressDialog.setMessage("加载中...");
		try {
			progressDialog.show();
		}catch (BadTokenException exception) {
			exception.printStackTrace();
		}
	}
	public void showProgressDialog(String msg){
		if(progressDialog != null && progressDialog.isShowing()){
			progressDialog.dismiss();
			progressDialog = null;
		}
		progressDialog = new ProgressDialog(BaseActivity.this);
		progressDialog.setMessage(msg);
		try {
			progressDialog.show();
		}catch (BadTokenException exception) {
			exception.printStackTrace();
		}
	}
	
	public ProgressDialog createProgressDialog(String msg){
		ProgressDialog progressDialog = new ProgressDialog(BaseActivity.this);
		progressDialog.setMessage(msg);
		return progressDialog;
	}
	
	/**
	 * 隐藏正在加载的进度条
	 * 
	 */
	public void dismissProgressDialog(){
		if(null != progressDialog && progressDialog.isShowing() == true) {
			progressDialog.dismiss();
			progressDialog = null;
		}
	}
	
}