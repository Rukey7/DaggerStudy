package com.dl7.daggerstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dl7.daggerstudy.activity.BaseMarketActivity;
import com.dl7.daggerstudy.activity.DependActivity;
import com.dl7.daggerstudy.activity.FruitActivity;
import com.dl7.daggerstudy.activity.ModulesActivity;
import com.dl7.daggerstudy.activity.MulitFruitActivity;
import com.dl7.daggerstudy.activity.SingletonActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseMarketActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.btn_dagger)
    Button mBtnDagger;
    @Bind(R.id.btn_dagger_modules)
    Button mBtnDaggerModules;
    @Bind(R.id.btn_dagger_Mulit)
    Button mBtnDaggerMulit;
    @Bind(R.id.btn_dagger_depend)
    Button mBtnDaggerDepend;
    @Bind(R.id.btn_dagger_singleton)
    Button mBtnDaggerSingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "Dagger");
        hideSearchView();
    }

    @OnClick({R.id.btn_dagger, R.id.btn_dagger_modules, R.id.btn_dagger_Mulit, R.id.btn_dagger_depend, R.id.btn_dagger_singleton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_dagger:
                startActivity(new Intent(MainActivity.this, FruitActivity.class));
                break;
            case R.id.btn_dagger_modules:
                startActivity(new Intent(MainActivity.this, ModulesActivity.class));
                break;
            case R.id.btn_dagger_Mulit:
                startActivity(new Intent(MainActivity.this, MulitFruitActivity.class));
                break;
            case R.id.btn_dagger_depend:
                startActivity(new Intent(MainActivity.this, DependActivity.class));
                break;
            case R.id.btn_dagger_singleton:
                startActivity(new Intent(MainActivity.this, SingletonActivity.class));
                break;
        }
    }
}
