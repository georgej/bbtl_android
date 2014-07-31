/**   
* @Title: BBTLSchool.java 
* @Package com.ffapp.bbtimeline.common.domain 
* @Description: 学校对象类
* @author www.5fapp.com
* @date 2014-6-2 下午10:59:52 
* @version V1.0   
*/
package com.ffapp.bbtimeline.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BBTLSchool 
 * @Description: 学校对象类
 * @author jiangzhiqi
 *
 */
public class BBTLSchool extends BBTLBaseBean implements Serializable{
	
	private static final long serialVersionUID = 345590850617317797L;
	//自身信息字段
	private String shortName;//学校简称
	private String address;//学校地址
	private double lng;//经度
	private double lat;//维度
	private float distance;//距离
	private String slogan;//对外宣传口号
	private int isSigned;//是否签约
	private String telphone;//学校联系电话
	private String email;
	private String masterId;//管理者：职位名称，一般为引用在教师id
	private String masterName;//管理者：职位名称，一般为引用在教师id
	private String webUrl;//学校宣传网站
	private String logo_s;//宣传图片：小，默认
	private String logo_m;//宣传图片：中
	private String logo_b;//宣传图片：大
	private String description;//描述：长篇大论的文字，支持html5
	private String createName;//学校创办人。
	private Date createTime;//学校创办时间
	private boolean isBranch;//是否是分校
	private int fId;//如果是分校，总部ID
	private String fName;//如果是分校，总部名称
	private String tag;//标签
	private String status;// 商户状态
	private String landmark;// 地标
	private String bussiness;// 营业信息
	private String traffic;// 交通信息
	//关联字段
	private String country;// 国家编号
	private int city;// 城市编号
	private int area;// 地区编号
	private int block; // 商圈id
	private int cateid;//一级分类
	private int classid;//二级分类
	private int viptype;
	
	//这是冗余字段
	private String cityName;// 城市名
	private String areaName;// 地区名
	private int blockName; // 商圈名
	private String cateName;//类别名称
	private String className;// 二级分类
	//互动字段
	private float star;// 评级
	private float experience;// 体验分数
	private float environment;// 环境评分
	private float service;// 服务评分
	private String ambient;// 商户氛围
	private String feature;// 商户特色
	private int reviewnum;// 点评数
	private int checkinnum;// 签到数
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
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
	 * @return the cateid
	 */
	public int getCateid() {
		return cateid;
	}
	/**
	 * @param cateid the cateid to set
	 */
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	/**
	 * @return the classid
	 */
	public int getClassid() {
		return classid;
	}
	/**
	 * @param classid the classid to set
	 */
	public void setClassid(int classid) {
		this.classid = classid;
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
	 * @return the createName
	 */
	public String getCreateName() {
		return createName;
	}
	/**
	 * @param createName the createName to set
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the isBranch
	 */
	public boolean isBranch() {
		return isBranch;
	}
	/**
	 * @param isBranch the isBranch to set
	 */
	public void setBranch(boolean isBranch) {
		this.isBranch = isBranch;
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
	 * @return the masterId
	 */
	public String getMasterId() {
		return masterId;
	}
	/**
	 * @param masterId the masterId to set
	 */
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	/**
	 * @return the masterName
	 */
	public String getMasterName() {
		return masterName;
	}
	/**
	 * @param masterName the masterName to set
	 */
	public void setMasterName(String masterName) {
		this.masterName = masterName;
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
	 * @return the fId
	 */
	public int getfId() {
		return fId;
	}
	/**
	 * @param fId the fId to set
	 */
	public void setfId(int fId) {
		this.fId = fId;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
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
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}
	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	/**
	 * @return the bussiness
	 */
	public String getBussiness() {
		return bussiness;
	}
	/**
	 * @param bussiness the bussiness to set
	 */
	public void setBussiness(String bussiness) {
		this.bussiness = bussiness;
	}
	/**
	 * @return the traffic
	 */
	public String getTraffic() {
		return traffic;
	}
	/**
	 * @param traffic the traffic to set
	 */
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public int getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(int city) {
		this.city = city;
	}
	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}
	/**
	 * @return the block
	 */
	public int getBlock() {
		return block;
	}
	/**
	 * @param block the block to set
	 */
	public void setBlock(int block) {
		this.block = block;
	}
	/**
	 * @return the viptype
	 */
	public int getViptype() {
		return viptype;
	}
	/**
	 * @param viptype the viptype to set
	 */
	public void setViptype(int viptype) {
		this.viptype = viptype;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * @return the blockName
	 */
	public int getBlockName() {
		return blockName;
	}
	/**
	 * @param blockName the blockName to set
	 */
	public void setBlockName(int blockName) {
		this.blockName = blockName;
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
	 * @return the experience
	 */
	public float getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(float experience) {
		this.experience = experience;
	}
	/**
	 * @return the environment
	 */
	public float getEnvironment() {
		return environment;
	}
	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(float environment) {
		this.environment = environment;
	}
	/**
	 * @return the service
	 */
	public float getService() {
		return service;
	}
	/**
	 * @param service the service to set
	 */
	public void setService(float service) {
		this.service = service;
	}
	/**
	 * @return the ambient
	 */
	public String getAmbient() {
		return ambient;
	}
	/**
	 * @param ambient the ambient to set
	 */
	public void setAmbient(String ambient) {
		this.ambient = ambient;
	}
	/**
	 * @return the feature
	 */
	public String getFeature() {
		return feature;
	}
	/**
	 * @param feature the feature to set
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}
	/**
	 * @return the reviewnum
	 */
	public int getReviewnum() {
		return reviewnum;
	}
	/**
	 * @param reviewnum the reviewnum to set
	 */
	public void setReviewnum(int reviewnum) {
		this.reviewnum = reviewnum;
	}
	/**
	 * @return the checkinnum
	 */
	public int getCheckinnum() {
		return checkinnum;
	}
	/**
	 * @param checkinnum the checkinnum to set
	 */
	public void setCheckinnum(int checkinnum) {
		this.checkinnum = checkinnum;
	}
	
}
