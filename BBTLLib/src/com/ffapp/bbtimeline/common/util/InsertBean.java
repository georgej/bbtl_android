package com.ffapp.bbtimeline.common.util;

import java.util.ArrayList;
import java.util.List;

import com.ffapp.bbtimeline.common.framework.bean.BaseResponse;

/**
 * 插入资源时 提交的字段
 * @author Administrator
 *
 */
public class InsertBean extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3264203106488807218L;
	public String bname;
	public String select1;
	public String select2;
	public String select3;
	@Override
	public String toString() {
		return "InsertBean [bname=" + bname + ", select1=" + select1
				+ ", select2=" + select2 + ", select3=" + select3 + "]";
	}
	
	/**
	 * 把所有题的bean 转化成已选择的bean 
	 * @param list
	 * @return
	 */
	public static List<InsertBean> convertTo(List<PerBean> list){
		List<InsertBean> insertBean = new ArrayList<InsertBean>();
		List<String> str;
		for (PerBean perBean : list) {
			InsertBean bean = new InsertBean();
			str = new ArrayList<String>();
			bean.bname = perBean.getName();
			if(perBean.isAcheck()){
				str.add("A");
			}
			if(perBean.isBcheck()){
				str.add("B");
			}
			if(perBean.isCcheck()){
				str.add("C");
			}
			if(perBean.isDcheck()){
				str.add("D");
			}
			if(perBean.isEcheck()){
				str.add("E");
			}
			if(perBean.isFcheck()){
				str.add("F");
			}
			if(perBean.isGcheck()){
				str.add("G");
			}
			
			for (int i = 0; i < str.size(); i++) {
				if(i == 0){
					bean.select1 = str.get(0);
				}
				if(i == 1){
					bean.select2 = str.get(1);
				}
				if(i == 2){
					bean.select3 = str.get(2);
				}
			}
			if(StringUtil.isNotNull(bean.select1)||StringUtil.isNotNull(bean.select2)
					||StringUtil.isNotNull(bean.select3)){
				insertBean.add(bean);
			}
		}
		return insertBean;
	}
	
	public static String getBnameByList(List<PerBean> list){
		for (PerBean perBean : list) {
			if(perBean.isGcheck()){
				return perBean.getName();
			}
		}
		return "";
	}
	
	public static String getSelect1ByList(List<PerBean> list){
		for (PerBean perBean : list) {
			if(perBean.isGcheck()){
				if(perBean.isAcheck()){
					return "A";
				}else if(perBean.isBcheck()){
					return "B";
				}else if(perBean.isCcheck()){
					return "C";
				}else if(perBean.isDcheck()){
					return "D";
				}else if(perBean.isEcheck()){
					return "E";
				}else if(perBean.isFcheck()){
					return "F";
				}
			}
		}
		return "";
	}
}
