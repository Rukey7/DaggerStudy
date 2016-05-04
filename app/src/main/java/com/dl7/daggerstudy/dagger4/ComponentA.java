package com.dl7.daggerstudy.dagger4;

import com.dl7.daggerstudy.activity.DependActivity;
import com.dl7.daggerstudy.dagger.FruitModule;

import dagger.Component;

/**
 * Created by long on 2016/5/4.
 */
@Component(dependencies = {ComponentB.class}, modules = {FruitModule.class})
public interface ComponentA {

    void inject(DependActivity activity);
}
