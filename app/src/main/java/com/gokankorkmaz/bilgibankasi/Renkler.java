package com.gokankorkmaz.bilgibankasi;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by gokhan on 03.03.2016.
 */
public class Renkler {

    //Değişkenler (Nesnenin Özellikleri)

    //Metodlar(Bu Nesnenin Yetenekler)

    //STRİNG DİZİSİ TANIMLADIM
    public String[] mRenkler = {
    "#D32F2F",
    "#8E24AA",
    "#673AB7",
    "#009688",
    "#CDDC39",
    "#4CAF50",
    "#FF9800",
    "#795548",
    "#FF5722",

    };


    public int getRenkler() {  // bu fonksiyonun cıktısı string olacak


        //Rastgele Sayı Olusturma
        Random rastgelesayiolusturucu = new Random();
        int rastgelesayi = rastgelesayiolusturucu.nextInt(mRenkler.length);

        String renk = "";
        renk = mRenkler[rastgelesayi];
        int renkInt  = Color.parseColor(renk);
        return renkInt;
    }

}
