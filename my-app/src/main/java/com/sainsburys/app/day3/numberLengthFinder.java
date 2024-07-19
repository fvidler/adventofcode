package com.sainsburys.app.day3;

public class numberLengthFinder {
    public static int lengthFinder(String[] row, int number){
        int length = 0;
        if(isDotNumberOrSymbol.isDotNumberOrSymbol(row[number].charAt(0)) != "digit"){
            return -1;
        }
        else {
            length += Integer.parseInt(row[number]);
            int countBack = number;
            int multiplier = 1;
            while (countBack > 0) {
                countBack -= 1;
                if(isDotNumberOrSymbol.isDotNumberOrSymbol(row[countBack].charAt(0)) != "digit"){
                    break;
                }
                else{
                    multiplier = multiplier * 10;
                    length += Integer.parseInt(row[countBack]) * multiplier;
                }
            }
            int countForward = number;
            while (countForward < (row.length -1)){
                countForward += 1;
                if(isDotNumberOrSymbol.isDotNumberOrSymbol(row[countForward].charAt(0)) != "digit"){
                    break;
                }
                else{
                    length = length * 10;
                    length += Integer.parseInt(row[countForward]);
                }
            }
        }
        return length;
    }
}
