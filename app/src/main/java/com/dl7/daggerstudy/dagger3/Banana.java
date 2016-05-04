package com.dl7.daggerstudy.dagger3;

import com.dl7.daggerstudy.dagger.Fruit;
import com.dl7.daggerstudy.dagger.FruitInfo;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/4.
 */
public class Banana implements Fruit {

    private FruitInfo mFruitInfo;

    public Banana() {
    }

    //被@Inject标记，使用这个构造器生成实例
    @Inject
    public Banana(FruitInfo fruitInfo) {
        mFruitInfo = fruitInfo;
    }

    @Override
    public String getMsg() {
        if (mFruitInfo != null) {
            return mFruitInfo.getColor() + " " + mFruitInfo.getSize() + " Banana";
        } else {
            return "I'm Banana";
        }
    }
}
