package com.dl7.daggerstudy.dagger6;

import com.dl7.daggerstudy.activity.ImplActivity;

import dagger.Component;

/**
 * Created by long on 2016/5/23.
 */
@Component(modules = CourseModule.class)
public interface CourseComponent {
    void inject(ImplActivity activity);
}
