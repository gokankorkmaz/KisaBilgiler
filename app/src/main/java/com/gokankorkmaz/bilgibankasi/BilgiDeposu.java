package com.gokankorkmaz.bilgibankasi;

import java.util.Random;

/**
 * Created by gokhan on 03.03.2016.
 */
public class BilgiDeposu {

    //Değişkenler (Nesnenin Özellikleri)

    //Metodlar(Bu Nesnenin Yetenekler)

    //STRİNG DİZİSİ TANIMLADIM
   public String[] mBilgiler = {
            "Ağızdan sarımsak kokusunun gitmesi için yapılabilecek en etkili yöntem 1-2 bardak süt içmektir.",
            "Dünyada her dakika iki tane düşük şiddette deprem olmaktadır.",
            "Hindistan'daki yıllık doğum sayısı, Avustralya'nın toplam nüfusundan fazladır.",
            "Rusya'nın dörtte biri ormanlarla kaplıdır.",
            "Tarih boyunca yeryüzünde bulunan altın 200 kat daha fazlası okyanuslarda bulunmaktadır.",
            "Köpeklerin ter bezleri ayaklarındadır.",
            "Yazar Rudyard Kipling sadece siyah mürekkep kullanırdı.",
            "Mickey Mouse'dan önce en meşhur çizgi film kahramanı Felix The Cat'di.",
            "Larry Hagman (JR.)Dallas dizisinin setinde hiç kimsenin sigara içmesine izin vermezdi.",
            "Salatalığın yüzde 96'sı sudur.",
            "Timsahlar renk körüdür.",
            "Yarım kilo bal yapabilmek için arılar iki milyondan fazla çiçekten bitki özü toplamak zorundadırlar.",
            "Tarantulalar iki buçuk yıl yiyeceksiz yaşayabilirler."
    };




    public String getBilgi(){  // bu fonksiyonun cıktısı string olacak



        //Rastgele Sayı Olusturma
        Random rastgelesayiolusturucu = new Random();
        int rastgelesayi = rastgelesayiolusturucu.nextInt(mBilgiler.length);

        String bilgi="";
        bilgi= mBilgiler[rastgelesayi];
        return bilgi;               //bilgi degerini döndurecek
    }

}
