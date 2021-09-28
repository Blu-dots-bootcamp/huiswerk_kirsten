package com.bludots;

import java.util.Arrays;


public class Explorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[1000];
		ArraysKM test = new ArraysKM();
//		test.geefZelfdeNaam(arr,"Kirsten");
		test.personName(array, "Jon Snow");
		test.convertRecord("Daenerys", "Cercei", "Arya Stark");
		test.findRecord("Cercei");
	}
	

}
