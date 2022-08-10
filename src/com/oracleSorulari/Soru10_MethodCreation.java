package com.oracleSorulari;

public class Soru10_MethodCreation {
    public static void main(String[] args) {

         /*
    public void methodA() { return;}
    public void methodB() { return null;}
    public void methodD() {}
    public int methodE() { return 9;}
    public int methodF() { return 9.0;}
    public int methodG() { return;}
    public int methodH() { return null;}

    bu siklardan hangileri calisir.
     */

        // neden metot olustururuz?
        // 1. bir islemi defalarca yapacaksak bir metot olusturup onun uzerinden yapmamiz en uygunudur.
        // 2. calistigimi class'i daha basit hale getirmek. karisikligi onler.

        // metot cesitleri:
        // 1. istedigimiz isi yapip biza sonuc dondurmeyen, konsolda sonucu yazdiran metot. return type' i void olur
        // 2. istedigimiz isi yapip bize sonuc dondurur. return type' i benim istedigim olur.

    }
        // soruya donelim:

    public void methodA() { return;}
    // return type void. return olmaz ama burada return'nun yani bos oldugundan sikintiolmaz. calisir.

    //  public void methodB() { return null;}
    // return type void. return olmaz ama burada return var ve null diye de bir atama var.

    public void methodD() {}
    // return type void calisir.

    public int methodE() { return 9;}
    // return type int. return yanina da bir int koyulmus calisir.

    // public int methodF() { return 9.0;}
    // return type int. return yanina double koyulmus. calismaz

    //public int methodG() { return;}
    // return type int. return yanina hic bi sey koyulmamis. calismaz

    //public int methodH() { return null;}
    // return type int. return yanina null koyulmus. primitive data turlerine null degeri atanamaz. calismaz





}
