public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String displayNumberOfDrinksOrdered = " You ordered this # of drinks:";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.0; 
        double lattePrice = 6.0;
        double cappuccinoPrice = 3.6;

        //Number of drinks ordered 
        int numberOfDrinks = 10;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam"; 
        String customer3 = "Jimmy"; 
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder4 == true ) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        };

        //customer interaction: Sam
        /*
        Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        */
        if (isReadyOrder2 == true)  {
            double totalPrice =  numberOfDrinks * lattePrice;
            System.out.println(customer2 + readyMessage);
            System.out.println(customer2 + displayNumberOfDrinksOrdered + numberOfDrinks);
            System.out.println(displayTotalMessage + (totalPrice));
            isReadyOrder2 = false;
        };
        //customer interaction: Jimmy 
        System.out.println(customer3 + " " +displayTotalMessage + (lattePrice-dripCoffeePrice));
        //
    }
}
