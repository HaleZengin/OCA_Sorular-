package com.oracleSorulari;

public class Soru41_Immutable {

    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");

    }
}

    /*
        Hangi siklar dogru olabilir?
        A. one
        B. two
        C. three
        D. four
        E. five
        F. Kod Calismaz.
     */


    /*
    eger bir objenin degerini degistiremiyorsak buna immutable denir.

    cvp A C D
     */


