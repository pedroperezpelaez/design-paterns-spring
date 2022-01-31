package com.pedroperez.designpatterns.patterns.structural.bridge;

// Logger has two implementations: info and warning
@FunctionalInterface
public interface Logger {
    static Logger info() {
        return message -> "info: " + message;
    }

    static Logger warning() {
        return message -> "warning: " + message;
    }

    String log(String message);
}
