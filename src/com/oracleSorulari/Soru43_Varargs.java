package com.oracleSorulari;

public class Soru43_Varargs {

    void m1(int a, int... b){

        System.out.println(b.length);
    }
    void m1(char c, String... d){

        System.out.println(d.length);
    } /*
    void m1(String... e, int f){                     burada once varargs yazilmis. sonda olmali
        System.out.println(e.length);
    }
     */
    public static void main(String[] args) {

        Soru43_Varargs vrg=new Soru43_Varargs();
        vrg.m1(3,4,5,6,7);                      // 1. metot calisr. 4 yazdirir
        //vrg.m1(67,"Hello","Hi");
        vrg.m1('c',75,80,90);                   // ilk parametre char ama 2. string degil. o yuzden c' yi ascıı degerini alarak 1. metot calisacak. b nin lenght'i 3 yazdirir
        vrg.m1('d',"Hello");                    // 2. metot calisir. 1 yazdirir

    }

}


    /*
    compile time error veren kismi yorum satirina aliniz.
    console'da cikan sonuc ne olur?
     */


    /*
    varargs ile metotlarda istedigimiz kadar parametre gonderebiliriz.
    bu parametreler array olmus olur. index numaralarini yazarak yazdirilir.
    cvp: 4, 3, 1 yazdirir

     */
