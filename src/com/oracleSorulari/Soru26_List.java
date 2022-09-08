package com.oracleSorulari;

import java.util.ArrayList;

public class Soru26_List {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (int i = 0; i < values.size() ; i++)
            System.out.print(values.get(i));

        /*
        A. 4
        B. 5
        C. 6
        D. 46
        E. 45
        F. exception olusur.
        G. Kod calismaz.
         */

        /*
        ilk once list'e 4 ve 5 i eklenmis sonra 5 yerine 6 konmus son olarak ilk index silinmis. bu yuzden sadece 6 kalir
        cevap C
         */

    }
}
