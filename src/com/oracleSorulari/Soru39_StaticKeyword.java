package com.oracleSorulari;

public class Soru39_StaticKeyword {

    String m="m";
    static String value = "t";
    static{ value += "a"; }
    { value += "c"; }
    public Soru39_StaticKeyword() {
        m="h";
        value += "b";
    }
    public Soru39_StaticKeyword(String s) {
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
