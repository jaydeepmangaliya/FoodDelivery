package com.example.farmer;

public class MenuModel {
    int img;
    String MenufoodName;
    String Menuprice;

    public MenuModel(int img, String menufoodName, String menuprice) {
        this.img = img;
        MenufoodName = menufoodName;
        Menuprice = menuprice;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMenufoodName() {
        return MenufoodName;
    }

    public void setMenufoodName(String MenufoodName) {
       this. MenufoodName = MenufoodName;
    }

    public String getMenuprice() {
        return Menuprice;
    }

    public void setMenuprice(String Menuprice) {
        this.Menuprice = Menuprice;
    }
}
