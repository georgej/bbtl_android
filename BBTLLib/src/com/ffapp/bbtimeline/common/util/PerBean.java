package com.ffapp.bbtimeline.common.util;

import com.ffapp.bbtimeline.common.framework.bean.BaseResponse;

/**
 * 每一个资源
 * @author Administrator
 *
 */
public class PerBean extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4294951278650478821L;
	private String name;
	
	private boolean acheck;
	private boolean bcheck;
	private boolean ccheck;
	private boolean dcheck;
	private boolean echeck;
	private boolean fcheck;
	private boolean gcheck;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAcheck() {
		return acheck;
	}
	public void setAcheck(boolean acheck) {
		this.acheck = acheck;
	}
	public boolean isBcheck() {
		return bcheck;
	}
	public void setBcheck(boolean bcheck) {
		this.bcheck = bcheck;
	}
	public boolean isCcheck() {
		return ccheck;
	}
	public void setCcheck(boolean ccheck) {
		this.ccheck = ccheck;
	}
	public boolean isDcheck() {
		return dcheck;
	}
	public void setDcheck(boolean dcheck) {
		this.dcheck = dcheck;
	}
	public boolean isEcheck() {
		return echeck;
	}
	public void setEcheck(boolean echeck) {
		this.echeck = echeck;
	}
	public boolean isFcheck() {
		return fcheck;
	}
	public void setFcheck(boolean fcheck) {
		this.fcheck = fcheck;
	}
	public boolean isGcheck() {
		return gcheck;
	}
	public void setGcheck(boolean gcheck) {
		this.gcheck = gcheck;
	}
	@Override
	public String toString() {
		return "PerBean [name=" + name + ", acheck=" + acheck + ", bcheck="
				+ bcheck + ", ccheck=" + ccheck + ", dcheck=" + dcheck
				+ ", echeck=" + echeck + ", fcheck=" + fcheck + ", gcheck="
				+ gcheck + "]";
	}
	
}
