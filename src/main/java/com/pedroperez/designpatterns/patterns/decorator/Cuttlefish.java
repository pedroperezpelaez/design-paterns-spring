package com.pedroperez.designpatterns.patterns.decorator;

public class Cuttlefish extends PaellaIngredient {
    private Paella paella;

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
        return (new Float(2.60)) + (this.paella.getCost());
    }
}
