package com.sainsburys.app.day4;

import java.io.*;
import java.util.*;

public class Day4a {

    //correct answer: 533775



    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("my-app/src/main/resources/input4a.txt");
        Scanner myReader = new Scanner(myObj);
        int total = 0;

        while (myReader.hasNextLine()) {
            total += findWinners.findWinners(myReader.nextLine());

        }



        System.out.println(total);
        myReader.close();
    }
}

