package vhishal;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// opdracht1('*', 7);
		// opdracht2(5, 10);
		// vervolgdOpdracht2(2,4);
		// nummer n voor welke geprint moet worden

//		System.out.println("Tafel van 1 tot 10 ");
//
//		int j;
//
//		for (int i = 1; i <= 10; i++) {
//			for (j = 1; j <= 10; j++)
//				System.out.println(i + "*" + j + "=" + (i * j));
//		}

		// nummer n voor welke geprint moet worden int N = 1;
		int N = 1;
		int range = 10;

		int i = 1;

		// while loop
		while (i <= range) {
			System.out.println(N + "*" + i + "=" + N * i);

			i++;

		}

	}

	public static void opdracht1(char character, int getalwaarde) {
		/*
		 * Schrijf een methode die 2 parameters neemt de eerste een char en de tweede
		 * een int. De methode geeft een string terug van de opgegeven char keer de
		 * opgegeven int. Enkele input en ouput voorbeelden: input (*, 7) output =
		 * *******
		 */

		for (int i = 0; i < getalwaarde; i++) {
			System.out.print(character);
		}

	}

	public static void opdracht2(int aantalGetallen, int maxGetal) {
		/*
		 * Schrijf een methode die een gesorteerde ArrayList terug geeft van unieke
		 * Integers (gebruik hierbij de ingebouwde Random methode van Java). Aan deze
		 * methode geef je 2 parameters namelijk de grootte van je ArrayList en het
		 * hoogste int dat door Random gebruikt mag worden. Je input is bijvoorbeeld (5,
		 * 10) en je output kan er zo uit zien [0, 2, 4, 5, 7] Schrijf hierna een andere
		 * methode (die gebruik maakt van loops of recursie) die een specifieke int
		 * zoekt in een ArrayList van integers geeft hierbij de index terug als de
		 * integer wordt gevonden, anders geeft de methode -1 terug. De methode neemt 2
		 * parameters, de eerste is een ArrayList van integers (gebruik de lijst die je
		 * bij je eerste methode hebt gegenereerd) en de 2de is een (Random) int die je
		 * in je ArrayList wilt zoeken. Als het mogelijk/handig is mag je ook meer dan 2
		 * parameters meesturen. Enkele input en ouput voorbeelden: input ([0, 2, 4, 5,
		 * 7], 10) output = -1 input ([0, 2, 4, 5, 7], 7) output = 5 input ([0, 2, 4, 5,
		 * 7], 0) output = 0 --feedback
		 * 
		 * unieke integers eerst in een set zetten met een return waarde, method 3 int =
		 * -1 for loop
		 * 
		 * 
		 */
		ArrayList<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < aantalGetallen; i++) {
			Random random = new Random();
			int pcRandom = random.nextInt(maxGetal);

			numberList.add(pcRandom);
		}
		System.out.print(numberList);

	}

	public static void vervolgdOpdracht2(int aList, int randomGetal) {
		ArrayList<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < aList; i++) {
			Random random = new Random();
			int a = random.nextInt(randomGetal);
			int b = random.nextInt(1);
			if (numberList.contains(a)) {
				i--;
			} else {
				numberList.add(a);

			}
		}
	}
	// System.out.print();

	public static void Dencio() {
		// nummer n voor welke geprint moet worden
		int N = 1;

		int range = 10;

		int i = 1;

		// while loop
		while (i <= range) {
			// print N*i
			System.out.println(N + "*" + i + "=" + N * i);

			i++;

		}

	}
}
