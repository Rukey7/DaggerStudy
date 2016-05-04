package com.dl7.daggerstudy.dagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/5/4.
 */
@Module
public class ModuleA {

    private String msg;

    // 有参构造函数
    public ModuleA(String msg) {
        this.msg = msg;
    }

    @Provides
    public A provideA() {
        Log.e("ModuleA", "provideA: " + msg);
        return new A();
    }
}
