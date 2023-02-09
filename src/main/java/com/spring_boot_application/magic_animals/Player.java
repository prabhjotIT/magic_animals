package com.spring_boot_application.magic_animals;

 class Player implements Participents {

   private static Player player_Instance;
   String name="God";
   long score=0;
   String attack;
   double health;
   String animal;
   String type;
   
   private Player(String name,int score) {
      this.name=name;
      this.score=score;
   }

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

   public double getHealth() {
      return health;
   }

   public void setHealth(double health) {
      this.health = health;
   }

   public void setAttack(String attack) {
      this.attack = attack;
   }

   public String getAttack() {
      return attack;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public long getScore() {
      return score;
   }

   public void setScore(long score) {
      this.score = score;
   }

   public static Player getInstance(String name, int score)
   {
       if (player_Instance == null)
       player_Instance = new Player(name,score);
 
       return player_Instance;
   }
}
