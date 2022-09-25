package com.oracleSorulari;

public class Soru32_MetotKullanımı {

    public static void addToInt(int x, int amountToAdd) {

        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        Soru32_MetotKullanımı.addToInt(a, b);
        // addToInt metodu yukarida var. a yerine int x olur, b yerine int amountToAdd gelir.
        // 6. satirda bir atama var x yerine 15+10=25 olur ama bu kalici degildir.
        // yukaridaki metot calistiktan sonra 11. satira geri gelir ve burada x yine 15' dir. 15. satirda sonuc 15 olur.
        System.out.println(a);
    }

}

     /*
        A. 10
        B. 15
        C. 25
        D. 6.satirdan dolayi kod calismaz
        E. 11.satirdan dolayi kod calismaz
        F. Yukaridakilerden hicbiri.
     */

    /*
    cevap B
    */