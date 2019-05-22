package com.liuchuanzheng.xinlikuangjia.net;


import com.liuchuanzheng.xinlikuangjia.module.login.beans.LoginResponseBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

/**
 * Created by lw on 2018/1/23.
 */

public interface ApiService {
    /**
     * 登录
     *//*
    @POST("User/login")
    @FormUrlEncoded
    Observable<LoginResponseBean> login(@Field("mobile") String username, @Field("password") String password);*/

    /**
     * 登录
     *
     * @param params
     * @return
     */
    @Multipart
    @POST("wxnew/api.php/User/login")
    Observable<LoginResponseBean> login(@PartMap Map<String, String> params);
}
