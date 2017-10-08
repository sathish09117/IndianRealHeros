package com.smdeveloper.vvsn.indianrealheros;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sathish kumar on 15-09-2017.
 */

public class Tab2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview  = inflater.inflate(R.layout.activity_tab2,container,false);
        return myview;
    }
}
