package com.java.trials;

import java.util.HashMap;

public class MapTrials {
    public static void main(String[] args) {
        HashMap<String,String> stringHashMap = new HashMap<>();
        HashMap<StringBuffer,String> bufferStringHashMap = new HashMap<>();

        stringHashMap.put(new String("aa"),"aa");
        stringHashMap.put(new String("aa"),"bb");
        stringHashMap.put(new String("aa"),"cc"); //--> 1

        bufferStringHashMap.put(new StringBuffer("aa"),"aa");
        bufferStringHashMap.put(new StringBuffer("aa"),"bb");
        bufferStringHashMap.put(new StringBuffer("aa"),"cc"); //--> 3 as stringbuffer equals is from object

        System.out.println(stringHashMap.size() + "  "+ bufferStringHashMap.size());

    }
}
