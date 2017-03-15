/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kosykh_ev.creationaldesign.factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author monoid
 */
public class MobileFactoryTest {
    
    public MobileFactoryTest() {
    }

    /**
     * Test of createMobile method, of class MobileFactory.
     */
    @Test
    public void testCreateMobile() {
        MobileFactory factory = new MobileFactory();
        
        Lenovo len = (Lenovo) factory.createMobile("len");
        len.batteryPower();
        
        Samsung sam = (Samsung) factory.createMobile("sam");
        sam.cost();
    }
    
}
