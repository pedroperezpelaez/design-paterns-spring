package com.pedroperez.designpatterns.patterns.factory;

import com.pedroperez.designpatterns.model.Cat;
import com.pedroperez.designpatterns.model.Dog;
import com.pedroperez.designpatterns.model.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetFactoryTest {
    @Autowired
    private PetFactory petFactory;

    @Test
    public void createDog() {
        Pet pet = this.petFactory.createPet("dog");
        assertEquals(pet.getClass(), Dog.class);
    }

    @Test
    public void createCat() {
        Pet pet = this.petFactory.createPet("cat");
        assertEquals(pet.getClass(), Cat.class);
    }

    @Test
    public void createUnknown() {
        try {
            Pet pet = this.petFactory.createPet("mouse");
            fail("Exception not thrown");
        } catch (UnsupportedOperationException e) {
            assertEquals("unknown animal type", e.getMessage());
        }


    }
}
