package com.liuchuanzheng.xinlikuangjia.module.login;

import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.liuchuanzheng.xinlikuangjia.BuildConfig;
import com.liuchuanzheng.xinlikuangjia.R;
import com.liuchuanzheng.xinlikuangjia.base.BaseMVPActivity;
import com.liuchuanzheng.xinlikuangjia.base.mvp.view.IBaseView;
import com.liuchuanzheng.xinlikuangjia.module.login.beans.LoginResponseBean;
import com.liuchuanzheng.xinlikuangjia.module.login.contracts.IContract;
import com.liuchuanzheng.xinlikuangjia.module.login.presenters.LoginActivityPresenter;
import com.orhanobut.logger.Logger;

import butterknife.OnClick;

public class LoginActivity extends BaseMVPActivity<IContract.Login.View, LoginActivityPresenter> {
    @Override
    protected void initMVP() {
        mView = new IContract.Login.View() {
            @Override
            public void onLogin(LoginResponseBean responseBean, int resultType, String errorMsg) {
                switch (resultType) {
                    case IBaseView.NET_ERROR:
                        ToastUtils.showLong(getString(R.string.net_error));
                        break;
                    case IBaseView.SERVER_ERROR:
                        break;
                    case IBaseView.SERVER_NORMAL_DATANO:
                        break;
                    case IBaseView.SERVER_NORMAL_DATAYES:
                        break;
                }

            }

            @Override
            public void onComplete() {

            }
        };
        mPresenter = new LoginActivityPresenter(this, mView);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void doYourself() {
        Toast.makeText(this, BuildConfig.FLAVOR + "--" + BuildConfig.BUILD_TYPE + "--" + BuildConfig.LOG + "--" + BuildConfig.SERVER_URL, Toast.LENGTH_LONG).show();
        Logger.i( BuildConfig.FLAVOR + "--" + BuildConfig.BUILD_TYPE + "--" + BuildConfig.LOG + "--" + BuildConfig.SERVER_URL);
    }


    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        mPresenter.login("18501231486","123456");
    }
}
