package com.oracleSorulari;

public class Soru39_StaticKeyword {

    String m="m";                               // instance variable
    static String value = "t";                  // static variable
    static{ value += "a"; }                     // static blok
    { value += "c"; }                           // static olmayan blok
    public Soru39_StaticKeyword() {             // parametresiz constructor
        m="h";
        value += "b";
    }
    public Soru39_StaticKeyword(String s) {     // parametreli constructor
        value += s;
        m="k";
    }
    public static void main(String[] args) {
        Soru39_StaticKeyword order = new Soru39_StaticKeyword("f");
        order = new Soru39_StaticKeyword();
        System.out.println(order.value + order.m);
    }

}


/*
        A. tacb
        B. tacfcbk
        C. tacbfh
        D. tacfcbh
        E. tacftach
        F. Kod calismaz.
        G. Kod calisir ama exception olusur.
 */
