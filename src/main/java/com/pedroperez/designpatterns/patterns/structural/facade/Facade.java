package com.pedroperez.designpatterns.patterns.structural.facade;

import com.pedroperez.designpatterns.patterns.structural.facade.intetrnal.InternalClass1;
import com.pedroperez.designpatterns.patterns.structural.facade.intetrnal.InternalClass2;

/**
 * Provides a simplified interface
 */
public class Facade {
    private final InternalClass1 internalClass1 = new InternalClass1();
    private final InternalClass2 internalClass2 = new InternalClass2();

    public String method1() {
        return internalClass1.method1() + internalClass2.method1();
    }

}
