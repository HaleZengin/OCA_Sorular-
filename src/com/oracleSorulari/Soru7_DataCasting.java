package com.oracleSorulari;

public class Soru7_DataCasting {
    public static void main(String[] args) {
        /*
        byte a = 40, b = 50;
        byte sum =  (byte) a + b ;
        System.out.println(sum);
        yukaridaki sorudaki hata nasil duzelir ve output ne olur?
         */

        // a ve b byte olarak tanimlanmasina ragmen toplama yapildiginda int olarak kabul eder.
        // yani int olan 90 degerini byte icine koyacaksak casting yapmamiz lazım
        byte a = 40, b = 50;
        byte sum =  (byte) (a + b) ;
        System.out.println(sum);

        // ornegin byte sum = (byte)a + (byte)b; seklinde ayri ayri cast islemi yapsaydik olur muydu?
        // yine hata verirdi. cunku a'yi byte'a cevirir ve sonuc 40'tir. b'yi byte'a cevirir ve sonuc 50'dir.
        // 40+50 =90 yine sonuc int olacagindan yine hata verir. bu yuzden toplamin hepsini beraber byte'a cevirmek gerekir.


    }
}
