package com.juaracoding.ujianminggu2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KelasTestB {
    @Test
    public void testB01(){
        int actual = 1;
        int expected = 4000;

        for (int i = 0; i <= expected ; i++) {
            actual = i;
        }
        System.out.println("TestB01");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testB02(){
        int actual = 1;
        int expected = 1000;

        for (int i = 0; i <= expected ; i++) {
            actual = i;
        }
        System.out.println("TestB02");
        Assert.assertEquals(actual, expected);
    }
}
