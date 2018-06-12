package com.xzp.study.module_launch;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xzp.study.base.base.BaseActivity;
import com.xzp.study.base.router.RouterConfig;
import com.xzp.study.module_launch.databinding.ActivityGuideBinding;

@Route(path = RouterConfig.GUIDE_1)
public class GuideActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityGuideBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_guide);
        binding.btnGoToMain.setOnClickListener((View view)->{
            ARouter.getInstance().build(RouterConfig.MAIN_1).navigation();
            finish();
        });
    }
}
