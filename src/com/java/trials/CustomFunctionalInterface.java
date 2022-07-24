package com.java.trials;

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        useFuncInterface((p)->"Hello "+p,"Shivali");
    }
    public static void useFuncInterface(Person2 person2,String name){
        System.out.println("Using Person2 "+person2.getPersonName(name));
        person2.doNothing();
        Person2.doS();
    }
}

interface Person1{
    public abstract String getPersonName(String name);
}
@FunctionalInterface
interface Person2 extends Person1{
    default void doNothing(){
        System.out.println("Do Nothing");
    }
    static void doS(){
        System.out.println("Do s");
    }
}
