package com.dl7.daggerstudy.dagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/5/4.
 */
@Module
public class ModuleB {

    @Provides
    public B provideB() {
        Log.e("ModuleB", "provideB");
        return new B();
    }
}
