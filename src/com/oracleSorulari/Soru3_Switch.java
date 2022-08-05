package com.oracleSorulari;

public class Soru3_Switch {

    public static void main(String[] args) {

        // soruda output ne olur

        final char a = 'A', d='D'; // final keyword'u  variable'in son degerini belirler

        char grade='B';

        switch (grade){
            case  a :
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break ;
            case  d :
            case 'F': System.out.print("not good");
        }

    }
}
