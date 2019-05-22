package com.liuchuanzheng.xinlikuangjia.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.trello.rxlifecycle2.components.RxFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author 刘传政
 * @date 2018/12/16 0016 11:48
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public abstract class BaseFragment extends RxFragment {
    private Unbinder unbinder;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
