package ru.kosykh_ev.creationaldesign.abstractfactory;

import ru.kosykh_ev.creationaldesign.factory.Samsung;

/**
 *
 * @author monoid
 */
public class SamsungMobileFactory extends MobileFactory {

    Samsung createSamsungMobile() {
        return new Samsung();
    }
}
