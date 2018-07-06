package com.iparhan.financial.vo;

import com.iparhan.financial.until.CommonConstant;

/**
 * Created by sundawang 2018-5-23 11:03:32
 * 错误代码对象
 */
public class CommonResponseVO {
    //错误代码
    private String code; //1 success 0 fail
    //错误消息
    private String msg;
    //接口数据MD5摘要
    private String hash;
    //接口数据
    private Object data;

    private Long count;
    public CommonResponseVO(){};

    public CommonResponseVO(final String code, final  String msg, final String hash, final Object data) {
        this.code = code;
        this.msg = msg;
        this.hash = hash;
        this.data = data;
    }

    public CommonResponseVO(String code, String msg, String hash, Object data, Long count) {
        this.code = code;
        this.msg = msg;
        this.hash = hash;
        this.data = data;
        this.count = count;
    }

    public CommonResponseVO(final String code, final  String msg) {
        this.code = code;
        this.msg = msg;
        this.hash = null;
        this.data = null;
    }
    public void fail(String msg, Object data){
        this.code = CommonConstant.SUCCESS_F;
        this.msg = msg;
        this.data = data;
    }
    public void fail(String msg){
        this.code = CommonConstant.SUCCESS_F;
        this.msg = msg;
    }
    public void success(String msg){          //无data赋值时调用
        this.code = CommonConstant.SUCCESS_S;
        this.msg = msg;
    }
    public void success(String msg,String hash,Object data){    //有data赋值时调用
        this.code = CommonConstant.SUCCESS_S;
        this.msg = msg;
        this.hash = hash;
        this.data = data;
    }
    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
