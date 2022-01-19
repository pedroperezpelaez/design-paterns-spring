package com.pedroperez.designpatterns.patterns.decorator;

public class SeafoodPaella extends Paella {
    public SeafoodPaella() {
        super();
        this.description = "Seafood Pizza";
    }

    @Override
    public Float getCost() {
        return new Float(14.00);
    }
}
