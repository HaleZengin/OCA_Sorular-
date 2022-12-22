package com.oracleSorulari;

public class Soru43_Varargs {

    void m1(int a, int... b){

        System.out.println(b.length);
    }
    void m1(char c, String... d){

        System.out.println(d.length);
    } /*
    void m1(String... e, int f){
        System.out.println(e.length);
    }
     */
    public static void main(String[] args) {

        Soru43_Varargs vrg=new Soru43_Varargs();
        vrg.m1(3,4,5,6,7);
        //vrg.m1(67,"Hello","Hi");
        vrg.m1('c',75,80,90);
        vrg.m1('d',"Hello");
    }

}

    /*
    compile time error veren kismi yorum satirina aliniz.
    consoleda cikan sonuc ne olur?
     */


