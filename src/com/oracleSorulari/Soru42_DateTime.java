package com.oracleSorulari;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Soru42_DateTime {

    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 9, 22, 33);
        Period p = Period.of(3,0,2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm");
        System.out.println(f.format(d));

    }

}



            /*

            A. 2012/05/08 09:22 AM
            B. 2012/5/08 9:22
            C. 2012/05/08 09:22
            D. 2012/03/10 09:22
            E. Kod Calismaz
            F. Kod calisir ama exeption olusur

            */


            /*
            LocalDate, LocalTime, LocalDateTime class'lari ile zamanlar belirtilebilir
            Period class'i ile belli bir zaman aralığı belirtilebilir
            12. satirda d objesi ile yazilan tarihten p kadar zaman cikarilmis demek
            13. satirda gosterdigi formatta yazilacak

            cvp C

             */
