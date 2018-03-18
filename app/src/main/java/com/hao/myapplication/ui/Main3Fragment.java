package com.hao.myapplication.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hao.myapplication.R;
import com.hao.myapplication.di.component.Main3Component;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class Main3Fragment extends Fragment {

    private static final String TAG = "Main3Fragment";

    @Inject
    Retrofit retrofit;


    public Main3Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //该Fragment的Component用了Subcomponent
        Main3Component main3Component = ((Main3Activity) getActivity()).getMain3Component();
        main3Component.MAIN_3_F_COMPONENT().inject(this);
        Log.d(TAG, "onViewCreated: retrofit = " + retrofit.hashCode());
    }
}
