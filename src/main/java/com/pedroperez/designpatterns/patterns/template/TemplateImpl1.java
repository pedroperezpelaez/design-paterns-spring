package com.pedroperez.designpatterns.patterns.template;

public class TemplateImpl1 extends Template {
    public TemplateImpl1(String key) {
        this.key = key;
    }

    @Override
    boolean method1(String key) {
        if (key.length() % 2 > 0) {
            return false;
        }
        return true;
    }

    @Override
    String method2(String data) {
        return data + " method2-TemplateImpl1";
    }

    @Override
    String method3(String data) {
        return data + " method3-TemplateImpl1";
    }
}