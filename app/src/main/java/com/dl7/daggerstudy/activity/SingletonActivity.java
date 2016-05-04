package com.dl7.daggerstudy.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;
import com.dl7.daggerstudy.dagger5.BallComponent;
import com.dl7.daggerstudy.dagger5.DaggerBallComponent;
import com.dl7.daggerstudy.dagger5.Shop;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SingletonActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_content)
    TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "Singleton");

        testDagger();
    }

    /**
     * Dagger通过Singleton创建出来的单例并不保持在静态域上，而是保留在Component实例中
     */
    private void testDagger() {
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Shop shop3 = new Shop();
        Shop shop4 = new Shop();
        BallComponent ballComponent = DaggerBallComponent.create();
        BallComponent ballComponent2 = DaggerBallComponent.create();

        ballComponent.inject(shop1);
        ballComponent.inject(shop2);
        ballComponent2.inject(shop3);
        ballComponent2.inject(shop4);

        mTvContent.setText("shop1 == shop2: " + (shop1.getBall() == shop2.getBall()));
        mTvContent.append("\n");
        mTvContent.append("shop2 == shop3: " + (shop2.getBall() == shop3.getBall()));
        mTvContent.append("\n");
        mTvContent.append("shop3 == shop4: " + (shop3.getBall() == shop4.getBall()));
        mTvContent.append("\n");
        mTvContent.append("shop4 == shop1: " + (shop4.getBall() == shop1.getBall()));
        mTvContent.append("\n");
    }
}
