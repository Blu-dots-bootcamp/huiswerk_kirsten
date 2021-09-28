package com.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import com.assignment.OlympicAtleten.Sport;

public class App {

	public static ArrayList<OlympicAtleten> atletenList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toonsporters(true);
		/*
		 * * Wat verwachten wij van u? - gebruik overall for loops zonder int i = 0;
		 * i<x; i++, gebruik nieuwe constructies 
		 * - gebruik LocalDateTime formatter 
		 * -
		 * minimaliseer het aantal regels code (geen duplicaat code) 
		 * - gebruik logische
		 * functie namen - probeer in 1 functie dingen te combineren, dus als je een
		 * functie A en B die ongeveer hetzelfde doen, kun je dan een functie C maken -
		 * probeer logische taken te isoleren in aparte functie - probeer waar mogelijk
		 * a?b:c - probeer zoveel constanten/enumeraties te gebruiken dus liever
		 * Month.MARCH dan 3 of liever VOLWASSSEN dan 18
		 */
	}

	// Opdracht 1.
	public static void toonsporters(boolean zoekIndividueel) {
		String title = zoekIndividueel ? "Individuele sporters" : "Teamsporters";
		System.out.println(title);
		for (int i = 0 ; i <  atletenList.size(); i++) {
			Sport sport = atletenList.get(i).getSport();
			boolean sportIndividueel = sport.isIndividueel();
			if (zoekIndividueel == sportIndividueel) {
				//atleet.vertoonAtleet();
				System.out.println("Naam:" + atletenList.get(i).getvoornaam()
						+""+ atletenList.get(i).getachternaam() +
						"Sport" + sport.toString());
			}
			
		}
		
	}
	
}
