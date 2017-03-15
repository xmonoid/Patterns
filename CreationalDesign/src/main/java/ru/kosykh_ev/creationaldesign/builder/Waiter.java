package ru.kosykh_ev.creationaldesign.builder;

/**
 * Director. Constructs an object using the Builder interface.
 * @author monoid
 */
public class Waiter {

    private AbstractPizzaBuilder pizzaBuilder;

    /**
     * @param pizzaBuilder the pizzaBuilder to set
     */
    public void setPizzaBuilder(AbstractPizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    
    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
    
    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
