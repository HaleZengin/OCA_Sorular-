package com.oracleSorulari;

public class Soru13_WhileLoop {

    public static void main(String[] args) {
        int x = 0;


        while(x++ < 10) { }

        String message = x > 10 ? "Greater than" : "false";

        System.out.println(message+","+x);
    }

    /*
    Kod blogu calisirsa sonuc ne olur?

    A. Greater than,10
    B. false,10
    C. Greater than,11
    D. false,11
    E. 6. Satirdan dolayi kod calismaz.
    F. 7. Satirdan dolayi kod calismaz.
    */


    /*
    9. satirda once post increment var. once while icindeki sarti kontrol eder sonra arttirir.
    sart false olana kadar x arta arta devam eder.
    10<10 olur while dongusunden cikar. ve x'i 1 arttirir artik x' in degeri 11 dir.
    11. satira gelir. 11>10 olur ve Greater than yazar.
    */

    }

