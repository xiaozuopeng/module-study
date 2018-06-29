package com.xzp.study.module_study.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.xzp.study.base.router.RouterConfig;
import com.xzp.study.base.utils.CommonUtils;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.Permission;

public class WelcomeActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = new View(this);
        setContentView(view);

        AndPermission.with(this)
                .runtime()
                .permission(Permission.Group.STORAGE)
                .onGranted(permissions -> {
                    goToMain();
                })
                .onDenied(permissions -> {
                    CommonUtils.goToSetting(WelcomeActivity.this);
                })
                .start();
    }

    private void goToMain() {
        new Handler().postDelayed(() -> {
            ARouter.getInstance().build(RouterConfig.GUIDE_1).navigation();
            finish();
        }, 2000);
    }
}
