/**   
* @Title: BBTLStudent.java 
* @Package com.ffapp.bbtimeline.common.domain 
* @Description: 学生对象类
* @author www.5fapp.com
* @date 2014-6-2 下午10:59:52 
* @version V1.0   
*/
package com.ffapp.bbtimeline.common.domain;

import java.io.Serializable;

/**
 * @ClassName: BBTLStudent 
 * @Description: 学生对象类
 * @author jiangzhiqi
 *
 */
public class BBTLStudent extends BBTLBaseBean  implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4232736860434730836L;
	
	private String address;//学校地址
	private double lng;//经度
	private double lat;//维度
	private float distance;//距离
	private String slogan;//对外宣传口号
	private int isSigned;//是否签约
	private String telphone;//学校联系电话
	private String email;
	
	private String webUrl;//学校宣传网站
	private String logo_s;//宣传图片：小，默认
	private String logo_m;//宣传图片：中
	private String logo_b;//宣传图片：大
	private String description;//描述：长篇大论的文字，支持html5
	
	private String tag;//标签
	private String status;// 商户状态
	
	private float star;// 评级
	private String cateName;//类别名称
	private String className;// 二级分类
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the lng
	 */
	public double getLng() {
		return lng;
	}
	/**
	 * @param lng the lng to set
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}
	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	/**
	 * @return the distance
	 */
	public float getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}
	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}
	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	/**
	 * @return the isSigned
	 */
	public int getIsSigned() {
		return isSigned;
	}
	/**
	 * @param isSigned the isSigned to set
	 */
	public void setIsSigned(int isSigned) {
		this.isSigned = isSigned;
	}
	/**
	 * @return the telphone
	 */
	public String getTelphone() {
		return telphone;
	}
	/**
	 * @param telphone the telphone to set
	 */
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the webUrl
	 */
	public String getWebUrl() {
		return webUrl;
	}
	/**
	 * @param webUrl the webUrl to set
	 */
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	/**
	 * @return the logo_s
	 */
	public String getLogo_s() {
		return logo_s;
	}
	/**
	 * @param logo_s the logo_s to set
	 */
	public void setLogo_s(String logo_s) {
		this.logo_s = logo_s;
	}
	/**
	 * @return the logo_m
	 */
	public String getLogo_m() {
		return logo_m;
	}
	/**
	 * @param logo_m the logo_m to set
	 */
	public void setLogo_m(String logo_m) {
		this.logo_m = logo_m;
	}
	/**
	 * @return the logo_b
	 */
	public String getLogo_b() {
		return logo_b;
	}
	/**
	 * @param logo_b the logo_b to set
	 */
	public void setLogo_b(String logo_b) {
		this.logo_b = logo_b;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the star
	 */
	public float getStar() {
		return star;
	}
	/**
	 * @param star the star to set
	 */
	public void setStar(float star) {
		this.star = star;
	}
	/**
	 * @return the cateName
	 */
	public String getCateName() {
		return cateName;
	}
	/**
	 * @param cateName the cateName to set
	 */
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
