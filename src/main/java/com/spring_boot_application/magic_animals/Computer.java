package com.spring_boot_application.magic_animals;

public class Computer implements Participents{
    String name="Computer";
    static int score=0;
    double health;
    String animal;
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    String type;
    
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    String attack;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getScore() {
        return score;
    }
    public static void setScore(int score) {
        Computer.score = score;
    }
    public String getAttack() {
        return attack;
    }
    public void setAttack(String attack) {
        this.attack = attack;
    }
}
