package com.barisbalcikoca.odev6.entity;

import java.util.List;

public class TextImage {
    String title;

    List<Image> imageList;

    public TextImage(String title, List<Image> imageList) {
        this.title = title;
        this.imageList = imageList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
