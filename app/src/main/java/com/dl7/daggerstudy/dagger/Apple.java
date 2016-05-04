package com.dl7.daggerstudy.dagger;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/3.
 */
public class Apple implements Fruit {

    private FruitInfo mFruitInfo;

    public Apple() {
    }

    @Inject
    public Apple(FruitInfo fruitInfo) {
        mFruitInfo = fruitInfo;
    }

    @Override
    public String getMsg() {
        if (mFruitInfo != null) {
            return mFruitInfo.color + " " + mFruitInfo.size + " Apple";
        } else {
            return "I'm Apple";
        }
    }

}
