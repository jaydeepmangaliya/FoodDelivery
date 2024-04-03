package com.example.farmer;

public class popularModel {
   int img;
   String foodname;
   String foodsprice;
   public  popularModel(int img , String foodname , String foodsprice){

       this.img = img;
       this.foodname =foodname;
       this.foodsprice = foodsprice;

   }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodsprice() {
        return foodsprice;
    }

    public void setFoodsprice(String foodsprice) {
        this.foodsprice = foodsprice;
    }
}
