package com.oracleSorulari;

public class Soru29_ForLoop {

    public static void main(String[] args) {

        int sayi = 0;
        int sum=0;

        for (sayi = 3; sayi>1 ; sayi/=sayi++)
            sum+=sayi;

        System.out.println(sum);

         /*
            A. sonsuz loop olusur
            B. 1
            C. 3
            D. 8.satirdan dolayi kod calismaz
            E. Kod calistirilirsa exception olusur
         */

        /*
        sayi/=sayi++ kisminda post increment kullanilmis. once atama sonra arttirma yapilacak
        once sayi yi sayi ya bol 3/3=1 oldu sonra sayinin degerini 1 arttirir. sayi 2 oldu
        sayi nin degeri 1 olunca sayi>1 nin degeri false oldugu icin loop sadece 1 kez calismis olacak
        cevap C
         */

    }
}
