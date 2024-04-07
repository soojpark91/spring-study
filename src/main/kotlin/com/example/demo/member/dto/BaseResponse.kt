package com.example.demo.member.dto

import com.example.demo.common.status.ResultCode

data class BaseResponse<T>(
        val resultCode: String = ResultCode.SUCCESS.name,
        val date: T? = null,
        val message: String = ResultCode.SUCCESS.msg
)
