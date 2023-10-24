package com.barisbalcikoca.java.degiskenler;

import android.util.Log;

public class DegiskenOlusturma {
    public static void main(String[] args) {

        //ctrl+shift+alt+l                  --> kod düzenlenmesine kolaylık sağlar.
        //camel case barisBalcikoca         --> NORMAL DEĞİŞKENLERDE KULLANILIR
        //snake case _ _ _ baris_balcikoca  --> VERİ TABANINDA KULLANILIYOR
        String ogrAd = "Barış"; // Referans tip --> NESNE --> isminin baş harfine dikkat et büyük.
        int ogrYas = 24;//primitive
        double ogrBoy = 1.86;//primitive
        char ogrAdBasHarf = 'B';//primitive
        boolean ogrDevamDurumu = true;//primitive
        System.out.println("Adınız : " + ogrAd + "\nYaşınız : " + ogrYas + "\nBoyunuz : " + ogrBoy + "\nİsminizin Baş Harfi : " + ogrAdBasHarf + "\nDevam Durumu : " + ogrDevamDurumu);

        System.out.println("-----------------------------------------------");//Geçiş için

        //SNAKE CASE
        int urun_id = 3416;
        String urun_adi = "Laptop";
        int urun_adet = 10;
        double urun_fiyat = 25.599;
        String urun_tedarikci = "Casper";
        System.out.println("Ürün ID             : " + urun_id);
        System.out.println("Ürün Adı            : " + urun_adi);
        System.out.println("Ürün Adeti          : " + urun_adet);
        System.out.println("Ürün Fiyatı         : " + urun_fiyat);
        System.out.println("Ürün Tedarikçisi    : " + urun_tedarikci);
        System.out.println("-----------------------------------------------");//Geçiş için


        //SABİT --> CONSTANT --> FINAL (Swift --> let)(Kotlin-->val)(dart-->final-const) --> DEĞİŞMESİ İSTENMEYEN İFADELER. Pİ DEĞERİ HEP AYNIDIR.
        //Hata durumunu azaltır çünkü zaten yazarken sana engel olur.
        final int numara = 26;
        System.out.println(numara);
        //numara = 81; --> HATA verir.
        System.out.println("-----------------------------------------------");//Geçiş için


        //Tür Dönüşümü --> Type casting
        // Explicit --> açıklamalı --> BÜYÜK KÜÇÜĞE DÖNÜŞTÜRÜLECEKSE
        // Unexplicit --> açıklamasız --> KÜÇÜK BÜYÜĞE DÖNÜŞTÜRÜLECEKSE --> SORUNSUZ
        //1. Sayısaldan --> Sayısala
        int i = 67;
        double d = 35.98;
        int sonuc = (int) d; //--> Explicit --> veri kaybına uğrar.
        double sonuc2 = i; // --> Unexplicit
        System.out.println(sonuc + "      " + sonuc2);
        System.out.println("-----------------------------------------------");//Geçiş için

        //2. Sayısaldan --> Metine toString
        String sonuc3 = String.valueOf(i); //"67" şeklinde olur.
        String sonuc4 = String.valueOf(d); //"35.98" şeklinde olur.
        //LOGCAT kısmında görebiliriz istersek.
        //Log.e("Sonuc",sonuc3);
        System.out.println("-----------------------------------------------");//Geçiş için

        //3. Metinden --> Sayısala parseInt
        String yazi1 = "89";
        String yazi2 = "26.0";
        String yazi3 = "Barış";

        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);
        //int sonuc7 = Integer.parseInt(yazi3); --> HATA ALIR
        System.out.println(sonuc5);
        System.out.println(sonuc6);

    }
}
