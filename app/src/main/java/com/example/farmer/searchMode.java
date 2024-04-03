package com.example.farmer;

public class searchMode {

    int img;
    String Sfoodname;
    String Sfoodprice;

    public searchMode(int img, String sfoodname, String sfoodprice) {
        this.img = img;
        Sfoodname = sfoodname;
        Sfoodprice = sfoodprice;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getSfoodname() {
        return Sfoodname;
    }

    public void setSfoodname(String Sfoodname) {
        this.Sfoodname = Sfoodname;
    }

    public String getSfoodprice() {
        return Sfoodprice;
    }

    public void setSfoodprice(String Sfoodprice) {
        this.Sfoodprice = Sfoodprice;
    }
}
