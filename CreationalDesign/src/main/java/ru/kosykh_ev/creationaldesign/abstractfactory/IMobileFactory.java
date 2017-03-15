package ru.kosykh_ev.creationaldesign.abstractfactory;

/**
 *
 * @author monoid
 */
public interface IMobileFactory {

    IMobileFactory createMobile(String type);
}
