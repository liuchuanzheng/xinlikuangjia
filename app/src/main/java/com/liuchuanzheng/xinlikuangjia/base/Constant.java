package com.liuchuanzheng.xinlikuangjia.base;

import com.liuchuanzheng.xinlikuangjia.BuildConfig;

public class Constant {
    /**
     * 这个url是gradle中配置的。可以通过指定打包方式选择不同的值
     */
    public static final String REQUEST_BASE_URL = BuildConfig.SERVER_URL;
    /**
     * 用户相关 sp key
     */
    public static final String USERNAME = "username";
    /**
     * 打印log的tag
     */
    public static final String TAG = "心理";

    /**
     * 首页 banner key
     */
    public static final String HOME_DETAIL_TITLE = "banner_title";

    /**
     * int 网络返回值
     */
    public static final int REQUEST_ERROR = -1;
    public static final int REQUEST_SUCCESS = 0;
}
