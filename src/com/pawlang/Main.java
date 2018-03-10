package com.pawlang;

public class Main {

    static void fight (Monster m1,Monster m2){
        while (m1.getHp()>0 && m2.getHp()>0){
            System.out.println(m1.writeToString());
            System.out.println(m2.writeToString());
            System.out.println("-----------------------");
            m1.attack(m2);
            m2.attack(m1);
        }
    }

    public static void main(String[] args) {
	    Monster m1 = new Monster("m1",4,2,11);
        Monster m2 = new Monster("m2",3,1,20);
        fight(m1, m2);
    }
}
