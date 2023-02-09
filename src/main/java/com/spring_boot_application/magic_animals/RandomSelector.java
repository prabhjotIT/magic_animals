package com.spring_boot_application.magic_animals;

import java.util.Random;

public class RandomSelector {
    enum anml {
        lion, Turtle, hyena
    };

    enum typ {
        Fire, Water, Leaf
    };

    public static String getRandomAnimal() {
        Random rand = new Random();
        switch (rand.nextInt(3)+1) {
            case 1: {
                return "Lion";
            }
            case 2: {
                return "Turtle";
            }
            case 3: {
                return "Hyena";
            }
        }
        return "Lion";
    }
    public static String getRandomType(){
        Random rand = new Random();
        switch (rand.nextInt(3)+1) {
            case 1: {
                return "Fire";
            }
            case 2: {
                return "Water";
            }
            case 3: {
                return "Leaf";
            }
        }
        return "Fire";
    }
}
