package ru.kosykh_ev.creationaldesign.singleton;

import java.io.Serializable;

/**
 *
 * @author monoid
 */
public class Singleton implements Cloneable, Serializable {
    
    private volatile static Singleton instance;
    
    public static Singleton getInstance() {
        // Double-checked locking protects against creating
        // another instance in a multithreading program.
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * The constructor. It has protection against the creation of
     * another instance, e.g. via reflection.
     */
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("The instance is already created!");
        }
    }
    
    /**
     * Protection against the cloning.
     * @return nothing
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        if (instance != null)
            throw new CloneNotSupportedException();
        return super.clone();
    }
    
    /**
     * Protection against the serialization.
     * @return the current object
     */
    private Object readResolve() {
        return instance;
    }
}
