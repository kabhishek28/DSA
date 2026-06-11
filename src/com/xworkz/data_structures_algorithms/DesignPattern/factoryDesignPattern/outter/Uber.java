package com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.outter;

import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.inner.Raid;

public class Uber implements Raid {

    @Override
    public void book() {
        System.out.println("Uber Implementing Raid");
    }
}
