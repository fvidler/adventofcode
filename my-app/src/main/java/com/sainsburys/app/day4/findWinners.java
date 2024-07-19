package com.sainsburys.app.day4;

public class findWinners {

    public static int findWinners(String rawData){
        int winnerValue = 0;
        String[] numbers = rawData.split(":")[1].split("\\s\\|");
        String[] winNumbers = (numbers[0].replaceAll(" {2}", " ")).split(" ");
        String[] myNumbers = (numbers[1].replaceAll(" {2}", " ")).split(" ");
        //System.out.println(myNumbers[1]);

        for(int n = 1; n < myNumbers.length; n++) {
            for(int w = 1; w < winNumbers.length; w++) {
                if(Integer.parseInt(myNumbers[n]) == (Integer.parseInt(winNumbers[w]))) {
                    if(winnerValue == 0){
                        winnerValue = 1;
                    }
                    else{
                        winnerValue *= 2;
                    }
                    break;
                }
            }
        }
        System.out.println(winnerValue);
        return winnerValue;
    }


}
