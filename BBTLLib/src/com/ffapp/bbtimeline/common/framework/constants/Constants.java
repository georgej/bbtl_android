package com.ffapp.bbtimeline.common.framework.constants;

import java.io.File;

import com.ffapp.bbtimeline.common.util.StringUtil;


import android.os.Environment;

public class Constants {

	public static final int ERROR_CODE_OK = 0;

	public static final int SINA_AUTHORIZE_CANCEL = 0;
	public static final int SINA_AUTHORIZE_SUCCESS = 1;
	public static final int SINA_AUTHORIZE_ERROR = 2;
	public static final int SINA_AUTHORIZE_EXCEPTION = 3;
	public static final int SINA_SHARE_WEIBO_COMPLETE = 4;
	public static final int SINA_SHARE_WEIBO_WEIBO_EXCEPTION = 5;
	public static final int SINA_SHARE_WEIBO_IOEXCEPTION = 6;

	public static final String APP_CONFIG_FILE_NAME = "AppConfig.json";
	public static final String FROM_PAGE = "fromPage";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String PASSWORD = "password";
	public static final String WEIBO_TYPE_SINA = "新浪";
	public static final String WEIBO_TYPE_TENCENT = "腾讯";
	public static final int QQ_LOGIN_FAILED = 10;// QQ登录失败
	public static final int QQ_LOGIN_SUCCESS = 11;// QQ登录成功

	//文件相关
	public static final String directory = "铸财";//总目录
	// 下载相关
	public static final int PROGRESS_UPDATE = 1;
	public static final int PROGRESS_COMPLETE = 2;
	public static final int NO_SD_CARD = 3;
	
	public static String getFileCacheDirectory() {
		File sdcardDir = Environment.getExternalStorageDirectory();
		String fileDirectory = "/mnt/sdcard";
		if(null != sdcardDir) {
			fileDirectory = sdcardDir.getAbsolutePath() + "/castMoney/apk";
		}
		return fileDirectory;
	}
	/**
	 * 首页铸财 类型
	 */
	public static final String CAST_KEY = "cast_key";
	public static final int CAST_YINHANG_TAG = 1;
	public static final int CAST_XINTUO_TAG = 2;
	public static final int CAST_ZIGUAN_TAG = 3;
	public static final int CAST_JIJIN_TAG = 4;
	public static final int CAST_QIHUO_TAG = 5;
	public static final int CAST_GUIJIN_TAG = 6;
	public static final int CAST_ZUNXIANG_TAG = 7;
	public static final int CAST_XUEXI_TAG = 8;
	public static final int CAST_SHALONG_TAG = 9;
	public static final int CAST_RENMAI_TAG = 10;
	public static final int CAST_ZHAOPIN_TAG = 11;
	public static final int CAST_DONGTAI_TAG = 12;

	public static String getCastType(int type) {

		if (type == CAST_YINHANG_TAG) {
			return "银行";
		} else if (type == CAST_XINTUO_TAG) {
			return "信托";
		} else if (type == CAST_ZIGUAN_TAG) {
			return "资管";
		} else if (type == CAST_JIJIN_TAG) {
			return "基金";
		} else if (type == CAST_QIHUO_TAG) {
			return "期货";
		} else if (type == CAST_GUIJIN_TAG) {
			return "贵金";
		} else if (type == CAST_ZUNXIANG_TAG) {
			return "尊享";
		} else if (type == CAST_XUEXI_TAG) {
			return "学习";
		} else if (type == CAST_SHALONG_TAG) {
			return "沙龙";
		} else if (type == CAST_RENMAI_TAG) {
			return "人脉";
		} else if (type == CAST_ZHAOPIN_TAG) {
			return "招聘";
		} else if (type == CAST_DONGTAI_TAG) {
			return "动态";
		}
		return "";
	}

	/**
	 * 个人中心 int 类型状态转换
	 */
	public static final String SEX = "sex";
	public static final String STATE = "state";// 0.未认证 1.认证 2.驳回 3提交
	public static final String GRADE = "grade";// 0.银卡会员 1.金卡会员 2.钻石会员 3.普通会员

	public static String getSex(String sex) {
		if(StringUtil.isNullOrEmpty(sex)){
			return "";
		}else{
			int s = Integer.parseInt(sex);
			if (s == 0) {
				return "男";
			} else if(s == 1){
				return "女";
			} else {
				return "";
			}
		}
	}

	public static String getState(int state) {
		if (state == 0) {
			return "未认证";
		} else if (state == 1) {
			return "已认证";
		} else if (state == 2) {
			return "已驳回";
		} else {
			return "审核中";
		}
	}

	public static String getGrade(int grade) {
		if (grade == 0) {
			return "银卡会员";
		} else if (grade == 1) {
			return "金卡会员";
		} else if (grade == 2) {
			return "钻石会员";
		} else {
			return "普通会员";
		}
	}

	public static String getNeed(int need) {
		if (need > 0) {
			return need + "个";
		} else {
			return "暂无";
		}
	}

	/**
	 * 投融资
	 */
	public static final String CAST_TAG = "cast_tag";
	public static final String INVEST_NEED = "invest_need";
	public static final String FINANCE_NEED = "finance_need";

}
