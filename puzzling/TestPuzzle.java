import java.util.ArrayList; 

public class TestPuzzle {
    public static void main(String[] args) {

        // 
        ArrayList <String> people = new ArrayList<String>();
        people.add("1");
        people.add("2");
        people.add("3"); 
        people.add("4"); 

       //CLASS DECLARATION
        PuzzleJava appTest = new PuzzleJava();
    
        //
        System.out.println(appTest.getTenRolls());

        //TESTING: RANDOM LETTER 
        System.out.println(appTest.getRandomLetter());

        //TESTING: Generate Password 
        System.out.println(appTest.generatePassword());

        //TESTING: Generate Password 
        System.out.println(appTest.getNewPasswordSet(8));

        //TESTING: Shuffle Array
        System.out.println(appTest.shuffleArray(people));


    }
}