public class Bat extends Mammal {
    //energy level 
    //setter => 
   public void setEnergy() {
       super.energyLevel = 300; 
   }

    //METHODS ====

    //fly
    public void fly() {
        System.out.println("Swoosh! Flying away.");
        this.energyLevel -= 50;
    }
    //eatHumans 
    public void eatHumans() {
        System.out.println("Mhm Tasty Humans!");
        this.energyLevel += 25;
    }

    //attackTown 
    public void attackTown() {
        System.out.println("Town's on fire! Crackling.");
        this.energyLevel -=100;
    }

    public void curiousity() {
        System.out.println("Why Bats, Master Wayne? -Alfred");
        System.out.println("Bats frighten me, it's time my enemies share my dread.-Bruce"); 
    }

}