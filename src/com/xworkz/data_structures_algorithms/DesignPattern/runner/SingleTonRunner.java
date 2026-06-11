package com.xworkz.data_structures_algorithms.DesignPattern.runner;

import com.xworkz.data_structures_algorithms.DesignPattern.singleTone.inner.SingleTon;

public class SingleTonRunner {
    public static void main(String[] args) {

        //---------------SINGLETON--------------------
        //its only creates the Single objects.+
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = SingleTon.getInstance();

        System.out.println(singleTon1);
        System.out.println(singleTon);



        //
    }
}
