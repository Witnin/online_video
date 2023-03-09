package com.wsy.online.common.http

import com.wsy.online.common.http.support.IHttpCallBack
import java.security.cert.CertPath

/**
 * 网络请求统一接口类
 */
interface HttpApi {
    /**
     *抽象的http的get请求，异步
     */
    fun get(params:Map<String,Any>,path: String,callback:IHttpCallBack)

    /**
     *抽象的http的get请求，同步
     */
    fun get(params:Map<String,Any>,path: String):Any?{
        return Any()
    }

    /**
     *抽象的http的post请求，异步
     */
    fun post(body:Any,path: String,callback:IHttpCallBack)

    /**
     *抽象的http的post请求，同步
     */
    fun postSync(body:Any,path: String):Any? = Any()

    /**
    **
    * 取消网络请求，tag就是每次请求的id 标记，也就是请求的传参
    */
    fun cancelRequest(tag: Any)
    /**
     * 取消所有网络请求
     */
    fun cancelAllRequest()
}