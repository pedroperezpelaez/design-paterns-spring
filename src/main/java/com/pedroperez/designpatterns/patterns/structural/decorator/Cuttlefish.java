package com.pedroperez.designpatterns.patterns.structural.decorator;

public class Cuttlefish extends PaellaIngredient {
    private final Paella paella;

    public Cuttlefish(Paella paella) {
        super();
        this.paella = paella;
    }

    @Override
    public String getDescription() {
        return this.paella.getDescription() + " + cuttlefish";
    }

    @Override
    public Float getCost() {
        return ((float) 2.60) + (this.paella.getCost());
    }
}
