package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// random create the winning lottery numbers
		// use 6 numbers from 1 to 32
		// numbers has to be different form each other
		List<Integer> winningNumbers = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			while (true) { // will loop inf
				int winningNumber = random.nextInt(32) + 1;// generates a new number
				if (!winningNumbers.contains(winningNumber)) {
					winningNumbers.add(winningNumber); // adding number in the list
					break;
				}
			}
		}
		//System.err.println("The Winning Numbers: " + winningNumbers);
		//System.err.println(winningNumbers);
		System.out.println(" ");
		System.out.println("Please enter your 6 numbers between 1 and 32: ");

		Scanner scanner = new Scanner(System.in);

		List<Integer> guessedNumbers = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			System.out.println("Your current numbers are " + guessedNumbers);
			System.out.println("Please enter a number");
			while (true) {
				try {
					String numberString = scanner.nextLine();
					int number = Integer.parseInt(numberString); // takes string u place into an Int
					if (number >= 1 && number <= 32) { // choose number between 1 to 32
						guessedNumbers.add(number); // can enter any number
						break;
					}

					// if the number is not between 1-32 (message)
					else {
						System.out.println(number + " is not between 1 to 32 ");
						System.err.println(" ** Please try again ! **");
						// System.err.println("Are you the lucky one! Call the Company number");
					}
				}

				 catch (NumberFormatException nfe) {
					System.out.println("That is not a number. Please try again");
				}
			
		}
	}
		System.out.println("The winning numbers: " + winningNumbers);
		System.out.println("Your numbers are: " + guessedNumbers);
		
		guessedNumbers.retainAll(winningNumbers);
		System.out.println("Your matched numbers are: "  + guessedNumbers);
		
		if (guessedNumbers.containsAll(winningNumbers)) {
			System.err.println("Congratualtion! You won $1200!");
		}
		else {
			System.out.println("Sorry you lost. Better luck next time!");
		}
		scanner.close();
}
}