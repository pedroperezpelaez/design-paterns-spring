package com.pedroperez.designpatterns.patterns.operational.template;

public abstract class Template {
    String key;

    Template() {
    }

    public final String template(String data) {
        if (method1(key)) {
            return method2(data);
        }
        return method3(data);


    }

    abstract boolean method1(String key);

    abstract String method2(String data);

    abstract String method3(String data);

}
