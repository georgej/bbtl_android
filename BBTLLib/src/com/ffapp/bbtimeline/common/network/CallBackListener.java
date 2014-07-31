package com.ffapp.bbtimeline.common.network;

import java.io.IOException;

/**
 * 网络服务回调接口
 *
 */
public interface CallBackListener {

	public void onComplete(Object object, String methodName);

	public void onError(Object object);
	public void onError(Object object,String methodName);

}
