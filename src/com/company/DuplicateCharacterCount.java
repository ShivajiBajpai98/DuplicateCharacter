package com.company;

import java.util.Scanner;

public class DuplicateCharacterCount {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word =scanner.nextLine();
        int count;
        //Converts given string into character array
        char[] character = word.toCharArray();
        System.out.println("Duplicate characters in the given string: ");
        //Counts each character present in the string
        for(int index = 0; index <character.length; index++)
        {
            count = 1;
            for(int range = index+1; range <character.length; range++)
            {
                if(character[index] == character[range] && character[index] != ' ')
                {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    character[range] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && character[index] != '0')
                System.out.println(character[index]);
        }
        int wordCount = 0;

        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int scope = 0; scope < word.length(); scope++) {
                if (word.charAt(scope) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(letter + " repated = " + wordCount+" times");
                wordCount = 0;
            }
        }
    }
}
