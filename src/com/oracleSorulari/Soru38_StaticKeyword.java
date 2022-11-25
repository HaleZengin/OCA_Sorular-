package com.oracleSorulari;

public class Soru38_StaticKeyword {


    public static int length=0;
}

class ConsLength {
    static Soru38_StaticKeyword cons1=new Soru38_StaticKeyword();
    static Soru38_StaticKeyword cons2=new Soru38_StaticKeyword();
    static  {
        System.out.print(cons1.length);
    }
    public static void main(String[] args) {

        cons1.length=2;
        cons2.length=8;

        System.out.println(cons1.length);
    }
}

            /*
            A. 02
            B. 08
            C. 2
            D. 8
            E. Kod calismaz.
            F. Kod calisir ancak exception olusur.
             */

    /*
    ayni sayfa uzerinde 2 class yapilmis.
    static olan length variabla' ina her yerden ulasilabilir.
    ulasmak icin aslinda obje olusturmaya gerek yoktur.
    ana obje uzerinde de olur.
    obje yapmasaydik class adi . yaparak length' e ulasirdik.

    6. satirda length static variabla' i tanimlanmis.
    13. satirda obje uzerinden bu variable' a ulasilmis ve consolda 0 yazdirir.
    sonra main metot icinde once length variable' ina 2 degeri, sonra 8 degeri atanmis.
    artil length' in son degeri 8' dir.
    20. satirda 8 yazdirir. daha once 0 yazdirmisti. bu yuzden 08 yazar.

    cvp B
     */


