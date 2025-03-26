package org.example.Lesson5.Homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("Mellon");
        words.add("mellon");
        words.add("Cherry");

        HashMap<String, Integer> dictionary = new HashMap<>();

        for(String word : words){
            if(dictionary.containsKey(word)){
                dictionary.put(word, dictionary.get(word)+1);
            }else{
                dictionary.put(word, 1);
            }
        }
        dictionary.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
