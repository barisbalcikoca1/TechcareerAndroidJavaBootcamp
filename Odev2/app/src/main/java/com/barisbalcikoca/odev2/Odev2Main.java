package com.barisbalcikoca.odev2;

public class Odev2Main {
    public static void main(String[] args) {

        Odev2 o2 = new Odev2();


        //PART1
        System.out.println("kmToMile");
        o2.kmToMile(85);
        System.out.println("--------------");


        System.out.println("diktorgenAlan");
        o2.dikdortgenAlanHesapla(8,6.45);
        System.out.println("--------------");


        System.out.println("faktoriyelHesaplama");
        o2.faktoriyelHesapla(5);
        System.out.println("--------------");


        System.out.println("e harfi arama");
        o2.harfArama("Kelime");
        System.out.println("--------------");

        //PART2

        System.out.println("içAçıHesaplama");
        o2.icAciHesaplama(4);
        System.out.println("--------------");


        System.out.println("maasHesaplama");
        o2.maasHesapla(28);
        System.out.println("--------------");


        System.out.println("otoparkUcretHesaplama");
        o2.otoparUcretHesapla(289);

    }
}
