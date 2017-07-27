package com.example.phamm.customlistviewandcustomadapter_demo;

/**
 * Created by phamm on 7/27/2017.
 */

public class FlagFootball {
    private String Ten;
    private String Nam;
    private int hinh;

    public FlagFootball(String ten, String nam, int hinh) {
        Ten = ten;
        Nam = nam;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String nam) {
        Nam = nam;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
