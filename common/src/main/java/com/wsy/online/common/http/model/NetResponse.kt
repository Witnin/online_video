package com.wsy.online.common.http.model

data class NetResponse(
    val code: Int,
    val data: Any?, //响应数据内容
    val message: String //响应数据描述
)

