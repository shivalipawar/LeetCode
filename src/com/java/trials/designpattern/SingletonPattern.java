package com.java.trials.designpattern;

public class SingletonPattern {
    public static void main(String[] args) {
        Train t = Train.getInstance();
        t.setId(1165);
        t.setName("Goa Express");
        System.out.println("Train name is "+t.getName() +" and id is "+t.getId());
    }
}

class Train{
    private String name;
    private int id;

    private Train(){

    }
   public static Train getInstance(){
       return new Train();
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}