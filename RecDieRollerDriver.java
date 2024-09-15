/**
 * Megan Cole
 * CS 215 - Assignment 3.1 Recursive Dice
 * The class RecDieRollerDriver simulates a dice being rolled 1000 times.
 * It counts how many 2's appear and calculates the mean rolls it takes to get a 2
 * 
 */
public class RecDieRollerDriver {

	/**
	 * initiate the variable for how many rolls we have completed and the amount of times to roll the dice
	 * Roll the dice
	 * Find the average number of rolls it takes to get 2 for 1000 rolls
	 * @param args
	 */
	public static void main(String[] args) {
		RecDieRoller roller = new RecDieRoller();
		int totalRolls; //amount of times the dice has been rolled
		int time; //number of times we will roll the dice
		
		//initiate variables
		totalRolls = 0; //Start with 0 rolls
		time = 1000; //roll the dice 1000 times
		
		for (int i =0; i < time; i++) {
			totalRolls += roller.roll(); //add the number of rolls for each time  
		} //end for loop
		
		//Calculate the mean number of rolls to get 2
		double meanRolls = (double) totalRolls/time; 
		System.out.println("The mean number of rolls to get a 2 is: " + meanRolls);

	} //end main

} //end RecDieRollerDriver
