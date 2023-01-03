package com.oracleSorulari;

public class Soru44_StringBuilder {


    public static StringBuilder work(StringBuilder a,                   // metot olusturulmus
                                     StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("s1");                     // s1 objesi oluturulmus
        StringBuilder s2 = new StringBuilder("s2");                     // s2 objesi oluturulmus
        StringBuilder s3 = work(s1, s2);                                // s3 objesi oluturulmus
        System.out.println("s1 = " + s1);                               // s1 = s1
        System.out.println("s2 = " + s2);                               // s2 = s2    sonra degisir ve s2b olur
        System.out.println("s3 = " + s3);                               // s3 = a

    }

}


    /*
        Uyan siklari isaretleyiniz
        A. s1 = a
        B. s1 = s1
        C. s2 = s2
        D. s2 = s2b
        E. s3 = a
        F. s3 = null
        G. Kod calismaz.
    */


    /*
    cvp B, D, E
    */