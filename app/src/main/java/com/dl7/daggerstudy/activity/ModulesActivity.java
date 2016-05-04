package com.dl7.daggerstudy.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;
import com.dl7.daggerstudy.dagger2.A;
import com.dl7.daggerstudy.dagger2.B;
import com.dl7.daggerstudy.dagger2.DaggerModulesComponent;
import com.dl7.daggerstudy.dagger2.ModuleA;
import com.dl7.daggerstudy.dagger2.ModuleB;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ModulesActivity extends BaseActivity {

    @Inject
    A a;
    @Inject
    B b;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_msg)
    TextView mTvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "Modules");

        testDagger();
    }

    private void testDagger() {
        // ModuleA带有有参构造函数，不能直接用create,要使用builder()并显示传入ModuleA实例
//        DaggerModulesComponent.create().inject(this);
        DaggerModulesComponent.builder()
                .moduleA(new ModuleA("I'm ModuleA"))
                .moduleB(new ModuleB())
                .build()
                .inject(this);
        mTvMsg.setText(a.getMsg());
        mTvMsg.append("\n");
        mTvMsg.append(b.getMsg());
    }
}
