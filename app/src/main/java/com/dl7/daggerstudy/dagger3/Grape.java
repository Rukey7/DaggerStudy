package com.dl7.daggerstudy.dagger3;

import com.dl7.daggerstudy.dagger.Fruit;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/4.
 */
public class Grape implements Fruit {

    @Inject
    public Grape() {};

    @Override
    public String getMsg() {
        return "I'm Grape";
    }
}
