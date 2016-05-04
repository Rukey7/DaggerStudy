package com.dl7.daggerstudy.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;
import com.dl7.daggerstudy.dagger.DaggerFruitComponent;
import com.dl7.daggerstudy.dagger.Fruit;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FruitActivity extends BaseActivity {

    @Inject
    Fruit mFruit;


    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_msg)
    TextView mTvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "Fruit");

        testDagger();
    }

    private void testDagger() {
        DaggerFruitComponent.create().inject(this);
        mTvMsg.setText(mFruit.getMsg());
    }
}
