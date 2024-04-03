package com.example.farmer;

public class cartMode {
    int Ctimg;
    String Cfoodname;
    String Cfoodprice;

    public cartMode(int ctimg, String cfoodname, String cfoodprice) {
        Ctimg = ctimg;
        Cfoodname = cfoodname;
        Cfoodprice = cfoodprice;
    }

    public int getCtimg() {
        return Ctimg;
    }

    public void setCtimg(int Ctimg) {
        this.Ctimg = Ctimg;
    }

    public String getCfoodname() {
        return Cfoodname;
    }

    public void setCfoodname(String Cfoodname) {
        this.Cfoodname = Cfoodname;
    }

    public String getCfoodprice() {
        return Cfoodprice;
    }

    public void setCfoodprice(String Cfoodprice) {
        this.Cfoodprice = Cfoodprice;
    }
}
