package com.liuchuanzheng.xinlikuangjia.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.gyf.barlibrary.ImmersionBar;
import com.liuchuanzheng.xinlikuangjia.R;
import com.liuchuanzheng.xinlikuangjia.util.activity.ActivityStackUtil;
import com.lxj.xpopup.XPopup;
import com.lxj.xpopup.core.BasePopupView;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 可控制网络请求的生命周期
 */
public abstract class BaseActivity extends RxAppCompatActivity {

    public ActivityStackUtil activityStackUtil = ActivityStackUtil.getScreenManager();

    protected BaseActivity activity;

    private Unbinder unbinder;

    public BasePopupView loadingPopup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
        activityStackUtil.addActivity(this);
        activity = this;
        initStatusColor();

        doYourself();
    }

    private void initStatusColor() {
        ImmersionBar.with(this)
                //状态栏颜色
                .statusBarColor(R.color.common_bg)
                //状态栏文字颜色
                .statusBarDarkFont(true)
                //使用该属性必须指定状态栏的颜色，不然状态栏透明，很难看. true表示布局嵌入状态栏。false表示布局避开状态栏
                .fitsSystemWindows(true)
                .init();
    }

    protected abstract int getLayoutId();

    /**
     * 这里不过多区分initview与initdata等。因为他们的顺序不是固定的
     * 避免过度设计
     */
    protected abstract void doYourself();


    @Override
    protected void onDestroy() {
        hideDialog();
        ImmersionBar.with(this).destroy();
        activityStackUtil.removeActivity(this);
        unbinder.unbind();
        super.onDestroy();

    }

    /**
     * 创建并show加载进度框
     *
     * @param msg
     * @param cancelAble
     */
    public void showLoadingDialog(String msg, boolean cancelAble) {
        hideDialog();
        loadingPopup =  new XPopup.Builder(activity)
                .dismissOnBackPressed(cancelAble)
                .dismissOnTouchOutside(cancelAble)
                .asLoading(msg)
                .show();
    }
    public void showLogingDialog() {
        showLoadingDialog("正在加载中",false);

    }

    /**
     * 隐藏加载进度框
     */
    public void hideDialog() {
        if (loadingPopup != null) {
            loadingPopup.dismiss();
        }
        loadingPopup = null;
    }

}
