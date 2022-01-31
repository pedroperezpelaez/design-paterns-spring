package com.pedroperez.designpatterns.patterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonPatternTest {
    @Autowired
    private SingletonB singletonB1;
    @Autowired
    private SingletonB singletonB2;

    @Test
    public void testSingletons() {
        SingletonA singletonA1 = SingletonA.getInstance();
        SingletonA singletonA2 = SingletonA.getInstance();
        SingletonB singletonB3 = new SingletonB();
        SingletonB singletonB4 = new SingletonB();
        Assert.assertNotNull(singletonA1);
        Assert.assertSame(singletonA1, singletonA2);
        Assert.assertNotNull(singletonB1);
        Assert.assertSame(singletonB1, singletonB2);
        Assert.assertNotSame(singletonB3, singletonB4);
    }

}

