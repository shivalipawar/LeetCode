package com.java.trials;

class Vehicle
{
    int vehicleNumber;
    void start(){
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {

    @Override
//    void start() throws Exception {     //This doesn't compile as while typing it says exception has to be thrown from vehicle.start.
//    void start() throws RuntimeException { //This does compile as its not compulsory to add throws to parent method too
    void start() {
        try {
            System.out.println("Car started");
//            throw new NullPointerException();           //this compiles fine without any throws.
            return;                                     //both throw and return cant be together, gives compilation error.
        } catch (Exception ex) {
            System.out.println("Car busted from catch block");
        } finally {
            System.out.println("Car busted");
        }
        return;                                         //this is unnecessary as method is void.
    }
}
public class InheritanceAndException {

    public static void main(String args[]){
        Vehicle vehicle = new Car();
        Vehicle vehicle1 = new Car();
        vehicle.start();
        System.out.println(vehicle.hashCode() + "...."+ vehicle1.hashCode());
        System.out.println(vehicle.equals(vehicle1));
    }
}
