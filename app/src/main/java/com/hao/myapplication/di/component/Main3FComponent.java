package com.hao.myapplication.di.component;

import com.hao.myapplication.di.module.Main3FModule;
import com.hao.myapplication.ui.Main3Fragment;

import dagger.Component;
import dagger.Subcomponent;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Subcomponent
public interface Main3FComponent {

    void inject(Main3Fragment main3Fragment);
}
