package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ServerTest {
    private SpaceCharacterRemover schr;

    @Before
    public void init(){
        schr = new SpaceCharacterRemover();
    }

    @Test
    public void testWithString() {
        Assert.assertEquals("111222333", schr.remove(" 111 222 333 "));
        Assert.assertEquals("qqqqqqqqqqq", schr.remove("qq qqq  qqq      qqq"));
        Assert.assertEquals("wwwwwwww", schr.remove("          wwwwwwww            "));
        Assert.assertEquals("", schr.remove("                        "));
    }
}
