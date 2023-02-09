package com.spring_boot_application.magic_animals;

public abstract class Animal {

    private String name;
    private int animalHealth;
    private String animalphoto;



    // protected AnimalType animalType;
    // Animal(AnimalType animalType){
    //     this.animalType=animalType;
    // }



    public String getAnimalphoto() {
        return animalphoto;
    }

    public void setAnimalphoto(String animalphoto) {
        this.animalphoto = animalphoto;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalHealth() {
        return this.animalHealth;
    }

    public void setAnimalHealth(int animalHealth) {
        this.animalHealth = animalHealth;
    }


}
