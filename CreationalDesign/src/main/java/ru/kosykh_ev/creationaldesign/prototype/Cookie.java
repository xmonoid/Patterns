package ru.kosykh_ev.creationaldesign.prototype;

/**
 * Prototype class.
 * @author monoid
 */
public class Cookie implements Cloneable {

    protected int weight;
    
    @Override
    public Cookie clone() throws CloneNotSupportedException {
        
        Cookie copy = (Cookie) super.clone();
        
        /*
        In an actual implementation of this pattern you might now change
        references to the expensive to produce parts from the copies that are
        held inside the prototype.
        */
        
        return copy;
    }
}
