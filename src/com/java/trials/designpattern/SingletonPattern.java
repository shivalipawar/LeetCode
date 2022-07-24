package com.java.trials.designpattern;

public class SingletonPattern {
    public static void main(String[] args) {
        Train t = Train.getInstance();
        Train t2 = Train.getInstance();
        t.setId(1165);
        t.setName("Goa Express");
        System.out.println("Train name is "+t.getName() +" and id is "+t.getId());
        System.out.println("Both reference same "+(t==t2));
    }
}

class Train{
    private String name;
    private int id;
    private static Train train;

    private Train(){

    }
   public static synchronized Train getInstance(){
       if(train == null){
           train = new Train();
       }
       return train;
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