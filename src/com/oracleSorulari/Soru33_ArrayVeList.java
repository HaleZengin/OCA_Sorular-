package com.oracleSorulari;

import java.util.ArrayList;
import java.util.List;

public class Soru33_ArrayVeList {

    public static void main(String[] args) {

        int[] array = {6,9,8};

        List<Integer> list = new ArrayList<>();
        list.add(array[0]);             // 6 eklenir
        list.add(array[2]);             // 8 eklenir
        list.set(1, array[1]);          // 1. index deki 8 elemanı arrayin 1. indexi ile degistir. {6 , 9 }
        list.remove(0);           // 6 yi kaldir
        System.out.println(list);       // sadece 9 kalir
    }

     /*
        A. [8]
        B. [9]
        C. [Ljava.lang.String;@160bc7c0 turu bir sonuc
        D. Kod calistirilirsa exception olusur.
        E. Kod calismaz.
        */

        /*
        cevap B
        */


    }


