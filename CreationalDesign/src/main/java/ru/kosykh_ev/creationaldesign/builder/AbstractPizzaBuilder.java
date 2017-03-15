package ru.kosykh_ev.creationaldesign.builder;

/**
 * Abstract Builder. Specifies an abstract interface for creating parts of a
 * {@link Pizza} object.
 * @author monoid
 */
public abstract class AbstractPizzaBuilder {

    protected Pizza.PizzaBuilder pizzaBuilder;
    
    public Pizza getPizza() {
        return pizzaBuilder.build();
    }
    
    public void createNewPizzaProduct() {
        pizzaBuilder = new Pizza.PizzaBuilder();
    }
    
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
