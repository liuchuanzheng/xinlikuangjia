package com.liuchuanzheng.xinlikuangjia.base.mvp.presenter;

import android.content.Context;

import com.liuchuanzheng.xinlikuangjia.base.mvp.view.IBaseRetrofitView;


public abstract class BasePresenter<T extends IBaseRetrofitView> implements IBasePresenter {
    public Context context;
    public T mView;

    public BasePresenter(Context context, T mView) {
        this.context = context;
        this.mView = mView;
        initModel();
    }

     public abstract void initModel();
    /**
     * 记得要在销毁时调用。防止内存泄漏
     */
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }
}
