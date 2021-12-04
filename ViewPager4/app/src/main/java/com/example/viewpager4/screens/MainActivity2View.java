package com.example.viewpager4.screens;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.viewpager4.R;

public class MainActivity2View extends  BaseObservableView<ActivityScreen.Listener> implements ActivityScreen{

    public MainActivity2View(LayoutInflater inflater, @Nullable ViewGroup parent){
        setRootView(inflater.inflate(R.layout.activity_main2, parent, false));

    }



    @Override
    public void initElements() {

    }
}
