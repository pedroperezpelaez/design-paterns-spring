package com.pedroperez.designpatterns.patterns.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Dynamically adds responsibility to the interface by wrapping the original code
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Paella paella = new SeafoodPaella();
        Assert.assertEquals("Seafood Pizza", paella.getDescription());
        Assert.assertEquals(new Float(14.00), paella.getCost());

        Cuttlefish cuttlefish = new Cuttlefish(paella);
        Assert.assertEquals("Seafood Pizza + cuttlefish", cuttlefish.getDescription());
        Assert.assertEquals(new Float(16.60), cuttlefish.getCost());

        Cuttlefish doubleCuttlefish = new Cuttlefish(cuttlefish);
        Assert.assertEquals("Seafood Pizza + cuttlefish + cuttlefish", doubleCuttlefish.getDescription());
        Assert.assertEquals(new Float(19.20), doubleCuttlefish.getCost());
    }
}
