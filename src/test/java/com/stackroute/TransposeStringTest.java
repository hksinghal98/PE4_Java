package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    @Before
    public void begin(){
        TransposeString TS;
    }
    @After
    public void teardown(){
        TransposeString TS = null;
    }
    @Test
    public void TransposeString_AssertEquals()
    {
        TransposeString TS = new TransposeString();
        assertEquals("uhsnamiH lahgniS",TS.StringTranspose("Himanshu Singhal"));
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",TS.StringTranspose("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void TransposeString_AssertNull(){
        TransposeString TS = new TransposeString();
        assertNull(TS.StringTranspose(""));
    }

    @Test
    public void TransposeString_AssertNotNull(){
        TransposeString TS = new TransposeString();
        assertNotNull(TS.StringTranspose("uhsnamiH lahgniS"));
    }

}
