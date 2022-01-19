package com.pedroperez.designpatterns;

import com.pedroperez.designpatterns.patterns.prototype.PrototypeFalse;
import com.pedroperez.designpatterns.patterns.prototype.PrototypeTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DesignPatternsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsAppApplication.class, args);
    }

    @Bean
    public PrototypeFalse protoFalse() {
        return new PrototypeFalse();
    }

    @Bean
    @Scope("prototype")
    public PrototypeTrue protoTrue() {
        return new PrototypeTrue();
    }
}

