package com.example.viewpager4.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager4.R;
import com.example.viewpager4.screens.RowActivity;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {

    String data1[],data2[];
    int images[];
    int imagesback[];
    Context context;
    Activity activity;
    public MyAdapter2(Context ct,Activity vity,String s1[],String s2[],int img[],int imgback[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
        activity = vity;
        imagesback = imgback;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(data1[position]);
        holder.textView2.setText(data2[position]);
        holder.imageView.setImageResource(images[position]);
        holder.layout2.setBackgroundResource(imagesback[position]);

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RowActivity.class);
                Log.d("WELCOMETOMYROW", "onClick: "+position);
                intent.putExtra("adint",position);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2;
        ImageView imageView;
        ConstraintLayout layout,layout2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.player);
            textView2 = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.myImageView);
            layout = itemView.findViewById(R.id.row_layoutid);
            layout2 = itemView.findViewById(R.id.cardviewimg);
        }
    }
}
