package com.hao.dagger.di.module;

import com.hao.dagger.bean.Factory;
import com.hao.dagger.bean.Product2;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @author Yang Shihao
 * @date 2018/3/18
 */
@Module
public class Main4Module {

    private int timeoutTime;

    public Main4Module(int timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

    @Provides
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient().newBuilder().connectTimeout(timeoutTime, TimeUnit.SECONDS).build();
    }

    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient){
       return new Retrofit.Builder().baseUrl("http://192.168.1.1:8080").client(okHttpClient).build();
    }

    /**
     * 如果没有这个方法提供Product2,就需要在Product2的构造方法上添加@Inject注解
     * 但是第三方库的构造方法是没有@Injec注解的，所以要写provide方法
     * @return
     */
    @Provides
    Product2 provideProduct2() {
        return new Product2();
    }

    @Provides
    Factory provideFactory(Product2 product2){
        return new Factory(product2);
    }
}
