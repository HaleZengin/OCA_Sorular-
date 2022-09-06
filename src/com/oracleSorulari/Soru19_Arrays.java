package com.oracleSorulari;

import java.util.Arrays;

public class Soru19_Arrays {

    public static void main(String[] args) {

        /*
        int[][] scores = new int[5][];

        Object[][][] cubbies = new Object[3][0][5];

        String beans[] = new beans[6]; // data turu yerine isim yazilmis

        int[][] types = new int[]; // sol taraf iki katli array dolayisiyla sag tarafin da

        int[][] java = new int[][];

        bu arrylerden hangileri dogru degildir?
        */

        // Array yaparken
        int sayi1[]={2,3,8,54,92};
        int sayi2[]=new int[5];
        // ya array'i yapip icini hemen doldururuz ya da array'i yapip kaç tane eleman olacagini yazariz

        // 1. array
        int[][] scores = new int[5][];          // burada 1.katta 5 eleman olacak 2. katta hicbir eleman olmayacak demektir.
        // [null, null, null, null, null] verir

        // 2. array
        Object[][][] cubbies = new Object[3][0][5]; // katli arraydir.
        // [[], [], []] verir

        // 3. array
        // String beans[] = new beans[6];      sorun var  beans[6] yerine String[6] yazilmaliydi




    }

}
