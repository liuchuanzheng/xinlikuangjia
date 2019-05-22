package com.liuchuanzheng.xinlikuangjia.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.gyf.barlibrary.ImmersionBar;
import com.liuchuanzheng.xinlikuangjia.R;
import com.liuchuanzheng.xinlikuangjia.util.activity.ActivityStackUtil;
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

    private ProgressDialog mDialog;

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
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)  //使用该属性必须指定状态栏的颜色，不然状态栏透明，很难看
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
        mDialog = new ProgressDialog(this);
        mDialog.setMessage(msg);
        mDialog.setCancelable(cancelAble);
        mDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mDialog.show();
    }
    public void showLogingDialog() {
        showLoadingDialog("加载中。。。", false);
    }

    /**
     * 隐藏加载进度框
     */
    public void hideDialog() {
        if (mDialog != null) {
            mDialog.dismiss();
        }
        mDialog = null;
    }

}
