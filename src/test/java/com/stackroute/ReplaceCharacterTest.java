package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    @Before
    public void begin(){
        ReplaceCharacter RC;
    }
    @After
    public void teardown(){
        ReplaceCharacter RC = null;
    }
    @Test
    public void CountFrequency_AssertEquals()
    {
        ReplaceCharacter RC = new ReplaceCharacter("java is java again java again");
        assertEquals("xyvy is xyvy ygyin xyvy ygyin",RC.CharactersToReplace(new char[]{'j','a'},new char[]{'x','y'}));
        assertEquals("xyHy is xyHy ygyiI xyHy ygyiI",RC.CharactersToReplace(new char[]{'v','n'},new char[]{'H','I'}));
    }

    @Test
    public void CountFrequency_NotNull()
    {
        ReplaceCharacter RC = new ReplaceCharacter("java is java again java again");
        assertNotNull(RC.CharactersToReplace(new char[]{'j','a'},new char[]{'x','y'}));
    }

    @Test
    public void ReplaceCharacter_Null(){
        ReplaceCharacter RC = new ReplaceCharacter("java is java again java again");
        assertNull(RC.CharactersToReplace(new char[]{'j','a','s'},new char[]{'x','y'}));
    }
}
