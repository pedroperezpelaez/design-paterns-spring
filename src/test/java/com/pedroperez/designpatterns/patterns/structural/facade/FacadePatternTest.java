package com.pedroperez.designpatterns.patterns.structural.facade;

import org.junit.Assert;
import org.junit.Test;

/**
 * Provides a simplified interface
 */
public class FacadePatternTest {
    @Test
    public void testFacadePattern() {
        Facade facade = new Facade();
        Assert.assertEquals("InternalClass1InternalClass2", facade.method1());

    }
}
