package com.assignments;

import java.time.Duration;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//import com.assignment.OlympicAtleten;
import com.assignments.OlympicAtleten.Sport;

public class Olympic {
	/*
	 * Assignment:
	 * 
	 * 1) Zorg ervoor dat de geboortedatum willekeurig is tussen 2 data bijv atleten
	 * moeten geboren zijn tussen 1990 - 2003
	 * 
	 * 2) Zoek naar alle individuele sporters
	 * 
	 * 3) Druk af hoeveel teamsporters er in de lijst zitten
	 * 
	 * 4) Druk af hoeveel sporters er zijn die jarig zijn in Maart
	 *
	 * 5) Druk af hoeveel sporters er zijn die geboren zijn in 2000-2002
	 * 
	 * 6) Druk de geboortedatum af in de Europese notatie 1 January 2002 (en niet de
	 * Amerikaanse 2002-01-01)
	 */

	public static ArrayList<OlympicAtleten> atletenList = new ArrayList<>();

	// zoek naar alle atleten die zwemmen en druk deze dan af
	public static void search(Sport searchSportType) {
		search("", searchSportType);
	}

	// zoek naar alle atleten die jair heten en zwemmen en druk deze dan af. Als
	// firstName null is (negeer deze)
	public static void search(String firstName, Sport searchSportType) {

		for (int i = 0; i < atletenList.size(); i++) {
			OlympicAtleten atleet = atletenList.get(i);
			if (atleet.getSport().equals(searchSportType)) {
				String voornaam = atleet.getvoornaam();
				if (firstName.equals("") || firstName.equals(voornaam)) {
					atleet.vertoonAtleet();
				}
			}
		}

	}

	public static void main(String args[]) {

		fillAtletenArray();

		// zoek naar alle atleten die zwemmen en druk deze dan af
		// search(Sport.ZWEMMEN);
		// of
		// search("", Sport.ZWEMMEN);

		// zoek naar alle atleten die jair heten en zwemmen en druk deze dan af
		// search("Jair", Sport.ZWEMMEN);

		//toonsporters(true);

		// * 2) Zoek naar alle individuele sporters
		//toonindividueleSpelers(atletenList);

		// * 3) Druk af hoeveel teamsporters er in de lijst zitten

		// * 4) Druk af hoeveel sporters er zijn die jarig zijn in Maart
		sportmenBornInMarch (atletenList);
		
		// * 5) Druk af hoeveel sporters er zijn die geboren zijn in 2000-2002
		//sportersTussen2000En2002(atletenList);

		//* 6) Druk de geboortedatum af in de Europese notatie 1 January 2002 (en niet de
		//* Amerikaanse 2002-01-01)
	}

	public static void fillAtletenArray() {
		int startdag = (int) LocalDate.of(1990, 1, 1).toEpochDay();
		int einddag = (int) LocalDate.of(2005, 12, 31).toEpochDay();

		for (int i = 0; i < 50; i++) {
			Random random = new Random();

			String[] voornamen = { "Jair", "Sherona", "Kenz", "Rose", "Renzo" };
			int chooseVoornaam = random.nextInt(voornamen.length);

			String[] achternamen = { "Tjon en Fa", "Van Brussel", "Kartoebi", "Douglas", "West" };
			int chooseAchternaam = random.nextInt(achternamen.length);

			int chooseSport = random.nextInt(Sport.values().length);

//			LocalDate[] geboorteDatum = { LocalDate.of(1999, 9, 1), LocalDate.of(2006, 9, 1), LocalDate.of(2004, 9, 1),
//					LocalDate.of(2003, 9, 1), LocalDate.of(2004, 9, 1) };
			long randomDay = startdag + random.nextInt(einddag - startdag); 
			LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

			//int choosegeboorteDatum = random.nextInt(geboorteDatum.length);

			// opdracht 1) Zorg ervoor dat de geboortedatum willekeurig is tussen 2 data
			// bijv atleten
			// moeten geboren zijn tussen 1990 - 2003
			LocalDate startDatum = LocalDate.of(1990, 1, 1);
			LocalDate endDatum = LocalDate.of(2003, 12, 31);

			Duration duration = Duration.between(startDatum.atStartOfDay(), endDatum.atStartOfDay());
			int difference_Date = (int) duration.toDays();
			int rand_dag = random.nextInt(difference_Date);
			LocalDate birthdate = startDatum.plusDays(difference_Date);

			//OlympicAtleten atleet = new OlympicAtleten(voornamen[chooseVoornaam], achternamen[chooseAchternaam],
			//		birthdate, Sport.values()[chooseSport]);
			OlympicAtleten atleet = new OlympicAtleten(voornamen[chooseVoornaam], achternamen[chooseAchternaam], 
					randomBirthDate, Sport.values()[chooseSport]);

			atletenList.add(atleet);

		}

	}

	// Opdracht 1.
	// * 1) Zorg ervoor dat de geboortedatum willekeurig is tussen 2 data bijv
	// atleten
	// * moeten geboren zijn tussen 1990 - 2003
	public static void toonsporters(boolean zoekIndividueel) {
//				 int jaar1 = 1990;
//				 int jaar2 = 2003;
//				 String title = (jaar1>=1990) ? "Sporter:" "Volwassen";
//				String title = (jaar2 <= 2003) ? "Kind": jaar > 60?"Senior":"volwassen";
		String title = zoekIndividueel ? "Individuele sporters" : "Teamsporters";
		System.out.println(title);
		for (int i = 0; i < atletenList.size(); i++) {
			Sport sport = atletenList.get(i).getSport();
			boolean sportIndividueel = sport.isIndividueel();
			if (zoekIndividueel == sportIndividueel) {
				// atleet.vertoonAtleet();
				System.out
						.println(" Naam:" + atletenList.get(i).getvoornaam() + " " + atletenList.get(i).getachternaam()
								+ " " + atletenList.get(i).getgeboortedatum() + " " + "Sport" + " " + sport.toString());
			}
		}

	}

	public static void toonindividueleSpelers(ArrayList<OlympicAtleten> sporters) {
		System.out.println("Individuele sporters zijn:");
		for (OlympicAtleten atleet : sporters) {
			if (atleet.getSport().isIndividueel()) {
				System.out.println("Name: " + atleet.getvoornaam() + " " + atleet.getachternaam() + " Sport: "
						+ atleet.getSport().toString());
			}
		}
	}
	
	// * 4) Druk af hoeveel sporters er zijn die jarig zijn in Maart
	public static void sportmenBornInMarch(ArrayList<OlympicAtleten> atletenList) {
		int marchBornPlayers = 0;
		for (OlympicAtleten atleet: atletenList) {
			if (atleet.getgeboortedatum().getMonth().equals(Month.MARCH)) {
				marchBornPlayers++;
			}
			System.out.println("Aantal spelers geboren in maart: " + marchBornPlayers);
		}
	}
	 
	
	
	
	// * 5) Druk af hoeveel sporters er zijn die geboren zijn in 2000-2002
	public static void sportersTussen2000En2002(ArrayList<OlympicAtleten> sporters) {
		int aantalSporters = 0;	
		for (OlympicAtleten atleet : sporters) {
			if (atleet.getgeboortedatum().getYear() >= 2000 && atleet.getgeboortedatum().getYear() <= 2002) {
				aantalSporters++;
				
			}
			System.out.println("Sporters geboren tussen 2000 en 2002: " + aantalSporters);

		}
	}
	// * 6) Druk de geboortedatum af in de Europese notatie 1 January 2002 (en niet de
	// * Amerikaanse 2002-01-01)
}
