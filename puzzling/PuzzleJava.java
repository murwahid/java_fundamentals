import java.util.Random;
import java.util.ArrayList;
import java.util.*;

//How to declare a class
public class PuzzleJava { 

//properly declaring a function 
//typecasting for a function 
//Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
public ArrayList<Integer> getTenRolls() {
    //Create a new array. 
   ArrayList<Integer> diceRolls = new ArrayList<Integer>();
   //generate random numbers => first call the class. 
   Random randMachine = new Random(); 
    //second => use the nextInt method from random 
    //add to the array => 
    //inside of a loop 
    for(int i = 0; i <10; i++) {
        int randNumber = randMachine.nextInt(20); 
        diceRolls.add(randNumber);
    }
    return diceRolls;
} 
// //Write a method that will:Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). Generate a random index between 0-25, and use it to pull a random letter out of the array. Return the random letter.
public String getRandomLetter() {
    //create a fixed array for alphabet
    Random randMachine = new Random(); 
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n","o","p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    int randomNumber = randMachine.nextInt(25); 

    String randomLetter = alphabet[randomNumber];

    return randomLetter;
}

// //Write a method that uses the previous method to create a random string of eight characters, and return that string.
public String generatePassword() {
    String password = "";
    for (int i = 0; i<9; i++) {
       password += getRandomLetter();
    }
    return password;
} 


// //Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
public ArrayList<String> getNewPasswordSet(int length) {

    ArrayList <String> newPassword = new ArrayList<String>(); 
    for(int i = 0; i <length; i++) {
        newPassword.add(generatePassword());
    }
    return newPassword;
}



// //Write a method that takes an array and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly. 
public ArrayList <ArrayList> shuffleArray(ArrayList array) {
    //the array has indicies.
    // Random randMachine = new Random(); 
    // int randNumber = randMachine.nextInt(6); 
    // //NEW ARRAY CREATED FOR HOLDING MIXED VARIABLES. 
    // ArrayList<ArrayList> mixedArray = new ArrayList<ArrayList>();
    System.out.println("Before shuffle" + array); 
    Collections.shuffle(array); 

    return array; 
    // System.out.println("Original List : \n" + mylist);
 
        // Collections.shuffle(mylist);
 
        // System.out.println("\nShuffled List : \n" + mylist);
    
}
}

