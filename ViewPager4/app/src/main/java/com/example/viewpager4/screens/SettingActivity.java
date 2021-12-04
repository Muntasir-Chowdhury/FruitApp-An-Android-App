package com.example.viewpager4.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.viewpager4.R;

public class SettingActivity extends AppCompatActivity {

    Switch aSwitch;
    boolean c;
    ImageView closebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        aSwitch = findViewById(R.id.switchid);
        closebutton = findViewById(R.id.crossbutton);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                c = b;
            }
        });
        closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c){
                    Intent intent = new Intent(SettingActivity.this,MainActivity.class);
                    startActivity(intent);

                }
                else
                {
                    finish();

                }


            }
        });

    }
}