package com.oracleSorulari;

public class Soru11_MethodCeation {

     /*
     Asagidaki kod blogu calisirsa sonuc ne olur?
        A. -1
        B. 9
        C. 81
        D. 23. Satirdan dolayi Compile error olusur.
        E. Baska bir satirdan dolayi Compile error olusur.
     */

    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {

        int value = 9;
        long result = square(value);
        System.out.println(value);


    }

    /*
    bu soruda once main method calisir.
    20. satir calisir
    value=9 dur
    result variable' nin degerinde bir method call var. biz de bunu takip ederiz ve square icin ustteki methoda gideriz
    simdi 14. satir calisir
    square(value) kisminda value degeri 9 du. method'da int x yerine 9 gelir
    y' nin degeri 9*9 oldu
    x' in yeni degeri -1 oldu ama kalici degisiklik olmadi
    return y degeri olarak en sondaki islem gelir 9*9=81
    y degeri artik value degeridir. 23. satira geri gelir. artik result degeri 81'dir.
    24. satir calisir. value degeri 9 dur. konsolda 9 yazar.

    cevap B

     */
}
