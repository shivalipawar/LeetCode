package com.company;

public class ParkingSystem {

    int smallCarSlots = 0;
    int mediumCarSlots = 0;
    int bigCarSlots = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.bigCarSlots = big;
        this.mediumCarSlots = medium;
        this.smallCarSlots = small;
    }

    public boolean addCar(int carType) {
        System.out.println("Slots : Big "+bigCarSlots+" Medium "+mediumCarSlots +" Small "+smallCarSlots);
        if(carType == 1 && bigCarSlots > 0){
            bigCarSlots = bigCarSlots - 1;
            return true;
        }else if(carType == 2 && mediumCarSlots > 0){
            mediumCarSlots = mediumCarSlots -1;
            return true;
        }else if(carType == 3 && smallCarSlots > 0){
            smallCarSlots --;
            return true;
        }
        return false;
    }
}
