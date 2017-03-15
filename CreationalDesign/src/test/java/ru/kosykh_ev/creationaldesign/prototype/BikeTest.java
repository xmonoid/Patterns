/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kosykh_ev.creationaldesign.prototype;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author monoid
 */
public class BikeTest {
    
    private static Bike makeJaguar(Bike basicBike) {
        
        basicBike.makeAdvanced();
        return basicBike;
    }

    /**
     * Test of getModel method, of class Bike.
     */
    @Test
    public void testPrototype() {
        Bike bike = new Bike();
        Bike basicBike = bike.clone();
        
        Bike advancedBike = BikeTest.makeJaguar(basicBike);
        
        System.out.println("Prototype Desing Pattern: " + advancedBike.getModel());
        System.out.println("Prototype Desing Pattern: " + advancedBike.toString());
    }
    
}
