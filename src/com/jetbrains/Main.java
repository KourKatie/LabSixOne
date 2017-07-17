package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userWord = "";
        String vowels = "aeiou";
        int i = 0;
        int s = 0;
        int vowelsLength = vowels.length();
        int count = 0;
        int totalCount = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");

        System.out.print("Please enter a word: ");
        userWord = scnr.next();

        int wordLength = lowerCaseWord(userWord).length();

        for (i = 0; i < vowelsLength; i++) {
            char vowelLetter = vowels.charAt(i);
            char wordLetter = lowerCaseWord(userWord).charAt(0);
            if (vowelLetter == wordLetter) {
                System.out.println("Translation: " + lowerCaseWord(userWord) + "way");
                break;
            }
            else {
                totalCount = 5;
            }
        }
            for (i = 0; i < wordLength; i++) {
                char wordConsLetter = lowerCaseWord(userWord).charAt(i);
                for (s = 0; (s < vowelsLength) && (totalCount == 5); s++) {
                    char vowelLetter = vowels.charAt(s);
                    if (wordConsLetter != vowelLetter) {
                        count++;
                    }
                    else {
                        totalCount = (count / 5);
                        System.out.println("Translation: " + (lowerCaseWord(userWord).substring(totalCount, wordLength)) +
                                (lowerCaseWord(userWord).substring(0, totalCount)) + "ay");
                    }
                }
            }
        }


    public static String lowerCaseWord(String userWord) {
        String lowerCase = userWord.toLowerCase();
        return lowerCase;
    }


}
