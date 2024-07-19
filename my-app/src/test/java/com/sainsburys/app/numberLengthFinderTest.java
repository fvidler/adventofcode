package com.sainsburys.app;

import com.sainsburys.app.day3.numberLengthFinder;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class numberLengthFinderTest {

    @Test
    public void testReturnNotNumber()
    {
        int number = 2;
        int answer = -1;
        String[] row = {"5", ".", ".", "1", "."};
        assertEquals(answer, (numberLengthFinder.lengthFinder(row, number)));
    }

    @Test
    public void testReturnOne()
    {
        int number = 2;
        int answer = 1;
        String[] row = {".", ".", "1", ".", "."};
        assertEquals(answer, (numberLengthFinder.lengthFinder(row, number)));
    }

    @Test
    public void testReturnThree()
    {
        int number = 2;
        int answer = 149;
        String[] row = {".", ".", "1", "4", "9"};
        assertEquals(answer, (numberLengthFinder.lengthFinder(row, number)));
        number = 4;
        assertEquals(answer, (numberLengthFinder.lengthFinder(row, number)));
    }

    @Test
    public void testReturnFive()
    {
        int number = 2;
        int answer = 63149;
        String[] row = {"6", "3", "1", "4", "9"};
        assertEquals(answer, (numberLengthFinder.lengthFinder(row, number)));
    }

    @Test
    public void testNoGaps()
    {
        int number = 2;
        int answer = 189;
        String[] row = {"6", ".", "1", "8", "9"};
        assertEquals(answer, (numberLengthFinder.lengthFinder(row, number)));
    }
}
