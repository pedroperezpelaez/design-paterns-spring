package com.pedroperez.designpatterns.patterns.structural.composite;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CompositePatternTest {

    @Test
    public void testCompositePattern() {
        Component leafA = mock(LeafA.class);
        Component leafB = mock(LeafB.class);
        when(leafA.operation()).thenReturn("LeafAOperation");
        when(leafB.operation()).thenReturn("LeafBOperation");

        Composite composite = new Composite();
        composite.add(leafA);
        composite.add(leafB);
        Assert.assertEquals("LeafAOperation" + "LeafBOperation", composite.operation());
        verify(leafA, times(1)).operation();
        verify(leafB, times(1)).operation();
    }
}
