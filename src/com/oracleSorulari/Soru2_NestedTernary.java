package com.oracleSorulari;

public class Soru2_NestedTernary {

    public static void main(String[] args) {
        // kod blogu calistiginda output ne olur?

        int x = 5;

        System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
        //               [1.sart (2. sart )          ]
        //               [ x>2 ? ( true   )   : false]
        // java once ilk sarta bakar.
        // eger 1. sart true ise 2. sartin ici calisir.
        // 2. sart da true ise sonuc 10, false ise sonuc 8 olur

    }
}

    // ternary: if else ile yapilan islemlerin daha basit olarak yapilmasini saglar
