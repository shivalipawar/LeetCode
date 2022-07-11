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
//        System.out.println("String related questions : ");
//        System.out.println(a==b);         //--> false
//        System.out.println(a.equals(b));  //--> true;
//        System.out.println(c.equals(b));  //--> true;
//        b=null;
//        System.out.println(c.equals(b));  //--> false

        //Merge 2 array
        int[] arr1 = {1,2,3};
        int[] arr2 = {7,9,8,4};
        int[] result = {1,7,2,9,3,8,4};
        int[] actualRes = new int[arr1.length+arr2.length];

        int minLen = Math.min(arr1.length, arr2.length);
        int i=0,j1=0;
        while (i < minLen) {
            actualRes[j1] = arr1[i];
            actualRes[j1+1] = arr2[i];
            j1+=2;
            i+=1;
        }

        if(i < arr1.length){
            while (i<arr1.length){
                actualRes[j1] = arr1[i];
                i++;
                j1++;
            }

        }else if(i < arr2.length){
            while (i<arr2.length){
                actualRes[j1] = arr2[i];
                i++;
                j1++;
            }
        }
//        for (int i1 = 0; i1 < actualRes.length; i1++) {
//            System.out.println(actualRes[i1]);
//        }

        //Given string array print distinct character with its count
        //eg:- 	Input = {apple,banana,chikoo}
        //Output = {a:4,b:1,c1…}

        Map<Character,Integer> charCount = printDistinctCharFromStringArrayWithItsCount();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }

    private static Map<Character, Integer> printDistinctCharFromStringArrayWithItsCount() {
        String[] input = {"apple","banana","chikoo","pear"};
        Map<Character,Integer> charCount = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String fruit = input[i];
            char[] fruitChars = fruit.toCharArray();
            for (int j = 0; j < fruitChars.length; j++) {
                if(charCount.containsKey(fruitChars[j])){
                    charCount.put(fruitChars[j], charCount.get(fruitChars[j])+1);
                }else{
                    charCount.put(fruitChars[j], 1);
                }
            }
        }
        return charCount;
    }
}
