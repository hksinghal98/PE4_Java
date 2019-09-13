package com.stackroute;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CharacterFrequencyCountTest
{
    /**
     * Rigorous Test :-)
     */
    @Before
    public void begin(){
        CharacterFrequencyCount CFC = new CharacterFrequencyCount();
    }
    @After
    public void teardown(){
        CharacterFrequencyCount CFC = null;
    }
    @Test
    public void CountFrequency_AssertEquals()
    {
        CharacterFrequencyCount CFC = new CharacterFrequencyCount();
        assertEquals(10,CFC.CountFrequency("Java is java again java again",'a'));
        assertEquals(0,CFC.CountFrequency("hdkhfkdshgkdkbvvhdkvd",'z'));
    }
    @Test
    public void CountFrequency_NotNull()
    {
        CharacterFrequencyCount CFC = new CharacterFrequencyCount();
        assertNotNull(CFC.CountFrequency("Java is java again java again",'a'));
    }

}
