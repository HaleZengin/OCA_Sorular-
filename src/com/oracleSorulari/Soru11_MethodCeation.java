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

     */
}
