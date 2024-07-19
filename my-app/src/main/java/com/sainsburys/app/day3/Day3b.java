package com.sainsburys.app.day3;

import com.sainsburys.app.day4.symbolFinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3b {

    //correct answer: 533775



    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("my-app/src/main/resources/input3a.txt");
        Scanner myReader = new Scanner(myObj);
        int total = 0;
        String[] aboveRow = null;
        String[] activeRow = null;
        String[] belowRow = myReader.nextLine().split("(?!^)");

        while (myReader.hasNextLine()) {
            //may skip last line
            aboveRow = activeRow;
            activeRow = belowRow;
            belowRow = myReader.nextLine().split("(?!^)");
            total += symbolFinder.symbolFinder(aboveRow, activeRow, belowRow);

        }
        aboveRow = activeRow;
        activeRow = belowRow;
        belowRow = null;
        total += symbolFinder.symbolFinder(aboveRow, activeRow, belowRow);



        System.out.println(total);
        myReader.close();
    }
}

