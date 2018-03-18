package com.hao.myapplication.di.module;

import com.hao.myapplication.bean.Product;

import dagger.Module;
import dagger.Provides;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */
@Module
public class Main3FModule {

//    private int timeoutTime;
//
//    public Main3FModule(int timeoutTime) {
//        this.timeoutTime = timeoutTime;
//    }

   @Provides
    Product provideProduct(){
        return new Product();
   }
}
