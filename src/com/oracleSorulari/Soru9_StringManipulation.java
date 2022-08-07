package com.oracleSorulari;

public class Soru9_StringManipulation {
    public static void main(String[] args) {
        String s = "purr";
        s.toUpperCase();                // PURR olur ama atama olmadigi icin s nin degeri degismez
        s.trim();                       // purr kelimesinin basinda ve sonunda bosluk varsa keser ama atama olmadigi icin s nin degeri degismez
        s.substring(1, 3);              // calisir ama atama olmadigi icin s nin degeri degismez
        s += " two";                    // purr two olur ve atama oldugu icin s nni artik yeni degeridir.
        System.out.println(s.length()); // 8

        /*
        hangi siklar dogrudur?
        A. 2
        B. 4
        C. 8
        D. 10
        E. Kod exception olusturur.
        F. Kod calismaz.
        */
        // cevap C
    }
}
