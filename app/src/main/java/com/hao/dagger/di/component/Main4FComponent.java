package com.hao.dagger.di.component;

import com.hao.dagger.di.module.Main4FModule;
import com.hao.dagger.ui.Main4Fragment;

import dagger.Subcomponent;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Subcomponent(modules = Main4FModule.class)
public interface Main4FComponent {

    void inject(Main4Fragment main4Fragment);

    @Subcomponent.Builder
    interface Main4FComponentBuilder{

        Main4FComponentBuilder main4FragmentMoudle(Main4FModule main4FModule);

        Main4FComponent builder();
    }
}
