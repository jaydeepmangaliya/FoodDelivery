package com.example.farmer;

public class notificationModel {
    int Notiimg;
    String Nofimess;

    public notificationModel(int notiimg, String nofimess) {
        Notiimg = notiimg;
        Nofimess = nofimess;
    }

    public int getNotiimg() {
        return Notiimg;
    }

    public void setNotiimg(int Notiimg) {
       this.Notiimg = Notiimg;
    }

    public String getNofimess() {
        return Nofimess;
    }

    public void setNofimess(String Nofimess) {
        this.Nofimess = Nofimess;
    }
}
