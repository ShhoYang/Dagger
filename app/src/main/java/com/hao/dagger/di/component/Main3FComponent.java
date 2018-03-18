package com.hao.dagger.di.component;

import com.hao.dagger.di.module.Main3FModule;
import com.hao.dagger.ui.Main3Fragment;

import dagger.Subcomponent;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Subcomponent(modules = Main3FModule.class)
public interface Main3FComponent {

    void inject(Main3Fragment main3Fragment);
}
