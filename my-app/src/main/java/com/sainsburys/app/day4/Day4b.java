package com.sainsburys.app.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day4b {




    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("my-app/src/main/resources/input4a.txt");
        Scanner myReader = new Scanner(myObj);
        int totalCards = 0;
        ArrayList<Integer> cardNumbers = new ArrayList<Integer>();
        cardNumbers.add(0);

        while (myReader.hasNextLine()) {
            cardNumbers = findTotalCards.findTotalCards(myReader.nextLine(), cardNumbers);
            totalCards += cardNumbers.get(0) + 1;
            cardNumbers.remove(0);
            if(cardNumbers.size() == 0) {
                cardNumbers.add(0);
            }
            System.out.println("total: " + totalCards);

        }



        System.out.println("Final total: " + totalCards);
        myReader.close();
    }
}

