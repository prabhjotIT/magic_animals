package com.spring_boot_application.magic_animals;

public abstract class TypeBuilding {

    protected abstract AnimalType makeType(String typeOfAnimeal);
    public AnimalType orderTheType(String type)
    {
        AnimalType animaltype = makeType(type);
        return animaltype;
    }
    
}
