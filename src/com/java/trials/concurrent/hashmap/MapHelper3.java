package com.java.trials.concurrent.hashmap;

import java.util.Map;

public class MapHelper3 implements Runnable{

    Map<String,Integer> map;

    public MapHelper3(Map<String, Integer> map) {
        this.map = map;
        new Thread(this,"MapThread3").start();
    }

    @Override
    public void run() {
        map.put("Three",3);
        try {
            System.out.println("MapThread3 sleeping");
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
