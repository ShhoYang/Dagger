package com.hao.dagger.di.component;

import com.hao.dagger.ui.MainActivity;

import dagger.Component;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
