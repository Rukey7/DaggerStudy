package com.dl7.daggerstudy.dagger3;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/5/4.
 */
@Module
public class MultiFruitModule {

    @Named("typeA")
    @Provides
    public Banana provideBanana() {
        return new Banana();
    }

    @Named("typeB")
    @Provides
    public Pear providePear() {
        return new Pear();
    }

    @IntNamed(1)
    @Provides
    public Grape provideGrape() {
        return new Grape();
    }
}
