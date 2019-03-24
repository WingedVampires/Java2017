package com.lsc.lab2.count;

import java.util.*;

public class Statistics implements Counter {

    private String[] wordList;
    private List<Map.Entry<String, Integer>> list;

    public Statistics(String text) {
        this.wordList = text.split(" +");

        list = null;
    }

    public void setWordList(String text) {
        this.wordList = text.split(" +");
    }

    @Override
    public List<Map.Entry<String, Integer>> count() {
        Map<String, Integer> mapOfWords = new HashMap<>();

        for (String i : wordList) {
            if (mapOfWords.containsKey(i)) {
                Integer wordCount = mapOfWords.get(i);
                mapOfWords.put(i, ++wordCount);
            } else {
                mapOfWords.put(i, 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(mapOfWords.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(list);
        this.list = list;
        System.out.println(list.size());
        return list;
    }
}