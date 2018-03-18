package com.hao.dagger.di.component;

import com.hao.dagger.di.module.Main2Module;
import com.hao.dagger.ui.Main2Activity;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component(modules = Main2Module.class)
public interface Main2Component {

    void inject(Main2Activity main2Activity);

    /**
     * MainF2Component继承了该类，要显式暴露需要提供的依赖
     * @return
     */
    Retrofit provideRetrofit();
}
