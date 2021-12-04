package com.example.viewpager4.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.viewpager4.R;

public class RowActivity extends AppCompatActivity {
    int intValue,v2;
    Button button2;
    LinearLayout button;
    ConstraintLayout constraintLayout;
    ImageView imageView;
    String z1[] ,z2[];
    int images[] = {R.drawable.gooseberry,R.drawable.plum,R.drawable.mango,R.drawable.pear,R.drawable.grapefruit,R.drawable.apple,R.drawable.pomegranate,R.drawable.lemon,R.drawable.watermelon};
    int imagesback[] = {R.drawable.greenbackground,R.drawable.redbackground,R.drawable.greenbackground,R.drawable.orangebackground,R.drawable.orangebackground,R.drawable.redbackground,R.drawable.redbackground,R.drawable.orangebackground,R.drawable.greenbackground};

    ConstraintLayout layout;
    TextView boldtextView,longtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row);
        Intent mIntent = getIntent();
        intValue = mIntent.getIntExtra("adint",0);
        System.out.println(intValue);
        constraintLayout = findViewById(R.id.imagelayout);
        constraintLayout.setBackground(getResources().getDrawable(imagesback[intValue]));
        imageView = findViewById(R.id.arimage);
        imageView.setImageResource(images[intValue]);
        v2 = 0;
        z1 = getResources().getStringArray(R.array.Fruit_name);
        z2 = getResources().getStringArray(R.array.long_description);
        layout = findViewById(R.id.rowactivitylayout);

        Log.d("Hello" , "onCreate: "+intValue);
        boldtextView  = findViewById(R.id.boldTextview);
        longtextView = findViewById(R.id.longtxt);
        boldtextView.setText(z1[intValue]);
        longtextView.setText(z2[intValue]);
        if(intValue==0 || intValue==2 || intValue==8)
        {
            boldtextView.setTextColor(getResources().getColor(R.color.green));
        }
        else if(intValue==1 || intValue==5 || intValue==6)
        {
            boldtextView.setTextColor(getResources().getColor(R.color.red));
        }
        else
        {
            boldtextView.setTextColor(getResources().getColor(R.color.orange));

        }
        button = findViewById(R.id.fruit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        /*button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 layout.setBackgroundColor(getResources().getColor(R.color.purple_200));
            }
        });*/

    }
}