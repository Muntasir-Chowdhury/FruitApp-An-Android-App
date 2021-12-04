package com.example.viewpager4.screens;

import android.content.Context;
import android.view.View;


public abstract  class BaseView implements BaseViewInf{
    View mRootView;
    @Override
    public View getRootView() {
        return mRootView;
    }
    protected void setRootView(View mRootView)
    {
        this.mRootView = mRootView;
    }
    protected <T extends View> T findViewById(int id)
    {
        return getRootView().findViewById(id);
    }

    protected Context getContext()
    {
        return getRootView().getContext();
    }


}
