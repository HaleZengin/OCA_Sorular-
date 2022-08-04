package com.oracleSorulari;

public class Soru1_PostIncrement {

    public static void main(String[] args) {

         int num1=9;
         int num2=num1++;

         if(num2<10){
             System.out.println("num2: "+num2+" Hello World");

         } else{
             System.out.println("num1: "+num1+" Hello Universel");
         }

         // num1 'in yeni degerini gormek icin yazdiralim
        System.out.println("num1: "+num1);
    }
}
