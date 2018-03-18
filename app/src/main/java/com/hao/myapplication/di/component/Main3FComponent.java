package com.hao.myapplication.di.component;

import com.hao.myapplication.di.module.Main3FModule;
import com.hao.myapplication.ui.Main3Fragment;

import dagger.Subcomponent;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Subcomponent(modules = Main3FModule.class)
public interface Main3FComponent {

    void inject(Main3Fragment main3Fragment);
}
