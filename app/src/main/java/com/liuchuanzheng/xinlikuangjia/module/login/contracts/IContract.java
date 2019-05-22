package com.liuchuanzheng.xinlikuangjia.module.login.contracts;

import com.liuchuanzheng.xinlikuangjia.base.mvp.view.IBaseRetrofitView;
import com.liuchuanzheng.xinlikuangjia.module.login.beans.LoginResponseBean;

public interface IContract {
    interface Login {
        interface View extends IBaseRetrofitView {
            void onLogin(LoginResponseBean responseBean, int resultType, String errorMsg);
        }

        interface Presenter {
            void login(String username, String password);
        }
    }

}
