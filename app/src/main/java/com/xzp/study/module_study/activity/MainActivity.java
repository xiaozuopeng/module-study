package com.xzp.study.module_study.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xzp.study.base.app.AppManager;
import com.xzp.study.base.base.BaseActivity;
import com.xzp.study.base.base.BaseViewModel;
import com.xzp.study.base.router.RouterConfig;
import com.xzp.study.base.utils.ToastUtils;
import com.xzp.study.module_study.R;
import com.xzp.study.module_study.databinding.ActivityMainBinding;

@Route(path = RouterConfig.MAIN_1)
public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {

    private long exitTime;

    @Override
    public int initVariableId() {
        return 0;
    }

    @Override
    public BaseViewModel initViewModel() {
        return new BaseViewModel();
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

    }

    @Override
    public void onBackPressed() {
        if ((System.currentTimeMillis() - exitTime) > 1000) {
            ToastUtils.ToastShort("再点一次退出");
            exitTime = System.currentTimeMillis();
        } else {
            AppManager.getAppManager().AppExit();
        }
    }
}
