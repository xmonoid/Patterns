package ru.kosykh_ev.creationaldesign.builder;

/**
 * Product.
 * <ul>
 * <li>Represents the complex object under construction. ConcreteBuilder builds
 * the product's internal representation and defines the process by which it's
 * assembled.</li>
 * <li>Includes classes that define the constituent parts, including interfaces
 * for assembling the parts into the final result.</li>
 * </ul>
 * @author monoid
 */
public class Pizza {

    // Тесто.
    private String dough = "";
    
    // Соус.
    private String sauce = "";
    
    // Начинка.
    private String topping = "";
    
    public static class PizzaBuilder {
        private String nestedDough;
        
        private String nestedSauce;
        
        private String nestedTopping;
        
        public PizzaBuilder(
                final String nestedDough,
                final String nestedSauce,
                final String nestedTopping) {
            this.nestedDough = nestedDough;
            this.nestedSauce = nestedSauce;
            this.nestedTopping = nestedTopping;
        }
        
        public PizzaBuilder() {}
        
        public PizzaBuilder setDough(final String dough) {
            this.nestedDough = dough;
            return this;
        }
        
        public PizzaBuilder setSauce(final String sauce) {
            this.nestedSauce = sauce;
            return this;
        }
        
        public PizzaBuilder setTopping(final String topping) {
            this.nestedTopping = topping;
            return this;
        }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }
    
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.nestedDough;
        this.sauce = builder.nestedSauce;
        this.topping = builder.nestedTopping;
    }
    
    /**
     * @return the dough
     */
    public String getDough() {
        return dough;
    }

    /**
     * @param dough the dough to set
     */
    public void setDough(String dough) {
        this.dough = dough;
    }

    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }

    /**
     * @param sauce the sauce to set
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    /**
     * @return the topping
     */
    public String getTopping() {
        return topping;
    }

    /**
     * @param topping the topping to set
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    @Override
    public String toString() {
        return "Pizza[dough = " 
                + dough + "; sauce = "
                + sauce + "; topping = "
                + topping + "]";
    }
}
