package com.pedroperez.designpatterns.patterns.structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class BridgePatternTest {

    @Test
    public void testBridgePattern() {

        SimpleAccount account = new SimpleAccount(100);
        Assert.assertEquals("info: withdraw 75 result true", account.withdraw(75));

        if (account.isBalanceLow()) {
            // you can also change the Logger implementation at runtime
            account.setLogger(Logger.warning());
        }

        Assert.assertEquals("warning: withdraw 10 result true", account.withdraw(10));
        Assert.assertEquals("warning: withdraw 100 result false", account.withdraw(100));
    }
}
