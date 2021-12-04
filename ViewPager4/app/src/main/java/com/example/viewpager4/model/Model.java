package com.example.viewpager4.model;

public class Model {


         int images , imagesback ;
         String s1,s2,s3;

    public Model(int images, int imagesback, String s1, String s2) {
        this.images = images;
        this.imagesback = imagesback;
        this.s1 = s1;
        this.s2 = s2;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
