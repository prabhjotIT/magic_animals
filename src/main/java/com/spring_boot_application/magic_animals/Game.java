package com.spring_boot_application.magic_animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/***
 * This class is responsible to create the game and setup everything
 */
public class Game {
    
    private String playerName = "God";
    private int score = 0;
    private Player p = Player.getInstance(playerName, score);;
    public Player getP() {
        return p;
    }
    String c1animalpic="";
    String c2animalpic="";
    String c3animalpic="";
    
    private Computer c1=new Computer();
    public Computer getC1() {
        return c1;
    }

    public void setC1(Computer c1) {
        this.c1 = c1;
    }

    private Computer c2=new Computer();
    public Computer getC2() {
        return c2;
    }

    public void setC2(Computer c2) {
        this.c2 = c2;
    }

    public Computer getC3() {
        return c3;
    }

    public void setC3(Computer c3) {
        this.c3 = c3;
    }

    private Computer c3=new Computer();
    final double BASIC_HEALTH = 10;
    String playertype = " ";
    String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPlayertype() {
        return playertype;
    }

    public void setPlayertype(String playertype) {
        this.playertype = playertype;
    }

    public String getPlayerAnimal() {
        return playerAnimal;
    }

    public void setPlayerAnimal(String playerAnimal) {
        this.playerAnimal = playerAnimal;
    }

    String playerAnimal = " ";
    String turn = "player";

    Game() {

    }

    public void setupGame() {
        // first create new player
        System.out.println("player default name is God and score is 0");// or you can create custom name
        
        // player created;

        // player(the magician) choose its game animal and there type
        // by default it is set to turtle and leaf;

        p.setHealth(BASIC_HEALTH);
        

        // computer players
       


        // this is for production
        c1.setAnimal(RandomSelector.getRandomAnimal());
        c1.setType(RandomSelector.getRandomType());
        c2.setAnimal(RandomSelector.getRandomAnimal());
        c2.setType(RandomSelector.getRandomType());
        c3.setAnimal(RandomSelector.getRandomAnimal());
        c3.setType(RandomSelector.getRandomType());

        if(c1.getAnimal().equalsIgnoreCase("Lion"))c1animalpic="https://media.istockphoto.com/id/877369086/photo/lion-panthera-leo-10-years-old-isolated-on-white.jpg?s=612x612&w=0&k=20&c=J__Jx_BX_FN7iehO965TJtPFYUl0A-bwFgIYaK32R3Y=";
        else if(c1.getAnimal().equalsIgnoreCase("Turtle")) c1animalpic="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKe8jvUWW21giooUdIKw8IrMhk9rnBgA8EMe7D-jJ4XE8ofg1jw2bN8KkebqHPMqm3YM8&usqp=CAU";
        else if(c1.getAnimal().equalsIgnoreCase("Hyena"))  c1animalpic="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYPKoLTnamlVo9ZfXWq9RF69xxR2BoddYpPA&usqp=CAU";

        if(c2.getAnimal().equalsIgnoreCase("Lion"))c2animalpic="https://media.istockphoto.com/id/877369086/photo/lion-panthera-leo-10-years-old-isolated-on-white.jpg?s=612x612&w=0&k=20&c=J__Jx_BX_FN7iehO965TJtPFYUl0A-bwFgIYaK32R3Y=";
        else if(c2.getAnimal().equalsIgnoreCase("Turtle")) c2animalpic="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKe8jvUWW21giooUdIKw8IrMhk9rnBgA8EMe7D-jJ4XE8ofg1jw2bN8KkebqHPMqm3YM8&usqp=CAU";
        else if(c2.getAnimal().equalsIgnoreCase("Hyena"))  c2animalpic="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYPKoLTnamlVo9ZfXWq9RF69xxR2BoddYpPA&usqp=CAU";

        if(c3.getAnimal().equalsIgnoreCase("Lion"))c3animalpic="https://media.istockphoto.com/id/877369086/photo/lion-panthera-leo-10-years-old-isolated-on-white.jpg?s=612x612&w=0&k=20&c=J__Jx_BX_FN7iehO965TJtPFYUl0A-bwFgIYaK32R3Y=";
        else if(c3.getAnimal().equalsIgnoreCase("Turtle")) c3animalpic="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKe8jvUWW21giooUdIKw8IrMhk9rnBgA8EMe7D-jJ4XE8ofg1jw2bN8KkebqHPMqm3YM8&usqp=CAU";
        else if(c3.getAnimal().equalsIgnoreCase("Hyena"))  c3animalpic="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYPKoLTnamlVo9ZfXWq9RF69xxR2BoddYpPA&usqp=CAU";


        c1.setAttack(getAllAttacks(c1.getAnimal(),c1.getType()));
        c2.setAttack(getAllAttacks(c2.getAnimal(),c2.getType()));
        c3.setAttack(getAllAttacks(c3.getAnimal(),c3.getType()));

        c1.setHealth(BASIC_HEALTH);
        c2.setHealth(BASIC_HEALTH);
        c3.setHealth(BASIC_HEALTH);

    }

    public String startGame() {

        // real game begins

        p.setType(playertype);
        p.setAnimal(playerAnimal);

        String winner = "Computer";

        System.out.println("Player health is " + p.getHealth() + "C1 health is " + c1.getHealth() + "c2 health is "
                + c2.getHealth() + "C3 Health is " + c3.getHealth());

        // logic for player attacking each computer animal
        // let player choose attack
        // setupPlayerAnimalAndType();

        p.setAttack(getAllAttacks(p.getAnimal(), p.getType()));
        System.out.println("Player is using " + p.getAttack());
        comment = "Player is using " + p.getAttack();
        if (c1.getHealth() > 0)
            hit(p, c1);
        if (c2.getHealth() > 0)
            hit(p, c2);
        if (c3.getHealth() > 0)
            hit(p, c3);
        if (c1.getHealth() <= 0 && c2.getHealth() <= 0 && c3.getHealth() <= 0) {
            winner = "Player";
            comment = "Winner is " + winner;
            return winner;
            // break;

        }

        // finally handling turn to computer
        turn = "Computer";

        // computer attacks player
        if (c1.getHealth() > 0)
            hit(c1, p);
        if (c2.getHealth() > 0)
            hit(c2, p);
        if (c3.getHealth() > 0)
            hit(c3, p);

        if (p.getHealth() <= 0) {
            winner = "Computer";
            comment = "Winner is " + winner;
            return winner;// i will check in controller if winner has any value it means some one has won
                          // so game is over

            // break;
        }

        // finally handling turn to player
        // turn = "player";

        return "";
        // System.out.println("Winner is " + winner);

    }

    private void setupPlayerAnimalAndType() {

        // please dont leave this blank for avoiding unexpected errors.
        Scanner sc = new Scanner(System.in);
        System.out.println("player choose animal from lion turtle and hyena");
        p.setAnimal(sc.next());
        System.out.println("player choose Type from Leaf, Water, Fire");
        p.setType(sc.next());
        // sc.close();
    }

    private void hit(Participents attacker, Participents defender) {

        double damage = 1;
        // Turtle is does double damage on a hyena and half damage to a lion.
        damage = (attacker.getAnimal().equalsIgnoreCase("turtle") && defender.getAnimal().equalsIgnoreCase("hyena"))
                ? damage * 2
                : damage;
        damage = (attacker.getAnimal().equalsIgnoreCase("turtle") && defender.getAnimal().equalsIgnoreCase("lion"))
                ? damage / 2
                : damage;
        // Hyena does double damage on a lion and half damage to a turtle.
        damage = (attacker.getAnimal().equalsIgnoreCase("Hyena") && defender.getAnimal().equalsIgnoreCase("Lion"))
                ? damage * 2
                : damage;
        damage = (attacker.getAnimal().equalsIgnoreCase("Hyena") && defender.getAnimal().equalsIgnoreCase("turtle"))
                ? damage / 2
                : damage;
        // Lion does double damage to a turtle and half damage to a hyena.
        damage = (attacker.getAnimal().equalsIgnoreCase("Lion") && defender.getAnimal().equalsIgnoreCase("turtle"))
                ? damage * 2
                : damage;
        damage = (attacker.getAnimal().equalsIgnoreCase("Lion") && defender.getAnimal().equalsIgnoreCase("Hyena"))
                ? damage / 2
                : damage;
        // Fire does double damage on a leaf type and half damage to a water type.
        damage = (attacker.getType().equalsIgnoreCase("Fire") && defender.getType().equalsIgnoreCase("Leaf"))
                ? damage * 2
                : damage;
        damage = (attacker.getType().equalsIgnoreCase("Fire") && defender.getType().equalsIgnoreCase("water"))
                ? damage / 2
                : damage;
        // Water does double damage on a fire type and half damage to a leaf type.
        damage = (attacker.getType().equalsIgnoreCase("Water") && defender.getType().equalsIgnoreCase("Fire"))
                ? damage * 2
                : damage;
        damage = (attacker.getType().equalsIgnoreCase("Water") && defender.getType().equalsIgnoreCase("Leaf"))
                ? damage / 2
                : damage;
        // o Leaf does double damage on a water type and half damage to a fire type.
        damage = (attacker.getType().equalsIgnoreCase("Leaf") && defender.getType().equalsIgnoreCase("Water"))
                ? damage * 2
                : damage;
        damage = (attacker.getType().equalsIgnoreCase("Leaf") && defender.getType().equalsIgnoreCase("Fire"))
                ? damage / 2
                : damage;
        if (damage - Math.floor(damage) < 5)
            damage = Math.floor(damage);
        double oldhealth = defender.getHealth();
        defender.setHealth(oldhealth - damage);

    }

    public String getAllAttacks(String animalName, String type) {
        Animal animal;
        List<String> attack = new ArrayList<String>();// making it as a list because in future each combination of
                                                      // animal and type can have more than one attack
        AnimalFactory animalFactory = new AnimalFactory();
        animal = animalFactory.makeAnimal(animalName);
        AnimalType animalType;
        TypeFactory typeFactory = new TypeFactory();
        animalType = typeFactory.makeType(type);
        attack.add(Attack.getattack(animal.getName(), animalType.getType()));
        System.out.println(attack.get(0));
        return attack.get(0);
    }
}
