package com.example.viewpager4.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.ImageView;

import com.example.viewpager4.Event;
import com.example.viewpager4.adapters.MyAdapter2;
import com.example.viewpager4.R;
import com.example.viewpager4.model.Model;

public class MainActivity2 extends AppCompatActivity {

    String s1[], s2[];
    RecyclerView recyclerView;
    Model model;
    int images[] = {R.drawable.gooseberry,R.drawable.plum,R.drawable.mango,R.drawable.pear,R.drawable.grapefruit,R.drawable.apple,R.drawable.pomegranate,R.drawable.lemon,R.drawable.watermelon};
    int imagesback[] = {R.drawable.greenbackground,R.drawable.redbackground,R.drawable.greenbackground,R.drawable.orangebackground,R.drawable.orangebackground,R.drawable.redbackground,R.drawable.redbackground,R.drawable.orangebackground,R.drawable.greenbackground};


    ImageView imageView;
    MainActivityController2 mainActivityController2;
    MainActivity2View mainActivity2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.Fruit_name);
        s2 = getResources().getStringArray(R.array.description);
        imageView = findViewById(R.id.eq_button);
        MyAdapter2 myAdapter = new MyAdapter2(this,MainActivity2.this,s1,s2,images,imagesback);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        setClickListener(imageView,Event.SETTING_BUTTON);

    }


    private void setClickListener(View view, final Event event)
    {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 notifyListeners(event);
            }
        });

    }
    private void notifyListeners(Event event)
    {
        switch (event){
            case SETTING_BUTTON:
            {
                Intent intent = new Intent(MainActivity2.this,SettingActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}