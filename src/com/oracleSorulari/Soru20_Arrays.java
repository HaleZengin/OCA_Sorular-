package com.oracleSorulari;

public class Soru20_Arrays {

    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        System.out.println(arr instanceof Object);


        /*
        A. Bu arrayin uzunluğu 3'tür.
        B. 4. satırdaki hata nedeniyle CTE verir.
        C. Konsolda false yazdirir.
        D. Konsolda true yazdirir.
        E. 7. satırdaki hata nedeniyle CTE verir.
        */


        // instanceof keyword'u bir nesnenin belirli bir turde olup olmadigini kontrol etmek icin kullanilir.
        // burada verilen array'in Object olup olmadigini soruyor.

        // array'ler non-primitive data turundendir. Object de hepsini kapsar. yani array bir Object' tir.
        // cevap D


    }

}
