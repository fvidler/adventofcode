package com.sainsburys.app;

import java.util.ArrayList;
import java.util.List;

public class symbolFinder {


    public static int symbolFinder(String[] aboveRow, String[] activeRow, String[] belowRow){

        int symbolsFound = 0;
        for (int i = 0; i < activeRow.length; i++) {
            if (isDotNumberOrSymbol.isDotNumberOrSymbol(activeRow[i].charAt(0)).equals("symbol")) {
                symbol s = new symbol();
                s.position = i;







            }
        }
        System.out.println("new row");
        //return numbersFound;
        return symbolsFound;
    }
}
