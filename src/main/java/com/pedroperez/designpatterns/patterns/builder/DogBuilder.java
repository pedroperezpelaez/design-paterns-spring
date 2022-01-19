package com.pedroperez.designpatterns.patterns.builder;

import com.pedroperez.designpatterns.model.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogBuilder {
    private String name;
    private boolean hungry;

    public DogBuilder name(String name) {
        this.name = name;
        return this;
    }

    public DogBuilder hungry(boolean hungry) {
        this.hungry = hungry;
        return this;
    }

    public Dog build() {
        return new Dog(name, hungry);
    }
}
