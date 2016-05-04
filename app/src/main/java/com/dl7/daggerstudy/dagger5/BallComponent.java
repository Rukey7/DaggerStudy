package com.dl7.daggerstudy.dagger5;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by long on 2016/5/4.
 */
@Singleton
@Component(modules = BallModule.class)
public interface BallComponent {

    void inject(Shop shop);
}
