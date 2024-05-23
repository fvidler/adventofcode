package main;

import java.util.ArrayList;
import java.util.List;

public class symbolFinder {


    public static int symbolFinder(String[] aboveRow, String[] activeRow, String[] belowRow){

        int symbolsFound = 0;
        for (int i = 0; i < activeRow.length; i++) {
            if (isDotNumberOrSymbol.isDotNumberOrSymbol(activeRow[i].charAt(0)).equals("symbol")) {
                List<Integer> numberPlace = new ArrayList<>();





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
                int newNumber = 0;
                for (Integer value : numberPlace) {
                    newNumber *= 10;
                    newNumber += Integer.parseInt(activeRow[value]);
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
