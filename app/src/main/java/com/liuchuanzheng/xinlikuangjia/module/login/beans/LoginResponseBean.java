package com.liuchuanzheng.xinlikuangjia.module.login.beans;

/**
 * @author: 刘传政
 * @date: 2019/4/18 09:38
 * QQ:1052374416
 * 作用:登录接口类
 * 注意事项:
 */
public class LoginResponseBean {

    /**
     * code : 200
     * msg : 登录成功
     * result : {"user_id":"2","MOBILE":"17600828329","PASSWORD":"4297f44b13955235245b2497399d7a93","nickname":"","profile_picture_url":"","profile_picture_id":"0","app_token":"364702c6f504110031ed62d04f3b772f","create_time":"2019-04-16 17:11:31","update_time":"2019-04-17 16:55:11","reg_source":""}
     */

    private int code;
    private String msg;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * user_id : 2
         * mobile : 17600828329
         * password : 4297f44b13955235245b2497399d7a93
         * nickname :
         * profile_picture_url :
         * profile_picture_id : 0
         * app_token : 364702c6f504110031ed62d04f3b772f
         * create_time : 2019-04-16 17:11:31
         * update_time : 2019-04-17 16:55:11
         * reg_source :
         */

        private String user_id;
        private String mobile;
        private String password;
        private String nickname;
        private String profile_picture_url;
        private String profile_picture_id;
        private String app_token;
        private String create_time;
        private String update_time;
        private String reg_source;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getProfile_picture_url() {
            return profile_picture_url;
        }

        public void setProfile_picture_url(String profile_picture_url) {
            this.profile_picture_url = profile_picture_url;
        }

        public String getProfile_picture_id() {
            return profile_picture_id;
        }

        public void setProfile_picture_id(String profile_picture_id) {
            this.profile_picture_id = profile_picture_id;
        }

        public String getApp_token() {
            return app_token;
        }

        public void setApp_token(String app_token) {
            this.app_token = app_token;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getReg_source() {
            return reg_source;
        }

        public void setReg_source(String reg_source) {
            this.reg_source = reg_source;
        }
    }
}
