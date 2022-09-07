package com.oracleSorulari;

public class Soru22_Arrays {

    public static void main(String[] args) {

        int arr1[]={1,2,053,4};


        int arr2[][]={{1,2,4},{2,2,1},{0,43,2}};



        System.out.print(arr1[3]==arr2[0][2]);
        // true doner

        System.out.print(" " + (arr1[2]==arr2[2][1]));
        //                      053   ==    43       olur
        // 053 sayisi yazilmis. eger intellij'de 0 ile baslayan bir sayi yazilirsa Java bunu 8'li sistemde (okta) kabul eder
        // yani 053 sayisi decimal karsiligi 43' dür. yani bu esitlik true yazdirir

    }
}
    /*
        A. Kod calismaz
        B. true true
        C. false false
        D. true false
        E. false true
         */

    /*
    cevap D
     */


    /*
    int arr2[][]={{1,2,4},{2,2,1,0},{43,2}};
    bu array'i alttaki gibi yazamayız.
    int arr2[][]= new int[2][]
    outer array 3 tanedir index olarak 2 yazariz ama inner array ' lerin eleman sayilari farklidir
    3 4 ve 2 elemanli array'ler vardir. o yüzden ic ice array'i bu sekilde yazamayiz.
     */

