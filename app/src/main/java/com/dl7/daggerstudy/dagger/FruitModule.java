package com.dl7.daggerstudy.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/5/4.
 */
@Module
public class FruitModule {
    @Provides
    public Fruit provideFruit(FruitInfo fruitInfo) {
        return new Apple(fruitInfo);
    }

    //输入参数自动使用到 provideFruitInfo()的返回值,如果没提供返回值
    //则自动查找到FruitInfo中带@Inject的无参构造器并生成实例传入参数info
//    @Provides
//    public FruitInfo provideFruitInfo() {
//        return new FruitInfo("Red", "Big");
//    }
}
