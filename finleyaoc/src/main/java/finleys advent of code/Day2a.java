package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day2a {

    public static boolean isRoundImpossible(String game, int red, int green, int blue){
        List<String> colourList = Arrays.asList(game.split(","));
        for (int i = colourList.size(); i > 0; i--) {
            String colour = colourList.get(i - 1).split(" ")[2];
            int balls = Integer.parseInt(colourList.get(i - 1).split(" ")[1]);
            //System.out.println(colour);
            if (colour.equals("red")){
                if (balls > red ){
                    return true;
                }
            }
            else if (colour.equals("green")){
                if (balls > green ){
                    return true;
                }
            }
            else if (colour.equals("blue")) {
                if (balls > blue ){
                    return true;
                }
            }
            else{
                System.out.println("Failure to recognise colour");
            }
        }
        return false;
    }

    public static boolean splitAndCheckRounds(String data, int red, int green, int blue){
        List<String> roundList = Arrays.asList(data.split(";"));
        for (int i = roundList.size(); i > 0; i--){
            if (isRoundImpossible(roundList.get(i - 1), red, green, blue)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("src/main/input2a.txt");
        Scanner myReader = new Scanner(myObj);

        int red = 12;
        int green = 13;
        int blue = 14;

        int result = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            int gameID = Integer.parseInt((data.split(":")[0]).split(" ")[1]);
            //System.out.println(gameID);
            if (splitAndCheckRounds((data.split(":")[1]), red, green, blue)) {
                result += gameID;
            }


        }
        System.out.println(result);
        myReader.close();
    }
}
