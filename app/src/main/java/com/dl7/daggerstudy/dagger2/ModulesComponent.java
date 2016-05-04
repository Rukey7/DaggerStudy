package com.dl7.daggerstudy.dagger2;

import com.dl7.daggerstudy.activity.ModulesActivity;

import dagger.Component;

/**
 * Created by long on 2016/5/4.
 */
@Component(modules = {ModuleA.class, ModuleB.class})
public interface ModulesComponent {

    void inject(ModulesActivity activity);
}
