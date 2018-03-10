package com.pawlang;


public class Monster {
    private String name;
    private int attack;
    private int defense;
    private int hp;

    public Monster(String name, int attack, int defense, int hp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
    }

    String writeToString (){
        return "Name: " + this.name + ", attack: " + this.attack + ", defense: " + this.defense + ", hp: " + this.hp;
    }

    void attack (Monster m2){
        int dmg = this.attack - m2.getDefense();
        if (dmg < 0){
            dmg = 0;
        }
        int hp = m2.getHp();
        m2.setHp(hp - dmg);
        if (m2.getHp() <= 0){
            System.out.println(this.name + " wins.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
