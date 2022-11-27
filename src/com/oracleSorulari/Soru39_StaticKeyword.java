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

  /*
        once static blok devreye girer. (value=ta) sonra main metot calisir.
        18. satir calisir. burada f diye bir parametre koyulmus yani parametreli constructor calisir.
        ama static olmadigi icin once static olmayan blok calisir (value=tac)
        artik parametreli constructor calisir. burada s variable' inin degerini f vermis
        bu yuzden value degerine f eklenir.(tacf)
        burada m' nin degerini k yapariz.
        19. satir calisir. burada m degeri instance variable oldugu icin daha once degistirdigimiz k kalici degildir yine m= m olur.
        19. satirda parametresiz constructor' a gider ama oncesinde yine static olmayan blok calisir (value=tacfc) olur
        sonra parametresiz constructor calisir.
        m' nin degeri h olur. ve value degerine b eklenir. (value=tacfcb)
        20. satira doner. (tacfcb+h) consolda gorulur.

        cvp D

  */
