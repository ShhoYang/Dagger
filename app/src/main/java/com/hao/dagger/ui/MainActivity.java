package com.hao.dagger.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hao.dagger.R;
import com.hao.dagger.bean.Factory;
import com.hao.dagger.bean.Product;
import com.hao.dagger.di.component.DaggerMainComponent;

import javax.inject.Inject;

/**
 * 不需要module
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Product product;

    @Inject
    Factory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        DaggerMainComponent.create().inject(this);
        Log.d(TAG, "onCreate: product = " + product.hashCode());
        Log.d(TAG, "onCreate: factory = " + factory.hashCode());
        Log.d(TAG, "onCreate: factory.product = " + factory.getProduct().hashCode());
    }
}
