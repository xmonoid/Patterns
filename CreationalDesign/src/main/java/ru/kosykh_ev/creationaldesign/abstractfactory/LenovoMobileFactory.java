package ru.kosykh_ev.creationaldesign.abstractfactory;

import ru.kosykh_ev.creationaldesign.factory.Lenovo;

/**
 *
 * @author monoid
 */
public class LenovoMobileFactory extends MobileFactory {

    Lenovo createLenovoMobile() {
        return new Lenovo();
    }
}
