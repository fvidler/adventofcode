package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1a {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/input1a.txt");
            Scanner myReader = new Scanner(myObj);
            int total = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char firstIndex = 'a';
                char lastIndex = 'b';
                for (int i = 0; i < data.length(); i++) {
                    if (Character.isDigit(data.charAt(i))) {
                        if (firstIndex == 'a') {
                            firstIndex = data.charAt(i);
                        }
                        lastIndex = data.charAt(i);
                    }
                }
                int lineNumber = (10*Character.getNumericValue(firstIndex) + Character.getNumericValue(lastIndex));
                System.out.println(lineNumber);
                total += lineNumber;

            }

            System.out.println(total);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
