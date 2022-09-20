package com.java.trials;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"aa");
        Employee employee1 = new Employee(1,"aa");

        if(employee.hashCode() == employee1.hashCode()){
            if (employee.equals(employee1)){
                System.out.println("Both are equal");
            }else {
                System.out.println("Both are different");
            }
        }else {
            System.out.println("Hashcode doesn't match");
        }
    }
}
