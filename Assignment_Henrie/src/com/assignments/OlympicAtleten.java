package com.assignments;

import java.time.LocalDate;


import java.util.ArrayList;

import com.assignments.OlympicAtleten.Sport;

public class OlympicAtleten {
	// Assignment 1: Maak een lijst van 50 atleten.
	// Vul ze steeds met andere sporten, dus bijv een aantal boksers, voetballers
	// etc ec
	// Maak deze ook aan met een variabel geboortejaar (tussen 1990-2005))

	public enum Sport {
		TRACKCYCLING(true), ZWEMMEN(true), TAEKWONDO(true), ARCHERY(false), BOKSEN(false);

		private boolean individueel;

		private Sport(boolean individueel) {
			this.individueel = individueel;
		}

		boolean isIndividueel() {
			return individueel;
		}
	};

	private String voornaam;
	private String achternaam;
	private LocalDate geboortedatum;
	private Sport sport;

	/*
	 * Atleet constructor: Create a new atleet, .
	 */

	public String getvoornaam() {
		return voornaam;
	}

	public void setvoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getachternaam() {
		return achternaam;
	}

	public void setachternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public LocalDate getgeboortedatum() {
		return geboortedatum;
	}

	public void setgeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

//	//public String toonsporters() {
//		return voornaam + " " + achternaam + " "+ " Sport: " + " " + sport;
//	}
//	
//	public String toonsportersFullNameAndBirthMonth() {
//		return voornaam + " " + achternaam + " Sport: " + geboortedatum;
//	}
	public OlympicAtleten(String voornaam, String achternaam, LocalDate geboortedatum, Sport sport) {
		super();
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.geboortedatum = geboortedatum;
		this.sport = sport;
	}

	public void vertoonAtleet() {

		System.out.println("Voornaam	: " + getvoornaam());
		System.out.println("Achternaam	: " + getachternaam());
		System.out.println("Sport		: " + getSport());
		System.out.println("GeboorteDatum	: " + getgeboortedatum());
		System.err.println("Individueel : " + getSport().isIndividueel());
		System.out.println("GeboorteDatum	: " + getgeboortedatum().getDayOfMonth() + " "
				+ getgeboortedatum().getMonth() + " " + getgeboortedatum().getYear());
		System.out.println();
	}

}