package com.pedroperez.designpatterns.patterns.structural.bridge;

public abstract class AbstractAccount {
    private Logger logger = Logger.info();

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // the logging part is delegated to the Logger implementation
    protected String operate(String message, boolean result) {
        return logger.log(message + " result " + result);
    }
}
