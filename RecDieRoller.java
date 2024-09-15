import java.util.Random; 
/**
 * Megan Cole
 * CS 215 - Assignment 3.1 Recursive Dice
 * The class RecDieRoller randomly selects a number on a dice.
 * The process will continue recursively until a 2 is rolled.
 */
public class RecDieRoller {
	
	private Random random;
	
	/**
	 * initialize the random object to roll the dice.
	 */
	public RecDieRoller( ){
		random = new Random();
	} //end constructor 
	
	/**
	 * Method roll randomly selects a number from the dice and prints out the number.
	 * The method will stop and return 1 if a 2 is selected.
	 * If a 2 is not selected, it will continue to roll and add one to the count.
	 * @return the number of rolls it will take to get a 2
	 */
	public int roll() {
		//Generate a random roll between 1-6
		int diceRoll = random.nextInt(6) + 1; 
		//print the current roll
		System.out.println("You rolled: " + diceRoll); 
		//return 1 if 2 is rolled
		if (diceRoll == 2) {
			return 1;  
		} else {
			//add one to the count and call roll again because we did not get 2 
			return 1 + roll(); 
		} //end if else
	} //end roll
	
} //end RecDieRoller
