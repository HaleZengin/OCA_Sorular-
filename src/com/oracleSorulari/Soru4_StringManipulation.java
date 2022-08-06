package com.oracleSorulari;

public class Soru4_StringManipulation {

    public static void main(String[] args) {

        String str1= "Java";
        String str2=new String("java");
        // yukaridaki iki String' e hangisi eklenirse sonuc equal olur?

        // str1.toLowerCase();  yaptigimizda str1 kalici olarak degismez.

        //if(str1==str2) bunu kullanmayiz. yerine equals() metodu kullanilir.
        // equals() sadece String'lerin iceriginin esit olduguna bakar
        // == ise hem iceriginin hem de referanslarin esit olup olmadigini kontrol eder
        // String str2=new String("java"); ifadesinde new keyword' u ile bu String yeni bir referans almis olur.
        // if(str1==str2) yaptigimizda hem referans hem icerigi farklidir. sonuc not equal olur.


        if(str2.equals(str1.toLowerCase()))

        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");

        }

        // if(str2.equals(str1.toLowerCase())) yaparak str1'i once harfleri kucuk yapar. sonra da str2 ie sadece icerik olarak esit mi diye bakar.
    }
}
