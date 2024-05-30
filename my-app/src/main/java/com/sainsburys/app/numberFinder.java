package com.sainsburys.app;

import java.util.ArrayList;
import java.util.List;

public class numberFinder {


    public static int numberFinder(String[] aboveRow, String[] activeRow, String[] belowRow){

        int numbersFound = 0;
        for (int i = 0; i < activeRow.length; i++) {
            if (isDotNumberOrSymbol.isDotNumberOrSymbol(activeRow[i].charAt(0)).equals("digit")) {
                List<Integer> numberPlace = new ArrayList<>();
                while (isDotNumberOrSymbol.isDotNumberOrSymbol(activeRow[i].charAt(0)).equals("digit")){

                    numberPlace.add(i);
                    i++;
                    if(i >= activeRow.length){
                        break;
                    }
                }

                int newNumber = 0;
                for (Integer value : numberPlace) {
                    newNumber *= 10;
                    newNumber += Integer.parseInt(activeRow[value]);
                }


                List<Integer> adjacentChecklist = assembleAdjacentChecklist.assembleAdjacentChecklist(numberPlace, activeRow);
                boolean invalidNumber = true;
                for (Integer integer : adjacentChecklist) {
                    if (aboveRow != null) {
                        if (isDotNumberOrSymbol.isDotNumberOrSymbol((aboveRow[integer].charAt(0))).equals("symbol")) {
                            invalidNumber = false;
                            break;
                        }
                    }
                    if (isDotNumberOrSymbol.isDotNumberOrSymbol((activeRow[integer].charAt(0))).equals("symbol")) {
                        invalidNumber = false;
                        break;
                    }
                    if (belowRow != null) {
                        if (isDotNumberOrSymbol.isDotNumberOrSymbol((belowRow[integer].charAt(0))).equals("symbol")) {
                            invalidNumber = false;
                            break;
                        }
                    }
                }
                if(!invalidNumber){
                    numbersFound += newNumber;
                    System.out.println(newNumber);
                }

                }
            }
        System.out.println("new row");
        return numbersFound;
    }
}
