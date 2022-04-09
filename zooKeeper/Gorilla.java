public class Gorilla extends Mammal {
    //====METHODS=====
    //throw something
    public void throwSomething() {
        System.out.println("Throwing Something."); 
        this.energyLevel -= 5;
    }
    //throw something
    public void eatBananas() {
        System.out.println("Eating Bananas!MMM"); 
        this.energyLevel += 10;
    }
    //throw something
    public void climb() {
        System.out.println("Climbing"); 
        this.energyLevel -=10;
    }
}