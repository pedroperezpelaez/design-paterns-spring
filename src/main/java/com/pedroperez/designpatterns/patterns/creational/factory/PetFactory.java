package com.pedroperez.designpatterns.patterns.creational.factory;

import com.pedroperez.designpatterns.model.Cat;
import com.pedroperez.designpatterns.model.Dog;
import com.pedroperez.designpatterns.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetFactory {
    public Pet createPet(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new UnsupportedOperationException("unknown animal type");
        }
    }
}
