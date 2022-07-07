package com.java.trials;

public class InheritanceTrial {
    public static void main(String[] args) {
        Base b = new Child();
        System.out.println("Salary in main "+b.salary);
        b.displaySalary();
//        Child c = (Child) new Base();         //Throws class cast exception as generic can be made specific
        Person p = new Student(1,"Shiv","Pawar");
        p.type();
    }
}
class Person{
    String name;
    String surname;
//    public Person(){}
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    protected void type(){
        System.out.println("I'm a person");
    }
}


class Student extends Person{
    int rollNo;
    public Student(int rollNo,String name, String surname){
        super(name,surname);
        this.rollNo = rollNo;
    }
    protected void type(){
        System.out.println("I'm a student");
    }
}


class Base{
    protected int salary = 10;
    public void displaySalary(){
        System.out.println("From base "+salary);
    }
}

class Child extends Base{
//    public void displaySalary(){
//        System.out.println("From child "+salary);
//    }
}
