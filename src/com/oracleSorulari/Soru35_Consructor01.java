package com.oracleSorulari;

public class Soru35_Consructor01 {

    int count;

    public void Constructor01() {                               // constructor gibi gorunur ama bu metot' tur.
        count = 4;
    }

    public static void main(String[] args) {
        Soru35_Consructor01 cns = new Soru35_Consructor01();    // burada gecen constructor default constructor' dir. gorunmez.
        System.out.println(cns.count);                          // buradaki count instance variable' dir. deger atanmadigi icin default deger yani 0 olur.

    }


    /*
    A. 0
    B. 4
    C. 7.satirdan dolayi kod calismaz
    D. 8.satirdan dolayi kod calismaz
    E. 12.satirdan dolayi kod calismaz
    F. 13.satirdan dolayi kod calismaz
    */

    /*
    cevap A
     */

}
