package com.hao.dagger.di.component;

import com.hao.dagger.di.module.Main4Module;
import com.hao.dagger.ui.Main4Activity;

import dagger.Component;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component(modules = Main4Module.class)
public interface Main4Component {

    void inject(Main4Activity main4Activity);

    Main4FComponent.Main4FComponentBuilder MAIN_4_F_COMPONENT_BUILDER();
}
