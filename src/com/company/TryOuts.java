package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class TryOuts {
    public static void main(String[] args) {
        Map<Integer,String> idToName = new HashMap<>();
        idToName.put(1,"SP");
        idToName.put(2,"AT");
        idToName.put(3,"MR");

        //old ways
        List<Map.Entry<Integer,String>> entryList = new LinkedList<>(idToName.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer,String> entry: entryList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
//        System.out.println("After sorting");
//        System.out.println(linkedHashMap);

        //Streams and lambdas ways
        Map<Integer, String> integerStringMapSorted = idToName.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
        List<String> valuesList = integerStringMapSorted.values().stream().collect(Collectors.toList());
        //Descending order
//        Map<Integer, String> integerStringMapDesending= idToName.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
//        Map<Integer, String> integerStringMapSortedDescending = idToName.entrySet().stream().sorted(Map.Entry.comparingByValue((o1,o2)-> o2.compareTo(o1))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
//        List<String> valuesList = integerStringMapSortedDescending.values().stream().collect(Collectors.toList());
        System.out.println(valuesList);
    }
}
