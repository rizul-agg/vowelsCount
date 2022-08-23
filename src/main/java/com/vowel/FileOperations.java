package com.vowel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

    public static List<String> readFile(String fileName) {
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            
            while (line != null) {
                String[] fileWords = line.split("[^a-zA-Z0-9\\-\'\\_]");
                for (String w : fileWords) {
                    if(w.matches("^[a-zA-Z0-9\\-'\\_]{1,}$")) {
                        words.add(w.toLowerCase().trim());
                    }
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public static void writeOutput(List<WordVowelCount> wordsAvg){
        try(PrintWriter writer = new PrintWriter("output.txt", "UTF-8")) {
            for(WordVowelCount w : wordsAvg){
                writer.println(w);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
