package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOccurancesTest {
    @Before
    public void begin(){
        StringOccurances SO;
    }
    @After
    public void teardown(){
        StringOccurances SO = null;
    }
    @Test
    public void StringOccurance_AsserEquals()
    {
        StringOccurances SO = new StringOccurances("She sells seashells by the seashore");
        assertEquals("Found at: 4 - 6\n"+"Found at: 10 - 12\n" +
                "Found at: 27 - 29",SO.MultipleOccurancePositionArray("se"));

    }
    @Test
    public void RegexSpecificWord_AssertNotNull()
    {
        StringOccurances SO = new StringOccurances("Java is an Object Oriented Language");
        assertNotNull(SO.MultipleOccurancePositionArray("O"));
        assertNotNull(SO.MultipleOccurancePositionArray("i"));
    }
    @Test
    public void RegexSpecificWord_AssertNull()
    {
        StringOccurances SO = new StringOccurances("");
        assertNull(SO.MultipleOccurancePositionArray("O"));
        assertNull(SO.MultipleOccurancePositionArray("i"));
    }
}
