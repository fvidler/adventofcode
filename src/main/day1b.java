package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day1b {
    public static void main(String[] args) {
        Map<String, String> replacementsDictionary = createReplacementsDictionary();
        try (BufferedReader br = new BufferedReader(new FileReader("src/input1a.txt"))) {
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                // Perform replacements
                for (Map.Entry<String, String> entry : replacementsDictionary.entrySet()) {
                    line = line.replace(entry.getKey(), entry.getValue());
                }

                // Extract digits
                String digitsOnly = line.replaceAll("\\D", "");

                if (!digitsOnly.isEmpty()) {
                    int firstDigit = Character.getNumericValue(digitsOnly.charAt(0));
                    int lastDigit = Character.getNumericValue(digitsOnly.charAt(digitsOnly.length() - 1));
                    sum += (firstDigit * 10 + lastDigit);
                }

                else{
                    System.out.println("ERROR");
                }

            }

            System.out.println("Sum: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Map<String, String> createReplacementsDictionary() {
        Map<String, String> replacementsDictionary = new HashMap<>();
        replacementsDictionary.put("one", "on1e");
        replacementsDictionary.put("two", "tw2o");
        replacementsDictionary.put("three", "thr3e");
        replacementsDictionary.put("four", "fo4ur");
        replacementsDictionary.put("five", "fi5ve");
        replacementsDictionary.put("six", "si6x");
        replacementsDictionary.put("seven", "sev7en");
        replacementsDictionary.put("eight", "ei8ght");
        replacementsDictionary.put("nine", "ni9ne");
        return replacementsDictionary;

    }
}

