package com.hao.myapplication.di.component;

import com.hao.myapplication.ui.MainActivity;

import dagger.Component;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */

@Component
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
