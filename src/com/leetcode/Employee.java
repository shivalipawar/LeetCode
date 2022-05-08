package com.leetcode;

import java.util.*;

public class Employee {
    int id;
    String name;
    String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        Map<String,Employee> data = new HashMap<>();
        data.put("A",new Employee(1,"Sagar","Staff Engineer"));
        data.put("A",new Employee(2,"Asim","Service Engineer"));

        for (String key:data.keySet()) {
            Employee e = data.get(key);
            System.out.println(e.getName());
        }

        System.out.println("Data after sorting");
        
//        sortByEmployeeName(data);
        
        for (String key:data.keySet()) {
            Employee e = data.get(key);
            System.out.println(e.getName());
        }
        
    }

//    private static Map<String,Employee> sortByEmployeeName(Map<String, Employee> data) {
//        List<Map<String,Employee>> mapLinkedList =  new LinkedList(data.entrySet());
//        Collections.sort(mapLinkedList, new Comparator<Map.Entry<String, Employee>>() {
//            @Override
//            public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
//                Employee e1 = o1.getValue();
//                Employee e2 = o2.getValue();
////                return e1.name - e2.name;
//                return null;
//            }
//        });
//        return mapLinkedList;
//    }
}
