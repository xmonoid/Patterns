
package ru.kosykh_ev.creationaldesign.factory;

/**
 *
 * @author monoid
 */
public class MobileFactory {

    
    public IMobile createMobile(String type) {
        
        IMobile mob = null;
        
        if ("len".equalsIgnoreCase(type)) {
            mob = new Lenovo();
            System.out.println("Lenovo created");
        } else if ("sam".equalsIgnoreCase(type)) {
            mob = new Samsung();
            System.out.println("Samsung created");
        }
        return mob;
    }
}
