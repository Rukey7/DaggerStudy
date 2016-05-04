package com.dl7.daggerstudy.dagger4;

import com.dl7.daggerstudy.dagger3.Banana;
import com.dl7.daggerstudy.dagger3.Grape;
import com.dl7.daggerstudy.dagger3.MultiFruitModule;
import com.dl7.daggerstudy.dagger3.Pear;

import dagger.Component;

/**
 * Created by long on 2016/5/4.
 */
@Component(modules = MultiFruitModule.class)
public interface ComponentB {


    // ComponentA依赖ComponentB,假设ComponentA中module中找不到banana，
    // 但是ComponentB的module有，ComponentB必须提供带返回值的方法如下
    Pear pear();
    // 实现类会返回由@Inject标记的构造函数生成的实例
    Banana banana();
    Grape grape();
}
