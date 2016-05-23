package com.dl7.daggerstudy.dagger6;

import javax.inject.Inject;

/**
 * Created by long on 2016/5/23.
 */
public class Math implements Course {

    String mName;
    int mStudentNum;
    Student mStudent;

    @Inject
    public Math(Student student) {
        mName = "Math";
        mStudentNum = 123;
        mStudent = student;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public int getStudentNum() {
        return mStudentNum;
    }

    @Override
    public Student getStudent() {
        return mStudent;
    }
}
