package com.pedroperez.designpatterns.patterns.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {
    @Autowired
    PresidentRepository presidentRepository;

    @Test
    public void testRepository() {
        System.out.println(presidentRepository.findById(1L));
        System.out.println(presidentRepository.findById(2L));
    }
}
