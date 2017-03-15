package ru.kosykh_ev.creationaldesign.abstractfactory;

import org.junit.Test;
import ru.kosykh_ev.creationaldesign.factory.Lenovo;

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
        LenovoMobileFactory lmf = (LenovoMobileFactory) factory.createMobile("lenf");
        Lenovo ln = (Lenovo) lmf.createLenovoMobile();
        ln.pictureCapacity();
    }
    
}
