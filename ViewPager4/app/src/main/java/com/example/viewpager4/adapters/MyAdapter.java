package com.example.viewpager4.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.viewpager4.Fragments.Fruits.BlueBerryClass;
import com.example.viewpager4.Fragments.Fruits.LemonFragment;
import com.example.viewpager4.Fragments.Fruits.LimeFragment;
import com.example.viewpager4.Fragments.Fruits.PlumFragment;
import com.example.viewpager4.Fragments.Fruits.StrawBerryFragment;

public class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BlueBerryClass();
            case 1:
                return new StrawBerryFragment();
            case 2:
                return new LemonFragment();
            case 3:
                return new PlumFragment();
            case 4:
                return  new LimeFragment();



        }
        return  null;

    }

    @Override
    public int getCount() {
        return 5;
    }
}
