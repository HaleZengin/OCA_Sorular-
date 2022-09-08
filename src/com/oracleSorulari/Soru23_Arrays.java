package com.oracleSorulari;

import java.util.Arrays;

public class Soru23_Arrays {
    public static void main(String[] args) {

        int[] random = { 16, -41, 112, 10, -110 };

        int x = 10;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}

    /*
      A.  2
      B.  3
      C.  6
      D.  Sonuc belirlenemez.
      E.  Bir exception olusur
      F.  Kod calismaz.
     */

    /*
    bir array'de istenen elemannin olup olmadigini ararken binarySearch metodu kullanilir.
    ama oncesinde mutlaka sort() yapilmali
    bu soruda sort() yapilmamis. sonuc dogru da yanlis da olabilir.
    cevap D
     */

