package com.example.farmer;

public class BuyAgainModel {
    int buyimg;
    String Buyfoodname;
    String Buyfoodprice;

    public BuyAgainModel(int buyimg, String buyfoodname, String buyfoodprice) {
        this.buyimg = buyimg;
        Buyfoodname = buyfoodname;
        Buyfoodprice = buyfoodprice;
    }

    public int getBuyimg() {
        return buyimg;
    }

    public void setBuyimg(int buyimg) {
        this.buyimg = buyimg;
    }

    public String getBuyfoodname() {
        return Buyfoodname;
    }

    public void setBuyfoodname(String Buyfoodname) {
        this.Buyfoodname = Buyfoodname;
    }

    public String getBuyfoodprice() {
        return Buyfoodprice;
    }

    public void setBuyfoodprice(String Buyfoodprice) {
        this.Buyfoodprice = Buyfoodprice;
    }
}
