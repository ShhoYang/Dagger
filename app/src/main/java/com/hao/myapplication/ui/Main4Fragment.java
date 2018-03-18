package com.hao.myapplication.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hao.myapplication.R;
import com.hao.myapplication.di.component.Main4Component;
import com.hao.myapplication.di.module.Main4FModule;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class Main4Fragment extends Fragment {

    private static final String TAG = "Main4Fragment";

    @Inject
    Retrofit retrofit;


    public Main4Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main4, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //该Fragment的Component用了Subcomponent且Module带参数
        Main4Component main4Component = ((Main4Activity) getActivity()).getMain4Component();
        main4Component.MAIN_4_F_COMPONENT_BUILDER().main4FragmentMoudle(new Main4FModule(10)).builder().inject(this);
        Log.d(TAG, "onViewCreated: retrofit = " + retrofit.hashCode());
    }
}
