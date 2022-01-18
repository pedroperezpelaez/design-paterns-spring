package com.pedroperez.designpatterns.model;

import lombok.Data;

@Data
public class Dog implements Pet {
    private String name;
    private boolean hungry;

    public Dog() {
        super();
        this.hungry = true;
    }


    @Override
    public String getType() {
        return "DOG";
    }

    @Override
    public void feed() {
        this.hungry = false;
    }
}
