package ru.kosykh_ev.creationaldesign.builder;

import org.junit.Test;

/**
 *
 * @author monoid
 */
public class BuilderExampleTest {
    
    public BuilderExampleTest() {
    }

    @Test
    public void testBuilderExample() {
        Waiter waiter = new Waiter();
        AbstractPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        
        Pizza pizza = waiter.getPizza();
        
        System.out.println("The pizza is created: " + pizza);
    }
}
