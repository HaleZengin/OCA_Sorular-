package com.oracleSorulari;

import java.util.ArrayList;
import java.util.List;

public class Soru25_List {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);      burayı yorum satirina aldik
        // cunku <String> burada ne istiyorsak o data type'i koymaliyiz

        for (int i = 0; i < list.size() ; i++)
            System.out.print(list.get(i));



        /*
        A. onetwo
        B. onetwo7
        C. onetwo yazar ve sonra exception olusur
        D. 12. Satirdan dolayi kod calismaz.
        E. 13. Satirdan dolayi kod calismaz.
         */

        /*
        cevap E
         */

    }
}
