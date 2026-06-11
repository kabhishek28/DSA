package com.xworkz.data_structures_algorithms.DesignPattern.runner;

import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.Factory.RaidFactory;
import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.inner.Raid;


public class FactoryDesignPattern {
    public static void main(String[] args) {
        //The Factory Design Pattern is a Creational Design Pattern used to create objects without exposing the object creation logic to the client.
        //Instead of using new everywhere, we ask a Factory to create the object for us.
        //Spring's BeanFactory and ApplicationContext use the Factory Pattern internally.
        Raid raid = RaidFactory.getRaid("rapido");
        System.out.println(raid);

        Raid raid1 = RaidFactory.getRaid("rapido");
        System.out.println(raid1);


    }
}
