package com.dl7.daggerstudy.dagger;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/4.
 */
public class FruitInfo {

    String color;
    String size;

    @Inject
    public FruitInfo() {
        this.color = "Blue";
        this.size = "Small";
    }

    public FruitInfo(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
