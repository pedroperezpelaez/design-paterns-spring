package com.pedroperez.designpatterns.patterns.operational.template;

import org.junit.Assert;
import org.junit.Test;

public class TemplatePatternTest {
    @Test
    public void testTemplates() {
        Template template1 = new TemplateImpl1("123456789");
        Template template2 = new TemplateImpl2("123456789");
        String response1 = template1.template("data");
        String response2 = template2.template("data");
        Assert.assertEquals("data method3-TemplateImpl1", response1);
        Assert.assertEquals("data method2-TemplateImpl2", response2);
    }
}
