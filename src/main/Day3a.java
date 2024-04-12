package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3a {

    public String numberFinder(String numberList){
        numberList = "5";
        return numberList;
    }


    public void main(String[] args) throws FileNotFoundException {
        File myObj = new File("src/main/input2a.txt");
        Scanner myReader = new Scanner(myObj);
        int total = 0;
        String firstRow = null;
        String secondRow = null;
        String thirdRow = null;

        while (myReader.hasNextLine()) {
            //may skip last line
            firstRow = secondRow;
            secondRow = thirdRow;
            thirdRow = myReader.nextLine();

            if(secondRow != null) {
                new numberFinder(secondRow);
            }


        }



        System.out.println(total);
        myReader.close();
    }
}

