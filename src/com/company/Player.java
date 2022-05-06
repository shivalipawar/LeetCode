package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player implements Comparable<Player>{

    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : ");
        footballTeam.forEach(player -> System.out.println(player.name));
        Collections.sort(footballTeam);
        System.out.println("After Sorting by ranking : ");
        footballTeam.forEach(player -> System.out.println(player.name));
        PlayerComparatorAge playerComparatorAge = new PlayerComparatorAge();
        footballTeam.sort(playerComparatorAge);
        System.out.println("Comparator for age : ");
        footballTeam.forEach(player -> System.out.println(player.name));
    }

    @Override
    public int compareTo(Player player) {
        return this.ranking - player.ranking;
    }
}

class PlayerComparatorAge implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getAge() , o2.getAge());
    }
}
