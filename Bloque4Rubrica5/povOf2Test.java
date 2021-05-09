package Bloque4Rubrica5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class povOf2Test {

	povOf2 pov = new povOf2();

    @Test
    void povOf2 () {
        assertEquals("4", povOf2.povOf2(2));
    }

    @Test
    void povOf5 () {
        assertEquals("32", povOf2.povOf2(5));
    }

    @Test
    void povOf0 () {
        assertEquals("0", povOf2.povOf2(0));
    }

    @Test
    void povOfNegative1 () {
        assertEquals("0,5", povOf2.povOf2(-1));
    }

    @Test
    void povOfNegative4 () {
        assertEquals("0,0625", povOf2.povOf2(-4));
    }

}
