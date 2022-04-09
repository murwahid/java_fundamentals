public class BatTest {
    public static void main(String[] args) {
        Bat alfred = new Bat();
        alfred.setEnergy();
        // alfred.confirmWorking();
        // alfred.curiousity();
        // alfred.getEnergyLevel();
        
        //3 towns 
        alfred.getEnergyLevel();
         alfred.attackTown();
         alfred.getEnergyLevel();
         alfred.attackTown();
         alfred.getEnergyLevel();
         alfred.attackTown();
        alfred.getEnergyLevel();
        //2 humans 
        alfred.eatHumans();
        alfred.eatHumans();
        alfred.getEnergyLevel();
        //2 flights 
        alfred.fly();
        alfred.fly();
        alfred.getEnergyLevel();

    }
}