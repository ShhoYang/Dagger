package com.hao.dagger.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hao.dagger.R;
import com.hao.dagger.di.component.DaggerMain2FComponent;
import com.hao.dagger.di.component.Main2Component;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class Main2Fragment extends Fragment {

    private static final String TAG = "Main2Fragment";

    @Inject
    Retrofit retrofit;


    public Main2Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //该Fragment的Component继承于它的Activity的Component，所以要从Activity那里拿到Component
        Main2Component main2Component = ((Main2Activity) getActivity()).getMain2Component();
        DaggerMain2FComponent.builder().main2Component(main2Component).build().inject(this);
        Log.d(TAG, "onViewCreated: retrofit = " + retrofit.hashCode());
    }
}
