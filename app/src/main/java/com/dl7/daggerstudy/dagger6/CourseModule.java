package com.dl7.daggerstudy.dagger6;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/5/23.
 */
@Module
public class CourseModule {

    @Provides
    Course provideCourse(Math math) {
        return math;
    }

    @Provides
    Student provideStudent() {
        return new Boy();
    }
}
