package com.bludots;
import sr.bludots.memory.Atleet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



import sr.bludots.memory.Atleet.Sport;


public class Assignment1a {

	public static void main(String[] args) {
		/*Assignment 1: 
		 * 			- Maak een lijst van 50 atleten
		 * 			- Vul ze steeds met andere sporten, dus bijv een aantal boksers, 
		 * 			  voetballers etc etc
		 * 			- Maak deze ook aan met een variabel geboortejaar (tussen 1990-2005))
		 */
				
		Random random = new Random();	//Maak een Random object aan
		int random_sport_index = 0;		//Als index gebruiken om een random sport uit te kiezen vb Sport.values()[2]
		int random_jaar = 1990;			// Random jaar, maand en dag om een dandom geb. dat. te genereren
		int random_month = 01;
		int random_day = 01;
		
		// list array om alle waarden op te slaan
		Atleet [] atleten = new Atleet[50]; 
		
		//String[] atleten1 = new String[50];	 // Dit geeft me errors. Waarom mag ik dit niet gebruiken?
		//ArrayList<String> atleten2 = new ArrayList<String>();//Dit gaf me ook een error
		//ArrayList<Object> atleten3 = new ArrayList<Object>();//Gelezen op Google dat dit kon helpen. Maar kreeg hiermee ook errors
		
		for(int i=0 ; i < atleten.length ; i++) {
			random_sport_index = random.nextInt(6);
		    random_jaar  = random.nextInt(2005-1990) + 1990;
			random_month = random.nextInt(11) +1;
			random_day   = random.nextInt(28) +1;
			atleten[i]  = new Atleet("Jair", "Tjon en Fa"+i, Sport.values()[random_sport_index], LocalDate.of(random_jaar,random_month, random_day));
			//atleten3.add(new Atleet("Jair", "Tjon en Fa"+i, Sport.values()[random_sport_index], LocalDate.of(random_jaar,random_month, random_day));

		}
		 
		
		System.out.println("Onderstaand mensen die kunnen zwemmen");
		for(int i=0 ; i < atleten.length ; i++) {
			if(atleten[i].getSport().equals(Sport.ZWEMMEN)) {
				System.out.println(atleten[i].getVoornaam() + " " +atleten[i].getAchternaam());
				}
			}
		
		
		System.out.println("Onderstaand mensen die Jair heten en kunnen zwemmen");
		for(int i=0 ; i < atleten.length ; i++) {
			if(atleten[i].getSport().equals(Sport.ZWEMMEN)) {
				if(atleten[i].getVoornaam().equals("Jair")) {
					System.out.println(atleten[i].getVoornaam() + " " +atleten[i].getAchternaam());	
					}
				}
			}
		
		
		System.out.println("Onderstaand mensen die ouder zijn dan 20 jaar");
		for(int i=0 ; i < atleten.length ; i++) {
			if(atleten[i].getAge() > 20 ) {
					System.out.println(atleten[i].getVoornaam() + " " +atleten[i].getAchternaam());	
				}
			}
		}
			
		{
	}

}

