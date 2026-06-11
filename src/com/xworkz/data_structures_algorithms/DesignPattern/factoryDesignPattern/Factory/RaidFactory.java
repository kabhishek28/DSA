package com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.Factory;

import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.inner.Raid;
import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.outter.Rapido;
import com.xworkz.data_structures_algorithms.DesignPattern.factoryDesignPattern.outter.Uber;

public class RaidFactory {

    public static Raid getRaid(String name){
        if(name.equalsIgnoreCase("Rapido")){
            return new Rapido();
        }
        if(name.equalsIgnoreCase("Uber")) {
            return new Uber();

        }
        return null;
    }
}
