package com.vowel;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class WordVowelCount {
    private Set<Character> characters = new HashSet<>();
    private int vowelCount;
    private int wordLength;
    private int count = 1;

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public void setVowelCount(int vowelCount) {
        this.vowelCount = vowelCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordVowelCount word = (WordVowelCount) o;
        return wordLength == word.wordLength && Objects.equals(characters, word.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characters, wordLength);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        Iterator<Character> iterator = characters.iterator();
        if (! iterator.hasNext())
            sb.append("{}");
        else {
            sb.append("{");
            while(true) {
                sb.append(iterator.next());
                if (!iterator.hasNext()){
                    sb.append('}').toString();
                    break;
                }
                sb.append(',');
            }
        }

        DecimalFormat formatter = new DecimalFormat("#.##");
        sb.append(", "+wordLength+") -> "+formatter.format(((double)vowelCount)/count));

        return sb.toString();
    }
}
