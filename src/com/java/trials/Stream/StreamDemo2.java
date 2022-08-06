package com.java.trials.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo2 {

    public static void main(String[] args) {
        //        removeDulpicatesUsingStream();
        findDuplicatesAndPrintThem();
//        printAlternateNumberUsingStream();
//        nonPrimitiveToPrimitive();
//        nonPrimitiveToStreamsAndNonPrimitive();
    }
    private static void findDuplicatesAndPrintThem() {
        List<Integer> duplicates = Arrays.asList(1,2,1,3,4,2);
        Set<Integer> collect = new HashSet<>();
//        collect = duplicates.stream().filter((ele) -> Collections.frequency(duplicates,ele )> 1).collect(Collectors.toSet());
        //OR
        Set<Integer> finalCollect = collect;
        collect = duplicates.stream().filter(ele -> !finalCollect.add(ele)).collect(Collectors.toSet());
        System.out.println(collect);
    }

    private static void nonPrimitiveToStreamsAndNonPrimitive() {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3}).map(ele -> {
            System.out.println("Before doubling " + ele);
            return ele * 2;
        });
        int[] ints = intStream.toArray();
        for (int val :ints){
            System.out.println(val);
        }
    }

    private static void nonPrimitiveToPrimitive() {
        List<Integer> integerList = Arrays.stream(new int[]{1, 2, 3}).map(ele -> {
            System.out.println("Before doubling " + ele);
            return ele * 2;
        })
//                .boxed()
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }

    private static void printAlternateNumberUsingStream() {
        //print alternate element using java8, may be using for each.
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        int index = 0;
    }

    private static void removeDulpicatesUsingStream() {
        //Using stream to return unique from duplicate strings.
        List<String> names = Arrays.asList("SSP","AAT","WWW","SSP","THT","AAT");
//        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
    }
}
