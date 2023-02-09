package com.spring_boot_application.magic_animals;

public class AnimalFactory extends AnimalBuilding {

    @Override
    public Animal makeAnimal(String animal) {
        if("Turtle".equalsIgnoreCase(animal))
        {
            return new Turtle();
        }
        else if("Lion".equalsIgnoreCase(animal))
        {
            return new Lion();
        }
        else
        {
            return new Hyena();
        }

    }
    
}
