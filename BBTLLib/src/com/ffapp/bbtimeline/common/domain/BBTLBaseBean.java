/**   
* @Title: BBTLBaseBean.java 
* @Package com.ffapp.bbtimeline.common.domain 
* @Description: 基类对象：所有公共属性
* @author www.5fapp.com
* @date 2014-6-2 下午10:59:52 
* @version V1.0   
*/
package com.ffapp.bbtimeline.common.domain;
import java.math.BigInteger;

/**
 * @ClassName: BBTLBaseBean 
 * @Description: 基类对象：所有公共属性
 * @author jiangzhiqi
 *
 */
public class BBTLBaseBean {

	/**
	 * 企业租户ID，所有的表字段和数据都必须包含此数据。
	 */
	protected int tenantId;
	private int id;//编号
	private String name;//名称
	

	/**
	 * @return the tenantId
	 */
	public int getTenantId() {
		return tenantId;
	}

	/**
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
