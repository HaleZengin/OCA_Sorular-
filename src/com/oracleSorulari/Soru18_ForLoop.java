package com.oracleSorulari;

public class Soru18_ForLoop {

    public static void main(String[] args) {

        int count = 0;

        ROW_LOOP: for(int row = 1; row <=3; row++)
            for(int col = 1; col <=2 ; col++) {
                if(row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }

        System.out.println(count);
    }
}
            /*
            kod bulogu calisirsa sonuc ne olur?

            A. 1
            B. 2
            C. 3
            D. 4
            E. 6
            F. 11. Satirdan dolayi kod calismaz.
             */

        /*
        if' in icindeki sart false olunca if' ten sonraki continue bolumu calismayacak count' u 1 arttiracak ve tekrar inner loop'a donecek
        if' in icindeki sart true olunca if' ten sonraki continue bolumu calisir ve loop en basa doner. burada count arttirilmadan basa doner
        tekrar loop calisir ve ilk for loop' taki sart saglanamayana kadar devam eder ve en sonunda yazdirma kismina gelir.
        cevap B
        */
