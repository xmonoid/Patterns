/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kosykh_ev.creationaldesign.singleton;

import ru.kosykh_ev.creationaldesign.singleton.Singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author monoid
 */
public class SingletonTest {
    
    public SingletonTest() {
    }

    /**
     * Test of getInstance method, of class Singleton.
     */
    @Test
    public void testForBaseUnique() {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        assertTrue(s1 == s2);
    }
    
    /**
     * Test of getInstance method, of class Singleton.
     * @throws java.lang.Exception
     */
    @Test(expected = InvocationTargetException.class)
    public void testForReflectionProtection() throws Exception {
        
        Singleton s1 = Singleton.getInstance();
        
        Class clazz = Class.forName("ru.kosykh_ev.creationaldesign.Singleton");
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
    
    /**
     * Test of getInstance method, of class Singleton.
     * @throws java.lang.Exception
     */
    @Test(expected = CloneNotSupportedException.class)
    public void testForCloneProtection() throws Exception {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = (Singleton) s1.clone();
    }
    
    /**
     * Test of getInstance method, of class Singleton.
     * @throws java.lang.Exception
     */
    @Test
    public void testForSerializationProtection() throws Exception {
        Singleton s1 = Singleton.getInstance();
        
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("/tmp/s1.ser"));
        oos.writeObject(s1);
        
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/tmp/s1.ser"));
        Singleton s2 = (Singleton) ois.readObject();
        
        assertTrue(s1 == s2);
    }
    
    /**
     * Test of getInstance method, of class Singleton.
     */
    @Test
    public void testGetInstanceMultithread() {
        
        final int TOP = 100_000;
        
        final Set<Thread> threads = new HashSet<>();
        final Set<Singleton> singletons = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i < TOP; i++) {
            threads.add(new Thread(() -> {
                singletons.add(Singleton.getInstance());
            }));
        }
        
        final long start = new Date().getTime();
        threads.forEach((t) -> {
            t.start();
        });
        final long finish = new Date().getTime();
        
        System.out.println(finish - start + " milliseconds.");
        assertTrue(singletons.size() == 1);
    }
}
