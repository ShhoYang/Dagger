package com.hao.myapplication.di.component;

import com.hao.myapplication.ui.Main2Fragment;

import dagger.Component;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component(dependencies = Main2Component.class)
public interface Main2FComponent {

    void inject(Main2Fragment main2Fragment);
}
