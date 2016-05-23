package com.dl7.daggerstudy.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;
import com.dl7.daggerstudy.dagger6.Course;
import com.dl7.daggerstudy.dagger6.DaggerCourseComponent;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ImplActivity extends BaseActivity {

    @Inject
    Course mCourse;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_msg)
    TextView mTvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impl);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "Implement");

        testDagger();
    }

    private void testDagger() {
        DaggerCourseComponent.create().inject(this);
        mTvMsg.setText(mCourse.getName() + ": " + mCourse.getStudentNum() + "\n" +
                mCourse.getStudent().name() + ": " + mCourse.getStudent().gender());
    }
}
