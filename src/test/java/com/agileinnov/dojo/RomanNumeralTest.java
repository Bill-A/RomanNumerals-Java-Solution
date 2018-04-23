package com.agileinnov.dojo;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void returnsIwhenGiven1() {
        Assert.assertEquals("I", com.agileinnov.dojo.RomanNumeral.of(1));
    }

    @Test
    public void returnsIIwhenGiven2() {
        Assert.assertEquals("II", com.agileinnov.dojo.RomanNumeral.of(2));
    }

    @Test
    public void returnsIIIwhenGiven3() {
        Assert.assertEquals("III", com.agileinnov.dojo.RomanNumeral.of(3));
    }

    @Test
    public void returnsIVwhenGiven4() {
        Assert.assertEquals("IV", com.agileinnov.dojo.RomanNumeral.of(4));
    }

    @Test
    public void returnsVwhenGiven5() {
        Assert.assertEquals("V", com.agileinnov.dojo.RomanNumeral.of(5));
    }

    @Test
    public void returnsXwhenGiven10() {
        Assert.assertEquals("X", com.agileinnov.dojo.RomanNumeral.of(10));
    }

    @Test
    public void returnsXXwhenGiven20() {
        Assert.assertEquals("XX", com.agileinnov.dojo.RomanNumeral.of(20));
    }

    @Test
    public void returnsXXXwhenGiven30() {
        Assert.assertEquals("XXX", com.agileinnov.dojo.RomanNumeral.of(30));
    }

    @Test
    public void returnsXXIIIwhenGiven23() {
        Assert.assertEquals("XXIII", com.agileinnov.dojo.RomanNumeral.of(23));
    }

    @Test
    public void testSupportFor20s() {
        Assert.assertEquals("XXIV", com.agileinnov.dojo.RomanNumeral.of(24));
        Assert.assertEquals("XXV", com.agileinnov.dojo.RomanNumeral.of(25));
        Assert.assertEquals("XXVI", com.agileinnov.dojo.RomanNumeral.of(26));
    }

    @Test
    public void returnsMCMXCIXwhenGiven1999() {
        Assert.assertEquals("MCMXCIX", com.agileinnov.dojo.RomanNumeral.of(1999));
    }

    @Test
    public void returnsMCMLVIIwhenGiven1957() {
        Assert.assertEquals("MCMLVII", com.agileinnov.dojo.RomanNumeral.of(1957));
    }

}
