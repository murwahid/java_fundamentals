import java.util.ArrayList;
public class CafeUtil {
    //getStreakGoal
    //write a method that sums together every consecutive integer from 1 to 10 and returns the sum
    public int getStreakGoal() {
       System.out.println("System Streak");
       int sum = 0; 
       for(int i = 0; i <11; i++){
           sum += i;
       };
       return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0; 
        for(int i=0;i<prices.length;i++){
            // System.out.println(i);
            System.out.println(prices[i]);
            total += prices[i];
        }
        return total;
    } 

    public void displayMenu(ArrayList<String> menuItems) {
        System.out.println("This works menu.");
        for (int i = 0; i <menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s !",userName);
    }
}