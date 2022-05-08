package com.java.trials.concurrent.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        //Synced HashMap
//        HashMap<String,Integer> map = new HashMap<>();
//        Map<String, Integer> syncMap = Collections.synchronizedMap(map);
//        MapHelper1 mapHelper1 = new MapHelper1(syncMap);
//        MapHelper1 mapHelper11 = new MapHelper1(syncMap);
//        MapHelper2 mapHelper2 = new MapHelper2(syncMap);
//        MapHelper2 mapHelper22 = new MapHelper2(syncMap);
//        MapHelper3 mapHelper3 = new MapHelper3(syncMap);
//
//        for (Map.Entry<String,Integer> entry: syncMap.entrySet()) {
//            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
//        }

        //Concurrent HashMap
        ConcurrentHashMap<String, Integer> concurrentHashMapmap = new ConcurrentHashMap<String,Integer>();
        MapHelper1 mapHelper1 = new MapHelper1(concurrentHashMapmap);
        MapHelper2 mapHelper2 = new MapHelper2(concurrentHashMapmap);
        MapHelper3 mapHelper3 = new MapHelper3(concurrentHashMapmap);

        for (Map.Entry<String,Integer> entry: concurrentHashMapmap.entrySet()) {
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
    }
}
