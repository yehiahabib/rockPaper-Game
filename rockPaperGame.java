import java.util.Random;
import java.util.Scanner;

public class rockPaperGame {

  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in); 	// enables the program to get user input
    System.out.println("Enter 0,1 or 2:"); 	// gives instructions to the user
    
	int userInput = input.nextInt(); 	// gets the input
    
	input.close(); // closes the input command
    
	
	// creation of a random integer between 0 and 3
    Random rand = new Random();
    int computerRandom = rand.nextInt(3);
    
	String userSelection = numberToName(userInput); // converting the user input number to string (rock-paper-scissors)
    
	String computerSelection = numberToName(computerRandom); // converting the random input number to string (rock-paper-scissors)
    
	String gameResult = ". "; // adding the full stop at the end of the sentence
    if (userInput - computerRandom == 2 || computerRandom - userInput == 1) // specifying the cases where user loses
      gameResult = gameResult + "You lose.";
    else if (userInput == computerRandom)  // specifying the cases where it's a draw
      gameResult = " too" + gameResult + "It's a draw.";
    else // as the user will be winning in the remaining cases, You Win will be printed
      gameResult = gameResult + "You win.";
    
	System.out.println(
        "The computer is " + computerSelection + ". You are " + userSelection + gameResult); // result is printed
  }

  // method to convert input numbers to string
  public static String numberToName(int number) {
	  
    String result = ""; // introducing a string
	
    // returning different results for different cases
    if (number == 0)
      result = "rock";
    else if (number == 1)
      result = "paper";
    else if (number == 2)
      result = "scissors";
    return result; // returns the result to main
  }

}
