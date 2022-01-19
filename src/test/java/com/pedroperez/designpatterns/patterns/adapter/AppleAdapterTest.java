package com.pedroperez.designpatterns.patterns.adapter;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class AppleAdapterTest {

    @Test
    public void testAdapter() {
        Orange orange = mock(MoroOrange.class);
        when(orange.getVariety()).thenReturn("Moro Orange");
        Apple apple = new AppleAdapter(orange);
        Assert.assertEquals("Moro Orange", apple.getVariety());
        apple.eat();
        //we verify that the peel method was called in the orange through the Apple adapters
        verify(orange, times(1)).peel();

    }
}
