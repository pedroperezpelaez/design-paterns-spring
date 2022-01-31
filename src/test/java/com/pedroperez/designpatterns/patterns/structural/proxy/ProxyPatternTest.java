package com.pedroperez.designpatterns.patterns.structural.proxy;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ProxyPatternTest {
    Image image1 = new ProxyImage("HiRes_10MB_Photo1");

    @Test
    public void testProxyPattern() throws IOException {

        //Redirect System.out to buffer
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        image1.displayImage(); // loading necessary

        String allWrittenLines = bo.toString();
        Assert.assertTrue(allWrittenLines.contains("Loading HiRes_10MB_Photo1"));
        Assert.assertTrue(allWrittenLines.contains("Displaying HiRes_10MB_Photo1"));
        bo.reset();

        image1.displayImage(); // loading unnecessary
        bo.flush();
        allWrittenLines = bo.toString();
        Assert.assertTrue(allWrittenLines.contains("Displaying HiRes_10MB_Photo1"));
        Assert.assertFalse(allWrittenLines.contains("Loading HiRes_10MB_Photo1"));


    }
}
