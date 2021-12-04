package com.example.viewpager4.Fragments.Fruits;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.viewpager4.screens.MainActivity;
import com.example.viewpager4.screens.MainActivity2;
import com.example.viewpager4.R;


public class LemonFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lemon, container, false);
        LinearLayout button = view.findViewById(R.id.layout_button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                ((MainActivity) getActivity()).startActivity(intent);
            }
        });

        return view;



    }
}