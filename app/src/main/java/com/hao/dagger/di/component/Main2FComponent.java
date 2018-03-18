package com.hao.dagger.di.component;

import com.hao.dagger.ui.Main2Fragment;

import dagger.Component;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component(dependencies = Main2Component.class)
public interface Main2FComponent {

    void inject(Main2Fragment main2Fragment);
}
