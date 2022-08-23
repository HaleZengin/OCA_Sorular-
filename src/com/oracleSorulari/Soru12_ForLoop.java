package com.oracleSorulari;

public class Soru12_ForLoop {

    public static void main(String[] args) {

        for(int i=0; i<10 ; ) {

            i=i++;

            System.out.println(i + " Hello World");
        }

        /*
        Sorunun cevabi nedir?
        A. 9
        B. 10
        C. 11
        D. 6. Satirdan dolayi kod calismaz.
        E. 9. Satirdan dolayi kod calismaz.
        F. Kod sonsuz bir donguye girer.
         */

        /*
        bu sorunun cevabi F dir.
        ama i=i++ yerine sadece i++ deseydi ya da i=i+1 deseydi sonsuz donguye girmezdi. ve 10 tane Hello World yazardi

         */
    }
}
