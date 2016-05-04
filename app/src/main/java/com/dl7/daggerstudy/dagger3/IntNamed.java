package com.dl7.daggerstudy.dagger3;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by long on 2016/5/4.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface IntNamed {
    int value();
}
