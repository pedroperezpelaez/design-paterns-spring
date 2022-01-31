package com.pedroperez.designpatterns.patterns.structural.decorator;

public class SeafoodPaella extends Paella {
    public SeafoodPaella() {
        super();
        this.description = "Seafood Pizza";
    }

    @Override
    public Float getCost() {
        return 14.00F;
    }
}
