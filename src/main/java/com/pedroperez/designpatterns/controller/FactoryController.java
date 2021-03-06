package com.pedroperez.designpatterns.controller;

import com.pedroperez.designpatterns.model.Pet;
import com.pedroperez.designpatterns.patterns.creational.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FactoryController {
    private final PetFactory petFactory;

    @Autowired
    public FactoryController(PetFactory petFactory) {
        this.petFactory = petFactory;
    }

    @GetMapping
    public String getDefault() {
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping("adoptPet/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet pet = this.petFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }

}
