package com.dl7.daggerstudy.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;
import com.dl7.daggerstudy.dagger.Apple;
import com.dl7.daggerstudy.dagger3.Banana;
import com.dl7.daggerstudy.dagger3.Grape;
import com.dl7.daggerstudy.dagger4.ComponentB;
import com.dl7.daggerstudy.dagger4.DaggerComponentA;
import com.dl7.daggerstudy.dagger4.DaggerComponentB;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DependActivity extends BaseActivity {

    @Inject
    Apple mApple;
    @Inject
    Banana mBanana;
    @Inject
    Grape mGrape;


    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_content)
    TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depend);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "Depend");

        testDagger();
    }


    private void testDagger() {
        ComponentB componentB = DaggerComponentB.create();
        DaggerComponentA.builder()
                .componentB(componentB)
                .build().inject(this);
        mTvContent.setText(mApple.getMsg());
        mTvContent.append("\n");
        mTvContent.append(mBanana.getMsg());
        mTvContent.append("\n");
        mTvContent.append(mGrape.getMsg());
    }
}
