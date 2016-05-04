package com.dl7.daggerstudy.dagger3;

import com.dl7.daggerstudy.activity.MulitFruitActivity;

import dagger.Component;

/**
 * Created by long on 2016/5/4.
 */
@Component(modules = MultiFruitModule.class)
public interface MultiFruitComponent {

    //有输入参数返回值类型就是void
    void inject(MulitFruitActivity activity);
}
