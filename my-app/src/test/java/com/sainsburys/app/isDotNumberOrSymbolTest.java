package com.sainsburys.app;


import org.junit.*;
import java.util.*;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class isDotNumberOrSymbolTest
{


    @Test
    public void acknowledgeDot()
    {
        char dot = '.';
        assertEquals(isDotNumberOrSymbol.isDotNumberOrSymbol(dot), "dot");
        //System.out.println("dot configured correctly");
    }

    @Test
    public void acknowledgeDigit()
    {
        String digits = "0123456789";

        for(int d = 0; d < digits.length(); d++){
            assertEquals(isDotNumberOrSymbol.isDotNumberOrSymbol(digits.charAt(d)), "digit");
            //System.out.println(d + " configured correctly");
        }
    }

    @Test
    public void acknowledgeSymbol()
    {
        String symbols = "abcdefghijklmnopqrstuvwxyz!@£$%^&*-+=_<>,?/`~";

        for(int s = 0; s < symbols.length(); s++){
            assertEquals(isDotNumberOrSymbol.isDotNumberOrSymbol(symbols.charAt(s)), "symbol");
            //System.out.println(d + " configured correctly");
        }
    }
}
