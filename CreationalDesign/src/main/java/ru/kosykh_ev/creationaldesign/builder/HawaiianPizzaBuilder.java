package ru.kosykh_ev.creationaldesign.builder;

/**
 * Concrete Builder.
 * <ul>
 * <li>Constructs and assembles parts of the pizzaBuilder by
 implementing the {@link AbstractPizzaBuilder} interface.</li>
 * <li>Defines and keeps track of the representation it creates.</li>
 * <li>Provides an interface for retrieving the pizzaBuilder.</li>
 * </ul>
 * @author monoid
 */
public class HawaiianPizzaBuilder extends AbstractPizzaBuilder {

    @Override
    public void buildDough() {
        pizzaBuilder.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizzaBuilder.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizzaBuilder.setTopping("ham+pineapple");
    }

}
