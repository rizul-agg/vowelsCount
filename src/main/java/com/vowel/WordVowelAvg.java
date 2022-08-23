package com.vowel;

import java.util.*;

public class WordVowelAvg {
    public static List<WordVowelCount> countVowelAvg(List<String> words){
        List<WordVowelCount> resList = new ArrayList<>();

        for(String word : words){
            WordVowelCount wordVowelCountPerWord = new WordVowelCount();
            wordVowelCountPerWord.setWordLength(word.length());
            int vowelCount = 0;
            Set<Character> charSet = new HashSet<>();

            for(Character ch : word.toCharArray()){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                    wordVowelCountPerWord.setVowelCount(++vowelCount);
                    charSet.add(ch);
                    wordVowelCountPerWord.setCharacters(charSet);
                }
            }

            if(!resList.contains(wordVowelCountPerWord)){
                resList.add(wordVowelCountPerWord);
            }
            else{
                for(WordVowelCount wc : resList){
                    if(wc.equals(wordVowelCountPerWord)){
                        wc.setCount(wc.getCount()+1);
                        wc.setVowelCount(wc.getVowelCount()+wordVowelCountPerWord.getVowelCount());
                        break;
                    }
                }
            }
        }

        return resList;
    }
}
