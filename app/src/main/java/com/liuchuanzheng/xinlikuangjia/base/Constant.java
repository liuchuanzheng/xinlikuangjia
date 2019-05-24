package com.liuchuanzheng.xinlikuangjia.base;

import com.liuchuanzheng.xinlikuangjia.BuildConfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 所有的常量类。这里每个常量不用大写表示，因为个人不喜欢，看大写字母一眼看不明白
 */
public class Constant {
    /**
     * sp相关的常量
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SP {

        //***********************userInfo********************
        /**
         * sp名字
         * 用户信息相关
         */
        String userInfo = "userInfo";

        /**
         * 用户名
         */
        String userName = "userName";

        //***********************userInfo2********************
        /**
         * sp名字
         * 用户信息相关
         */
        String userInfo2 = "userInfo2";

        /**
         * 用户名
         */
        String userName2 = "userName2";
    }
    /**
     * url
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Url {


        /**
         * 这个url是gradle中配置的。可以通过指定打包方式选择不同的值
         * 网络请求的baseUrl
         */
        String request_base_url = BuildConfig.SERVER_URL;
    }

    /**
     * Tag
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Tag {


        /**
         * 打印log的tag
         */
        String tag = "心理";
    }
    /**
     * 网络code值定义。
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetCode {

        /**
         * int 网络返回值
         */
        int error = -1;
        int success = 0;

    }
}
