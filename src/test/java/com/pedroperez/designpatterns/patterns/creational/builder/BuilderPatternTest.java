package com.pedroperez.designpatterns.patterns.creational.builder;

import com.pedroperez.designpatterns.model.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderPatternTest {
    @Autowired
    private DogBuilder dogBuilder;

    @Test
    public void newDogBuilder() {
        Dog homer = dogBuilder.name("Homer").hungry(true).build();
        assertNotNull(homer);
    }
}
