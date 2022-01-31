package com.pedroperez.designpatterns.patterns.structural.decorator;

public abstract class Paella {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract Float getCost();
}
