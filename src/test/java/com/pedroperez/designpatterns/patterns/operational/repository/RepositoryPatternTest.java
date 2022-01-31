package com.pedroperez.designpatterns.patterns.operational.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryPatternTest {
    @Autowired
    PresidentRepository presidentRepository;

    @Test
    public void testRepository() {
        PresidentEntity presidentEntity1 = presidentRepository.findById(1L).get();
        Assert.assertNotNull(presidentEntity1);
        Assert.assertEquals("George", presidentEntity1.getFirstName());
        PresidentEntity presidentEntity2 = presidentRepository.findById(2L).get();
        Assert.assertNotNull(presidentEntity2);
        Assert.assertEquals("John", presidentEntity2.getFirstName());
    }
}
