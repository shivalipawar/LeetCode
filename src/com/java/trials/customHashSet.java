package com.java.trials;

import java.util.HashSet;

public class customHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println(set.size());

        HashSet<Employee> employeeSet = new HashSet<>();
        Employee e1 = new Employee(1,"Sam");
        Employee e2 = new Employee(1,"Sam");
        employeeSet.add(e1);
        employeeSet.add(e2);
        System.out.println(employeeSet.size());
    }
}
