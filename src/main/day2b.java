package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class day2b {

    public static ArrayList<Integer> isRoundImpossible(String game, ArrayList<Integer> colourRGB){
        List<String> colourList = Arrays.asList(game.split(","));
        for (int i = colourList.size(); i > 0; i--) {
            String colour = colourList.get(i - 1).split(" ")[2];
            int balls = Integer.parseInt(colourList.get(i - 1).split(" ")[1]);
            //System.out.println(colour);
            if (colour.equals("red")){
                if (balls > colourRGB.get(0) ){
                    colourRGB.set(0, balls);
                }
            }
            else if (colour.equals("green")){
                if (balls > colourRGB.get(1) ) {
                    colourRGB.set(1, balls);
                }
            }
            else if (colour.equals("blue")) {
                if (balls > colourRGB.get(2) ){
                    colourRGB.set(2, balls);
                }
            }
            else{
                System.out.println("Failure to recognise colour");
            }
        }
        return colourRGB;
    }

    public static int takeGame(String data){
        List<String> roundList = Arrays.asList(data.split(";"));
        ArrayList<Integer> colourRGB = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
        for (int i = roundList.size(); i > 0; i--){
            colourRGB = (isRoundImpossible(roundList.get(i - 1), colourRGB));
        }
        int power = colourRGB.get(0) * colourRGB.get(1) * colourRGB.get(2);
        return power;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("src/main/input2a.txt");
        Scanner myReader = new Scanner(myObj);

        int result = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            //int gameID = Integer.parseInt((data.split(":")[0]).split(" ")[1]);
            //System.out.println(gameID);
            result += takeGame((data.split(":")[1]));


        }
        System.out.println(result);
        myReader.close();
    }
}
