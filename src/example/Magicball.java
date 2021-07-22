package example;

import java.util.Random;
import java.util.Scanner;

public class Magicball {

	public static void main(String[] args) {
		question();
		getallen();
		
	}

	public static void question() {
		// TODO Auto-generated method stub
		System.out.print("Enter your question: ");

		Scanner scan = new Scanner(System.in);
		String question = scan.next();

		Random response = new Random();
		int r = response.nextInt(4); // 0,1,2,3

		if (r == 0) {
			System.out.println("As i see it,yes.");
		} else if (r == 1) {
			System.out.println("Signs point to yes.");
		} else if (r == 2) {
			System.out.println("Don't count on it.");
		} else if (r == 3) {
			System.out.println("Better luck next time.");
		}

	}

	public static void getallen() {

		System.out.println("Vul een getal in tussen 0 en 5: ");

		Scanner scan = new Scanner(System.in);

		int antwoord = scan.nextInt();

		if (antwoord == 0 || antwoord == 1 || antwoord == 2 || antwoord == 3 || antwoord == 4 || antwoord == 5) {

			System.out.println("Je antwoord is waar");
		} else {
			System.err.println("Je antwoord is niet waar");
		}

	}
}
