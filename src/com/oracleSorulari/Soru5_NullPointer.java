package com.oracleSorulari;

public class Soru5_NullPointer {

    public static void main(String[] args) {
    /*
        int x=0;
        String s=null;

        if(x==s){
            System.out.println("Success");
        }else{
            System.out.println("failure");
        }

        yukaridaki soruda output nedir?
    */

        // sorunun cevabi failure' dir. zaten Java if(x==null) ifadesini yazdiginda hata verecektir
        // biraz null pointer hakkinda bilgi verelim:

        // primitive data type icin null pointer kullanilmaz.
        // non-primitive tum data type' larda null pointer kullanilabilir
        Integer sayi= null;
        Boolean bl= null;

        String str1;
        String str2= new String();
        String str3= "";
        String str4=null;

        // su an 4 String'de de bir deger yok.
        // Java' da 2 memory vardir. stack ve heap memory.
        // str1 olusturuldugunda referansi stack memory' de olur. bir degeri olmadigi icin heap memory' de yoktur.
        // str1 olusturuldugunda referansi stack memory' de olur. ve new keyword'u kullanildigi icin objenin kendisi heap memory'de olusur. sadece ici bostur.
        // str3 olusturuldugunda referansi stack memory' de olur.  objenin kendisi heap memory'de olusur. icine de "" yani hiclik konulur. yani bir degeri vardir.
        // str4 olusturuldugunda referansi stack memory' de olur.  heap memory' ye giden bir pointer vardir ama heap memory'de olusan bir obje yoktur.


    //  System.out.println(str1);
        // str1'e yeni deger atamadan yazdirmak istesek deger atamasi yapilmadi diye uyari verir
        // str2' ye yeni deger atamadan yazdirmak istesek konsolda hic bisey gorulmaz ama uyari da vermez
        // str3' e yeni deger atamadan yazdirmak istesek konsolda hic bisey gorulmaz ama uyari da vermez
        // str4' e yeni deger atamadan yazdirmak istesek konsolda null sonucu gorulur


        // bu 4 String ile String manipulation yani string metodlari kullanilabilir.
    //  System.out.println("Hale"+ str1);
        // str1 deger atamasi yapilmadigindan kullanilamaz.
        System.out.println("Hale"+str2);
        //hew keyword'u oldugundan konsolda Hale yazar ama str2 yeri bostur.
        System.out.println("Hale"+str3);
        // yine konsolda Hale yazar ama str3 yeri bostur.
        System.out.println("Hale"+str4);
        // konsolda Hale null yazar. islem yapilmasina itiraz etmez ama str4' un null olarak isaretlendigini bize bildirir


    //  System.out.println(str1.length());
        // str1 deger atamasi yapilmadigindan kullanilamaz.
        System.out.println(str2.length());
        // 0 degerini verir
        System.out.println(str3.length());
        // 0 degerini verir
        System.out.println(str4.length());
        // nullPointerException firlatir

        // bu 4 String'e de yeni deger de atayabilirim.
        str1="java";
        System.out.println(str1);
        str2="java";
        System.out.println(str2);
        str3="java";
        System.out.println(str3);
        str4="java";
        System.out.println(str4);
        // hepsine deger atanir ve java yazisi konsolda gorulur.


        // sonuc olarak non-primitive data type kullaniyorsaniz ve bastan deger atamak istemiyorsaniz null kullanabilirsiniz.
        // null yerine str1; gibi osluk oldugunda islemlr sirasinda hata verir. null ' da ise sadece lenght icin sorun oluyor.




    }
}
