package com.java.trials.customHashMap;

public class UseCustomMap {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("Shiv",2);
        map.put("Maha",3);
        map.put("Vaish",8);
        Object value = map.get("Maha");
        System.out.println("Value for key Maha "+value);
        System.out.println("Remove Rim key "+map.remove("Rim"));
        System.out.println("Remove Shiv key "+map.remove("Shiv"));
        map.display();
    }
}
