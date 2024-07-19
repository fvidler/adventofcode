package com.sainsburys.app.day4;

import java.util.ArrayList;

public class findTotalCards {

    public static ArrayList<Integer> findTotalCards(String rawData, ArrayList<Integer> cardNumbers){
        int wins = 0;
        String[] numbers = rawData.split(":")[1].split("\\s\\|");
        String[] winNumbers = (numbers[0].replaceAll(" {2}", " ")).split(" ");
        String[] myNumbers = (numbers[1].replaceAll(" {2}", " ")).split(" ");
        //System.out.println(myNumbers[1]);

        for(int n = 1; n < myNumbers.length; n++) {
            for(int w = 1; w < winNumbers.length; w++) {
                if(Integer.parseInt(myNumbers[n]) == (Integer.parseInt(winNumbers[w]))) {
                    wins += 1;
                    break;
                }
            }
        }
        System.out.println(wins);

        int noOfCopies = cardNumbers.get(0) + 1;
        for(int n = 1; n <= wins; n++) {
            if(n == cardNumbers.size()) {
                cardNumbers.add(noOfCopies);
            }
            else{
                int toBump = cardNumbers.get(n);
                cardNumbers.set(n, toBump + noOfCopies);
            }
            //System.out.println(n + " and " + cardNumbers.size());
            //System.out.println(cardNumbers);
        }

        //System.out.println(cardNumbers.get(1));
        return cardNumbers;
    }


}
