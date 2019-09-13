package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringWordsTest {
    @Before
    public void begin(){
        SortStringWords SSW;
    }
    @After
    public void teardown(){
        SortStringWords SSW = null;
    }
    @Test
    public void SortStringWords_AsserEquals()
    {
        SortStringWords SSW = new SortStringWords("a quick, brown fox jumps over. the\n lazy dog");
        assertEquals(new String[]{"a", "brown", "dog", "fox", "jumps", "lazy", "over", "quick", "the"},SSW.SortStringAlphabetically());
    }
    @Test
    public void SortStringWords_AsserNull(){
        SortStringWords SSW = new SortStringWords("");
        assertNull(SSW.SortStringAlphabetically());
    }
    @Test
    public void SortStringWords_AsserNotNull()
    {
        SortStringWords SSW = new SortStringWords("a quick, brown fox jumps over. the\n lazy dog");
        assertNotNull(SSW.SortStringAlphabetically());
    }

}
