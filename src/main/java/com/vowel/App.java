package com.vowel;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Input file
        String s = "input.txt";

        // Reading all words from the input file
        List<String> words = FileOperations.readFile(s);

        // Making a call to the count method for getting the result
        List<WordVowelCount> wordsAvg = WordVowelAvg.countVowelAvg(words);

        // Writing the result to the output file
        FileOperations.writeOutput(wordsAvg);

        System.out.println("\n Completed");
    }
}
