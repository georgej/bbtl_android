package com.ffapp.bbtimeline.common.framework.application;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import android.app.Activity;
import android.app.Application;
import android.app.DownloadManager.Request;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;


import com.ffapp.bbtimeline.common.framework.config.AppConfig;
import com.ffapp.bbtimeline.common.framework.config.AppInfo;
import com.ffapp.bbtimeline.common.util.CrcUtil;
import com.ffapp.bbtimeline.common.util.DateUtil;
import com.ffapp.bbtimeline.common.util.NetUtil;
import com.ffapp.bbtimeline.common.util.PerBean;


public class SoftApplication extends Application {
	/**
	 * 存放活动状态的(未被销毁)的Activity列表
	 */
	public static List<Activity> unDestroyActivityList = new ArrayList<Activity>();
	public static SoftApplication softApplication;
	private static AppInfo appInfo;
	//private static UserInfo userInfo;
	private static boolean isLogin;//判断是否已经登录
	private static String passwordWithMd5 = "";

	
	public boolean isApkLoading = false;//是否正在执行当前的下载(true:yes)
	@Override
	public void onCreate() {
		softApplication = this;
		
		super.onCreate();
		
		appInfo = initAppInfo();
		
	}
	

	/**
	 * 将经纬度存至SharedPref
	 * 
	 * @param longitude 经度
	 * @param latitude 纬度
	 */
	public void setLonAndLatToSharedPref(String longitude, String latitude) {
		// 设置经纬度
	}

	

	/**
	 * 实例化AppInfo
	 */
	private AppInfo initAppInfo() {
		AppInfo appInfo = AppConfig.getAppConfigInfo(softApplication);
		appInfo.imei = NetUtil.getIMEI(getApplicationContext());
		appInfo.imsi = NetUtil.getIMSI(getApplicationContext()) == null ? "" : NetUtil.getIMSI(getApplicationContext());
		appInfo.osVersion = getOSVersion();
		appInfo.appVersionCode = getAppVersionCode();
		return appInfo;
	}
	
	/**
	 * 得到系统的版本号
	 * @return
	 */
	public String getOSVersion() {
		return android.os.Build.VERSION.RELEASE;
	}
	
	/**
	 * 得到应用的版本号
	 * @return
	 */
	public int getAppVersionCode() {
		PackageManager packageManager = getPackageManager();
		// getPackageName()是你当前类的包名，0代表是获取版本信息
		PackageInfo packInfo;
		int versionCode = 0;
		try {
			packInfo = packageManager.getPackageInfo(getPackageName(), 0);
			versionCode = packInfo.versionCode;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return versionCode;
	}
	
	/**
	 * 得到应用的版本号
	 * @return
	 */
	public String getAppVersionName() {
		PackageManager packageManager = getPackageManager();
		// getPackageName()是你当前类的包名，0代表是获取版本信息
		PackageInfo packInfo;
		String versionCode = "";
		try {
			packInfo = packageManager.getPackageInfo(getPackageName(), 0);
			versionCode = packInfo.versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return versionCode;
	}
	
	/**
	 * 获取Assert文件夹中的配置文件信息
	 * @return
	 */
	public AppInfo getAppInfo() {
		return appInfo;
	}
	
	public String getFrom(){
		return appInfo == null ? "" : appInfo.os;
	}
	
	public String getApiUser(){
		return appInfo == null ? "" : appInfo.api_user;
	}
	
	public String getApiPassword(){
		return appInfo == null ? "" : appInfo.api_pwd;
	}
	

	/**
	 * 得到请求头JsonObject
	 * @return
	 */
	public String getAuthJsonObject(String jsonString) {
		try {
			String timeStamp = DateUtil.getCurrentDateTimeyyyyMMddHHmmss();
			JSONObject authJsonObject = new JSONObject();
			authJsonObject.put("app_key", appInfo.appKey);
			authJsonObject.put("imei", appInfo.imei);
			authJsonObject.put("os", appInfo.os);
			authJsonObject.put("os_version", appInfo.osVersion);
			authJsonObject.put("app_version", appInfo.appVersionCode);
			authJsonObject.put("source_id", appInfo.sourceId);
			authJsonObject.put("ver",appInfo.ver);
			authJsonObject.put("uid",appInfo.uid);
			authJsonObject.put("time_stamp",timeStamp);
			authJsonObject.put("crc",CrcUtil.getCrc(timeStamp, appInfo.imei, appInfo.uid, (isLogin ? passwordWithMd5 : CrcUtil.MD5(appInfo.crc)), jsonString));
			return authJsonObject.toString();
//			return authJsonObject.toJSONString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 退出应用
	 */
	public void quit(){
		for (Activity activity : unDestroyActivityList) {
			if (null != activity) {
				activity.finish();
			}
		}
		unDestroyActivityList.clear();
		logout();
		
	}
	

	
	/**
	 * 注销帐号
	 */
	public void logout() {
		//userInfo = null;
		isLogin = false;
		try {
			passwordWithMd5 = CrcUtil.MD5(appInfo.crc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	/**
	 * 保存登录成功之后用户的信息
	 * @param result
	 *//*
	public void setUserInfo(UserInfo result) {
		userInfo = result;
	}
	
	*//**
	 * 更新用户信息
	 * @param result
	 *//*
	public void updateUserInfo(UserInfo result){
		if(result == null){
			return;
		}
		userInfo = result;
	}
	*/
	
	public String getPasswordWithMd5() {
		return passwordWithMd5;
	}

	public void setPasswordWithMd5(String passwordWithMD5) {
		passwordWithMd5 = passwordWithMD5;
	}

	public boolean isLogin() {
		return isLogin;
	}

	/**
	 * 获取用户的信息
	 * @return
	 *//*
	public UserInfo getUserInfo(){
		return userInfo;
	}*/



	public void setLoginStatus(boolean b) {
		isLogin = b;
	}
}
