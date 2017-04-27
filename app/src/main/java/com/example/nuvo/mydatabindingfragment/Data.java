package com.example.nuvo.mydatabindingfragment;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Data extends BaseObservable{
    private String txt1 = "aaa";

    @Bindable
    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
//        notifyPropertyChanged(edi.com.mydatabindingsimple.BR.txt1);
        notifyPropertyChanged(BR.txt1);
    }
}
