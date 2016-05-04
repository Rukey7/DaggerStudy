package com.dl7.daggerstudy.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;
import com.dl7.daggerstudy.dagger3.Banana;
import com.dl7.daggerstudy.dagger3.DaggerMultiFruitComponent;
import com.dl7.daggerstudy.dagger3.Grape;
import com.dl7.daggerstudy.dagger3.IntNamed;
import com.dl7.daggerstudy.dagger3.Pear;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MulitFruitActivity extends BaseActivity {

    @Named("typeA") @Inject
    Banana mBanana;
    @Named("typeB") @Inject
    Pear mPear;
    @IntNamed(1) @Inject
    Grape mGrape;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_content)
    TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutil_fruit);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "MutilFruit");

        testDagger();
    }

    private void testDagger() {
        DaggerMultiFruitComponent.create().inject(this);
        mTvContent.setText(mBanana.getMsg());
        mTvContent.append("\n");
        mTvContent.append(mPear.getMsg());
        mTvContent.append("\n");
        mTvContent.append(mGrape.getMsg());
    }
}
