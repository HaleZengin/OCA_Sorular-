package com.oracleSorulari;

public class Soru37_ConsructorCall {


    int x=10 , y;

    Soru37_ConsructorCall(){
        System.out.print(x * y);
    }

    Soru37_ConsructorCall(int x , int y){
        this();
        this.x=x;
        this.y=10;
        System.out.print(x*y);
    }

    Soru37_ConsructorCall(int x,int y,int z){
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.print(x*z);
    }

    public static void main(String[] args) {
        Soru37_ConsructorCall dnm=new Soru37_ConsructorCall(3,4,5);
        System.out.print(dnm.x * dnm.y);
    }

}
