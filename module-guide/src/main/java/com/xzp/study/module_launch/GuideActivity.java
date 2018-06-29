package com.xzp.study.module_launch;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xzp.study.base.base.BaseActivity;
import com.xzp.study.base.base.BaseViewModel;
import com.xzp.study.base.router.RouterConfig;
import com.xzp.study.module_launch.databinding.ActivityGuideBinding;

@Route(path = RouterConfig.GUIDE_1)
public class GuideActivity extends BaseActivity<ActivityGuideBinding, BaseViewModel> {

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
        return R.layout.activity_guide;
    }

    @Override
    protected void init() {
        mBinding.btnGoToMain.setOnClickListener((View view) -> {
            ARouter.getInstance().build(RouterConfig.MAIN_1).navigation();
            finish();
        });
    }
}
