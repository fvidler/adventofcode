package com.sainsburys.app.day5;

import com.sainsburys.app.day4.findTotalCards;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5a {




    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("my-app/src/main/resources/input5a.txt");
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

