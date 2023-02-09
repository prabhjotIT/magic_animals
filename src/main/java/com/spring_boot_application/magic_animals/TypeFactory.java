package com.spring_boot_application.magic_animals;

public class TypeFactory extends TypeBuilding {
    
    public AnimalType makeType(String type){
        if("Water".equalsIgnoreCase(type))
        {
            return new Water();
        }
        else if("Fire".equalsIgnoreCase(type))
        {
            return new Fire();
        }
        else
        {
            return new Leaf();
        }
    }

}
