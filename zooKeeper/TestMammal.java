public class TestMammal {
    public static void main(String[] args) {
        // Mammal gorilla = new Mammal(); 
        // int energyLevel = gorilla.getEnergyLevel();

        //Creating new class instance
        Gorilla mustafa = new Gorilla(); 
        //Testing 
         //===
        mustafa.getEnergyLevel();
        mustafa.throwSomething();
        mustafa.throwSomething();
        mustafa.throwSomething();
        mustafa.getEnergyLevel();
        //===
        mustafa.eatBananas();
        mustafa.eatBananas();
        mustafa.getEnergyLevel();
        //===
        mustafa.climb();
        mustafa.getEnergyLevel();
    }
}