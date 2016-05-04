package com.dl7.daggerstudy.dagger;

import com.dl7.daggerstudy.activity.FruitActivity;

import dagger.Component;

/**
 * Created by long on 2016/5/4.
 */
@Component(modules = {FruitModule.class})
public interface FruitComponent {

    void inject(FruitActivity activity);
}
