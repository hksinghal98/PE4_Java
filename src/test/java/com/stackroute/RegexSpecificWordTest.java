package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexSpecificWordTest {
    @Before
    public void begin(){
       RegexSpecificWord RSW;
    }
    @After
    public void teardown(){
        RegexSpecificWord RSW = null;
    }
    @Test
    public void RegexSpecificWord_AssertTrue()
    {
        RegexSpecificWord RSW = new RegexSpecificWord("This is Harry.");
        assertTrue(RSW.IsWordExist("Harry"));
        assertTrue(RSW.IsWordExist("is"));
    }
    @Test
    public void RegexSpecificWord_AssertFalse()
    {
        RegexSpecificWord RSW = new RegexSpecificWord("This is Harry.");
        assertFalse(RSW.IsWordExist("sndfksdn"));
        assertFalse(RSW.IsWordExist("fbskdfk"));
    }
    @Test
    public void RegexSpecificWord_AssertNotNull()
    {
        RegexSpecificWord RSW = new RegexSpecificWord("This is Harry.");
        assertNotNull(RSW.IsWordExist("sndfksdn"));
        assertNotNull(RSW.IsWordExist("is"));
    }
}
