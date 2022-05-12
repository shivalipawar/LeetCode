package com.java.trials.designpattern;

public class FactoryPattern {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        Person male = personFactory.getPerson("Rajiv", "M");
        Person female = personFactory.getPerson("Lisa", "F");
        System.out.println("Male details "+ male.getSalutation() + male.name);
        System.out.println("Female details "+ female.getSalutation() + female.name);
    }
}

class PersonFactory{
    public Person getPerson(String name, String gender){
        if(gender.equals("M"))
            return new Male(name);
        else if(gender.equals("F"))
            return new Female(name);
        else
            return null;
    }
}

abstract class Person{
    public String name;

    Person(String name){
        this.name = name;
    }

    abstract String getSalutation();
}

class Male extends Person{

    Male(String name){
        super(name);
        }

    @Override
    String getSalutation() {
        return "Mr";
    }
}

class Female extends Person{

    Female(String name){
        super(name);
    }

    @Override
    String getSalutation() {
        return "Ms";
    }
}
