package com.home;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyQuequeTest {
    ArmQueque<Integer> actual;
    ArmQueque<String> actualString;
    @BeforeEach
    void setUp() {
        actual=new MyQueque<>();
        actualString=new MyQueque<>();
    }
    @Test
    public void pushIntegers() {
        int elem = 1;
        int expectedSize = 1;

        actual.push(elem);

        assertEquals(expectedSize, actual.getSize());
    }

    @Test
    public void pushNull() {

        actual.push(null);

        assertEquals(0, actual.getSize());
    }

    @Test
    public void pullFromNotEmpty() throws MyException {
        int expectedValue = 100;

        actual.push(100);
        Integer elem = actual.pull();

        assertEquals(expectedValue, elem);
    }

    @Test
    public void pullFromEmpty() {

        assertThrows(MyException.class, () -> actual.pull());
    }

    @Test
    public void checkLengthAfterPull() throws MyException {
        int expectedSize = 0;

        actual.push(100);

        actual.pull();

        assertEquals(expectedSize, 0);
    }

    @Test
    public void checkFirstIsRemoved() throws MyException {
        int expected = 100;

        actual.push(100);
        actual.push(200);

        Integer firstOut = actual.pull();

        assertEquals(expected, firstOut);
    }

    @Test
    public void dontAddEmptyString() {

        actualString.push("");

        assertEquals(0, actualString.getSize());
    }
}