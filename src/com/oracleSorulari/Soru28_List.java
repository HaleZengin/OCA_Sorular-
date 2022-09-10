package com.oracleSorulari;

import java.util.Arrays;
import java.util.List;

public class Soru28_List {
    public static void main(String[] args) {

        String [] names = {"Tom", "Dick", "Harry"};
        // List<String> list = names.asList();
        // sorunun orjinali yukaridaki gibidir ve kod calismaz
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);

        /*
        A. Sue
        B. Tom
        C. 8. Satirdan dolayi kod calismaz.
        D. 10. Satirdan dolayi kod calismaz.
        E. Kod exception olusturur.
         */

        /*
        cevap D
         */

        /*
        eger 10.satir 12.satir gibi yazilsaydi,
        array list'e cevrilmisve 0.index'i Sue olarak degistirilmis
        burada yazdirma kisminda array'in 0. index'i sorulmasina ragmen list olarak degistirilen gecerlidir
        yani array'in de 0. index'i Sue olur
         */


    }
}
