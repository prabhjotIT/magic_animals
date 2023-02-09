package com.spring_boot_application.magic_animals;

public abstract class AnimalBuilding {

    protected abstract Animal makeAnimal(String typeOfAnimeal);

    public Animal orderTheAnimal(String typeOfAnimeal)
    {
        Animal theAnimal = makeAnimal(typeOfAnimeal);
        return theAnimal;
    }
    
}
