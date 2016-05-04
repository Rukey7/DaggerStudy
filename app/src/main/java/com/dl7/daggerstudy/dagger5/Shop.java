package com.dl7.daggerstudy.dagger5;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/4.
 */
public class Shop {

    @Inject
    Ball mBall;

    public Ball getBall() {
        return mBall;
    }
}
