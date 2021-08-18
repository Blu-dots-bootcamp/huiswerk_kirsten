package com.bludots;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Atleet {
	//Assignment 1: Maak een lijst van 50 atleten.
	//Vul ze steeds met andere sporten, dus bijv een aantal boksers, voetballers etc ec
	//Maak deze ook aan met een variabel geboortejaar (tussen 1990-2005))

	//- zoek naar alle atleten die zwemmen en druk deze dan af
	//- zoek naar alle atleten die jair heten en zwemmen en druk deze dan af
	//vul de 
	//(*) zoek naar alle atleten die jonger zijn dan 20 jaar 
	public enum Sport {TRACKCYCLING, ZWEMMEN, TAEKWONDO, ARCHERY, BOKSEN };
	
	private String voorNaam;
	private String achterNaam;
	private LocalDate geboorteDatum;
	private Sport sports;
	
	/*
	 * Atleet constructor: Create a new atleet, .
	 */
	public Atleet (String voorNaam, String achterNaam, LocalDate geboorteDatum, Sport sports ) {
		super();
		this.voorNaam = voorNaam;
		this.achterNaam = achterNaam;
		this.geboorteDatum = geboorteDatum;
		this.sports = sports;
	}
	public String getvoorNaam() {
		return voorNaam;
	}
	public void setvoorNaam(String voornaam) {
		this.voorNaam = voorNaam;
	}
	public String getachterNaam() {
		return achterNaam;
	}
	public void setachterNaam(String achternaam) {
		this.achterNaam = achterNaam;
	}
	public LocalDate getgeboorteDatum() {
		return geboorteDatum;
	}
	public void setgeboorteDatum(LocalDate geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
	public Sport sports() {
		return sports;
	}
	public void setSports() {
		this.sports = sports;
	}
	
	//age calculatie bepalen
	public int getAge() {
	    LocalDate current = LocalDate.now();

	    LocalDate years = current.minusYears(geboorteDatum.getYear());

	    return years.getYear();
	}
	//opzoeken vn atleten uit de lijst die zwemmen
	public static void main(String[] arg) {
		Atleet atleet1 = new Atleet("Jair", "Tjon en Fa", LocalDate.of(1994, 4, 1), Sport.ZWEMMEN);
		System.out.println("Atleet " + atleet1.getachterNaam() + " Leeftijd: " + atleet1.getAge());
		
		ArrayList<Atleet> atleten = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			

			Random random = new Random();

			
			
		}
		

	}
}

