package com.oracleSorulari;

import java.util.Arrays;

public class Soru24_Arrays {

    public static void main(String[] args) {

        String[] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");

        }

    }
}

    /*
        A) apple banana grapes pears
        B) pears grapes banana apple
        C) banana apple pears grapes
        D) Kod calismaz
     */

    /*
    sort() yaptigi icin alfabeye gore siralama yapar
    cevap A
     */


