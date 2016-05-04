package com.dl7.daggerstudy.dagger5;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/5/4.
 */
@Module
public class BallModule {

    @Singleton
    @Provides
    public Ball provideBall() {
        return new Ball();
    }
}
