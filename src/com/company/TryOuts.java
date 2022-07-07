package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class TryOuts {
    public static void main(String[] args) {

        //Create a map, sort the map by values using lambda function and then convert to other ds using streams
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
//        System.out.println(valuesList);

        //Given a array of integers with duplicate it should output the squares of it without duplicates.
        List<Integer> duplicates = Arrays.asList(1,1,2,3,4,4,6,8,5);
        List<Integer> listOfIntsWithoutDuplicates = duplicates.stream().distinct().map(ele -> ele * ele).collect(Collectors.toList());
//        System.out.println(listOfIntsWithoutDuplicates);

        // Remove duplicates from array using java 7 and move sorted to start and unsorted to end.
        int[] inputArr = {1,3,2,4,5,2,3,2};
        Arrays.sort(inputArr);
        int j = 1;
        for (int i = 1; i < inputArr.length; i++) {
            if(inputArr[i] != inputArr[j-1]) {
                inputArr[j] = inputArr[i];
                j++;
            }
        }
        //Loop till index where sorted elements.
//        for (int i = 0; i < j; i++) {
//            System.out.println(inputArr[i]);
//        }

        //String related questions
        String a="abc";
        String b=new String("abc");
        String c=a;
        System.out.println("String related questions : ");
        System.out.println(a==b);         //--> false
        System.out.println(a.equals(b));  //--> true;
        System.out.println(c.equals(b));  //--> true;
        b=null;
        System.out.println(c.equals(b));  //--> false
    }
}
