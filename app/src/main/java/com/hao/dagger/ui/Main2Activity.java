package com.hao.dagger.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hao.dagger.R;
import com.hao.dagger.bean.Factory;
import com.hao.dagger.di.component.DaggerMain2Component;
import com.hao.dagger.di.component.Main2Component;
import com.hao.dagger.di.module.Main2Module;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";


    @Inject
    OkHttpClient okHttpClient;

    @Inject
    Retrofit retrofit;

    @Inject
    Factory factory;

    private Main2Component main2Component;

    public Main2Component getMain2Component() {
        return main2Component;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);



        main2Component = DaggerMain2Component.builder().main2Module(new Main2Module(10)).build();
        main2Component.inject(this);

        getSupportFragmentManager().beginTransaction().add(R.id.frame,new Main2Fragment()).commit();

        Log.d(TAG, "onCreate: okHttpClient = " + okHttpClient.hashCode());
        Log.d(TAG, "onCreate: retrofit = " + retrofit.hashCode());
        Log.d(TAG, "onCreate: factory = " + factory.hashCode());
        Log.d(TAG, "onCreate: factory. = " + factory.getProduct2().hashCode());
    }
}
