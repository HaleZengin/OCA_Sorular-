package com.oracleSorulari;

import java.util.Arrays;

public class Soru40_PassByValue {


    public static void main(String[] args) {
        String str= "Java";
        int arr[]={1,2,3};
        method1(str);
        method2(arr);
        System.out.println(Arrays.toString(arr));
        method3(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(str);
    }
    private static void method3(int[] arr) {
        int yeniArr[]={10,11,12,13};
        arr=yeniArr;     }
    private static void method2(int[] arr) {
        arr[1]=4;
        arr[2]=3;     }
    private static void method1(String str) {
        str=str.toUpperCase();
    }

}

    /*

    Dogru olabilecek siklari isaretleyiniz?
    A= [1,2,3]
    B= [1,4,3]
    C= Java
    D= JAVA
    E= 19. satirdan dolayi kod calismaz

    */

    /*

    her bir metotdun kendi scope' u vardir. 1. metotda yapilan degisiklikler main metodu degistirmez.
    16. satir daki str Java yazdirir.
    array' lerdeki degisiklik kalici olur. 2. metotdaki yapilan degisiklik main metotdu degistirir.
    13. satir yazdirildiginda [1,4,3] olur.
    3. metotda yeni bir array olusturulmus. burada referansi ayni ama heap memory' de farkli bir array olusur ve main metotdaki arr' yi degistirmez.
    15. satir yazdirildiginda yine [1,4,3] olur.

    cvp B ve C

     */
