package com.barisbalcikoca.odev2;

public class Odev2 {

    //PART1

    //1. Paramtere olarak girilen kilometreyi mile dönüştürdükten sonra GERİYE DÖNDÜREN bir metod yazınız
    // Mile = Km * 0.621;
    public double kmToMile(double km) {
        final double kmToMile = 0.621;
        if(km<=0)
        {
            System.out.println("Lütfen 0 dan büyük değer giriniz");
        }
        System.out.println(km+" km = "+kmToMile*km+" mil");
        return  km * kmToMile;
    }


    //2. Kenarları parametre olarak girilen ve dikdörtgenin alanını hesaplayan metod yazınız. VOID
    public void dikdortgenAlanHesapla(double kenar1, double kenar2) {
        double alan = kenar1 * kenar2;
        System.out.println("Bir kenarı "+kenar1+" ve diğer kenarı "+kenar2+" olan bir dikdortgenin alanı : "+alan);
    }

    //3. Paramtere olarak girilen sayının faktoriyel değerini hesaplayan GERİYE DÖNDÜREN metodu yazınız.

    public int faktoriyelHesapla(int deger) {
        int fakt = 1;
        if(deger<0){
            System.out.println("0 dan büyük değer giriniz.");
        }
        for (int i = 1; i <= deger; i++) {
            fakt *= i;
        }
        System.out.println(deger + " faktoriyel : " + fakt);
        return fakt;
    }
    //4. Paramtere olarak girilen kelime içinde kaç adet e harfi olduğunu gösteren metod yazınız VOID

    public void harfArama(String kelime) {
        int sayac = 0;

        for (int i = 0; i < kelime.length(); i++){
            if(kelime.charAt(i)=='e' || kelime.charAt(i)=='E'){
                sayac++;
            }
        }
        System.out.println(kelime+" kelimesinde "+sayac+" tane e bulunur");
    }

    //PART2

    //1. Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu GERİ gönderen metod yazınız.
    //İç açılar toplamı = (kenarSayısı-2) *180 dir.

    public int icAciHesaplama(int kenarSayisi){
        int icAcilarToplami = (kenarSayisi-2) *180;
        System.out.println("Kenar sayısı "+kenarSayisi+" olan bir çokgenin iç açıları toplamı "+icAcilarToplami+" kadardır.");
        return icAcilarToplami;
    }

    //2.Paramtere olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri DÖNDÜREN metod yazınız.
    //1 günde 8 saat çalışabilir.
    //Çalışma saat ücreti : 40₺
    //Mesai saat ücreti : 80₺
    //150 saat üzeri mesai sayılır.
    public int maasHesapla(int gunSayisi){

        final int calismaGünSayisi = 8;

        int maas = 0;
        int calismaSaati = gunSayisi*calismaGünSayisi;

        if(calismaSaati>150){

            int mesaiCalismaSaati = calismaSaati-150;
            maas = (150*40)+(mesaiCalismaSaati*80);

        } else{
            maas = calismaSaati*40;
        }
        System.out.println(gunSayisi+" gün çalışan işçinin maaşı : "+maas +" kadardır.");
        return maas;
    }


    //3. Paramtere olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri DÖNDÜREN metodu yazınız.
    //1 saat = 50₺
    //1 saat aşımından sonra her 1 saat 10₺
    public int otoparUcretHesapla(int dakika){
        final int saatBasiUcret = 50;
        int odenececkTutar = 0;
        if(dakika<60&&dakika>=0)
        {
            System.out.println(dakika+" dakika otopark ücreti 0₺ kadardır.");
        }
        else if(dakika>=60){

            int saat = dakika/60;
            odenececkTutar = saatBasiUcret+ ((saat-1)*10);
            System.out.println(dakika+" dakika otopark ücreti : "+odenececkTutar+"₺ kadardır.");
        }
        else{
            System.out.println("Geçersiz dakika parametresi girdiniz.");
        }
        return odenececkTutar;
    }
}
