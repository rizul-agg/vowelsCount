package com.vowel;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test1(){
        List<String> words = FileOperations.readFile(getClass().getClassLoader().getResource("input1.txt").getPath());
        List<WordVowelCount> wordsAvg = WordVowelAvg.countVowelAvg(words);

        WordVowelCount w1 = new WordVowelCount();
        Set<Character> ch1 = new HashSet<>();
        ch1.add('a');
        ch1.add('o');
        w1.setWordLength(6);
        w1.setCount(2);
        w1.setVowelCount(5);
        w1.setCharacters(ch1);

        WordVowelCount w2 = new WordVowelCount();
        Set<Character> ch2 = new HashSet<>();
        ch2.add('a');
        ch2.add('e');
        w2.setWordLength(4);
        w2.setCount(1);
        w2.setVowelCount(2);
        w2.setCharacters(ch2);

        WordVowelCount w3 = new WordVowelCount();
        Set<Character> ch3 = new HashSet<>();
        ch3.add('a');
        ch3.add('o');
        w3.setWordLength(5);
        w3.setCount(1);
        w3.setVowelCount(2);
        w3.setCharacters(ch3);

        Assert.assertTrue(wordsAvg.contains(w1));
        Assert.assertTrue(wordsAvg.contains(w2));
        Assert.assertTrue(wordsAvg.contains(w3));
        Assert.assertEquals(words.size(), 4);
        Assert.assertEquals(wordsAvg.size(), 3);
    }

    @Test
    public void test2(){
        List<String> words = FileOperations.readFile(getClass().getClassLoader().getResource("input2.txt").getPath());
        List<WordVowelCount> wordsAvg = WordVowelAvg.countVowelAvg(words);

        WordVowelCount w1 = new WordVowelCount();
        Set<Character> ch1 = new HashSet<>();
        ch1.add('a');
        ch1.add('e');
        ch1.add('i');
        w1.setWordLength(12);
        w1.setCount(1);
        w1.setVowelCount(4);
        w1.setCharacters(ch1);

        WordVowelCount w2 = new WordVowelCount();
        Set<Character> ch2 = new HashSet<>();
        ch2.add('i');
        w2.setWordLength(2);
        w2.setCount(1);
        w2.setVowelCount(1);
        w2.setCharacters(ch2);

        WordVowelCount w3 = new WordVowelCount();
        Set<Character> ch3 = new HashSet<>();
        ch3.add('a');
        w3.setWordLength(2);
        w3.setCount(1);
        w3.setVowelCount(1);
        w3.setCharacters(ch3);

        WordVowelCount w4 = new WordVowelCount();
        Set<Character> ch4 = new HashSet<>();
        ch4.add('i');
        ch4.add('o');
        w4.setWordLength(6);
        w4.setCount(1);
        w4.setVowelCount(2);
        w4.setCharacters(ch4);

        WordVowelCount w5 = new WordVowelCount();
        Set<Character> ch5 = new HashSet<>();
        ch5.add('a');
        ch5.add('e');
        w5.setWordLength(4);
        w5.setCount(1);
        w5.setVowelCount(2);
        w5.setCharacters(ch5);

        Assert.assertTrue(wordsAvg.contains(w1));
        Assert.assertTrue(wordsAvg.contains(w2));
        Assert.assertTrue(wordsAvg.contains(w3));
        Assert.assertTrue(wordsAvg.contains(w4));
        Assert.assertTrue(wordsAvg.contains(w5));
        Assert.assertEquals(words.size(), 5);
        Assert.assertEquals(wordsAvg.size(), 5);
    }

    @Test
    public void test3(){
        List<String> words = FileOperations.readFile(getClass().getClassLoader().getResource("input3.txt").getPath());
        List<WordVowelCount> wordsAvg = WordVowelAvg.countVowelAvg(words);

        Assert.assertTrue(words.isEmpty());
        Assert.assertTrue(wordsAvg.isEmpty());
    }
}
