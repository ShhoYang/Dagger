package com.hao.dagger.di.component;

import com.hao.dagger.di.module.Main3Module;
import com.hao.dagger.ui.Main3Activity;

import dagger.Component;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component(modules = Main3Module.class)
public interface Main3Component {

    void inject(Main3Activity main3Activity);

    Main3FComponent MAIN_3_F_COMPONENT();
}
