package com.dl7.daggerstudy.dagger6;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/23.
 */
public class Boy implements Student {

    String name;
    String gender;

    @Inject
    public Boy() {
        name = "Boy";
        gender = "Man";
    }


    @Override
    public String gender() {
        return gender;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
