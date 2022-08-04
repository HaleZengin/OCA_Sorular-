package com.oracleSorulari;

public class Soru1_PostIncrement {

    public static void main(String[] args) {

        // soru1: num1=9; olarak verildiginde output ne olur?

         int num1=9;
         int num2=num1++;

         if(num2<10){
             System.out.println(num2+" post increment");

         } else{
             System.out.println(num1+" pre increment");
         }

         // num1 'in yeni degerini gormek icin yazdiralim
        System.out.println("num1: "+num1);
    }
}

    // int num2=num1++; once atama yapilir sonra num1 degeri 1 artar. buna post increment denir
    // int num2=++num1; olsaydi once 1 arttiracak sonra atama yapacakti. buna da pre increment denir

