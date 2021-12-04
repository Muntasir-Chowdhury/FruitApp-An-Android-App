package com.example.viewpager4.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpager4.adapters.MyAdapter;
import com.example.viewpager4.R;

import me.relex.circleindicator.CircleIndicator;


public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyAdapter adapter;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initvar();
        adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        indicator.setViewPager(viewPager);
        adapter.registerDataSetObserver(indicator.getDataSetObserver());


    }

    private void initvar() {
        viewPager = findViewById(R.id.ViewPager);
        indicator = findViewById(R.id.indicator);
    }

}