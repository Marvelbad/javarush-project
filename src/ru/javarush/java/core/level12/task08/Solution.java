package ru.javarush.java.core.level12.task08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String textContent = "java core java map";

        HashMap<String, Integer> wordsCount = new HashMap<>();

        String[] strings = textContent.split(" ");

        for (String word : strings) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}