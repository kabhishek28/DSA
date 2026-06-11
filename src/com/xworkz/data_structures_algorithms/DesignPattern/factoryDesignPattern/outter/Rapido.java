package com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.outter;

import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.inner.Raid;

public class Rapido implements Raid {
    @Override
    public void book() {
        System.out.println("Rapido implementing Raid ");
    }
}
