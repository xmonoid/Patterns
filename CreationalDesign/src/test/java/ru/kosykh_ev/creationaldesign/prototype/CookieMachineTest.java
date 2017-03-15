package ru.kosykh_ev.creationaldesign.prototype;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author monoid
 */
public class CookieMachineTest {

    /**
     * Test of makeCookie method, of class CookieMachine.
     * @throws java.lang.Exception
     */
    @Test
    public void testMakeCookie() throws Exception {
        
        Cookie tempCookie = null;
        Cookie prototype = new CoconutCookie();
        
        CookieMachine cm = new CookieMachine(prototype);
        for (int i = 0; i < 100; i++) {
            tempCookie = cm.makeCookie();
        }
    }
    
}
