package com.juaracoding.ujianminggu2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KelasTestA {
    @Test
    public void testA01() throws InterruptedException {
        int actual = 1;
        int expected = 4000;

        for (int i = 0; i <= expected ; i++) {
            actual = i;
        }
        System.out.println("TestA01");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testA02() throws InterruptedException {
        int actual = 1;
        int expected = 1000;

        for (int i = 0; i <= expected ; i++) {
            actual = i;
        }
        System.out.println("TestA02");
        Assert.assertEquals(actual, expected);
    }
}
