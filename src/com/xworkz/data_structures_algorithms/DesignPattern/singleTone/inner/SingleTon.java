package com.xworkz.data_structures_algorithms.DesignPattern.singleTone.inner;

public class SingleTon {

    private static final  SingleTon singleTon = new SingleTon();

    private  SingleTon(){
        System.out.println("singleTon Design Pattern......");
    }

    public static  SingleTon getInstance(){
        return singleTon;
    }

}
