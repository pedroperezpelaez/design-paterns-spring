package com.pedroperez.designpatterns.patterns.creational.prototype;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrototypePatternTest {

    @Autowired
    PrototypeTrue true1;
    @Autowired
    PrototypeTrue true2;

    @Autowired
    PrototypeFalse false1;
    @Autowired
    PrototypeFalse false2;

    @Test
    public void testPrototypes() {
        Assert.assertSame(false1, false2);
        Assert.assertNotSame(true1, true2);
    }


}

