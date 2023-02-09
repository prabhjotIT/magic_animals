package com.spring_boot_application.magic_animals;

public  class Attack {
      public static String getattack(String name, String type) {
        if(name.equalsIgnoreCase("Turtle"))
        {
            if(type.equalsIgnoreCase("Fire"))
            {
                return "Fire snap";
            }
            else if(type.equalsIgnoreCase("Water"))
            {
                return "Quick splash";
            }
            else
            {
                return "Seed shell";
            }
        }
        else if(name.equalsIgnoreCase("Lion"))
        {
            if(type.equalsIgnoreCase("Fire"))
            {
                return "Lava roar";
            }
            else if(type.equalsIgnoreCase("Water"))
            {
                return "Sea mane";
            }
            else
            {
                return "Root claw";
            }
        }
        else
        {
            if(type.equalsIgnoreCase("Fire"))
            {
                return "Spicy Laugh";
            }
            else if(type.equalsIgnoreCase("Water"))
            {
                return "Water shake";
            }
            else
            {
                return "Bark bark";
            }
        }
        
    }
}
