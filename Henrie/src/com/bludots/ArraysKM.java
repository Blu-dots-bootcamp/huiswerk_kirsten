package com.bludots;
import java.util.Arrays;

public class ArraysKM {
	public String[] array;
	public Long t0;
	public Long t1;

	// assignment 1:
	// vul een array met 1 miljoen records (allemaal zelfde naam)
	// wijzig steeds van 1 record (de laatste, de middelste en de eerste) de naam
	// zoek naar dit record en laat zien hoe lang dit duurt
	public static void personName(String[] array, String name) {
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = name;

		}
		System.out.println(Arrays.toString(array));
	}

	public void convertRecord(String firstNameList, String middleNameList, String lastNameList) {

		int firstIndex = 0;
		int lastIndex = array.length - 1;
		int middleIndex = (firstIndex + lastIndex) / 2;

		array[firstIndex] = firstNameList;
		array[lastIndex] = lastNameList;
		array[middleIndex] = middleNameList;

		System.out.println(Arrays.toString(array));
	}

	public void findRecord(String searchNameInList) {

		for (int i = 0; i <= array.length - 1; i++) {
			if (searchNameInList.equals(array[i])) {

			}
		}
		t1 = System.currentTimeMillis();

		System.out.println("Time: " + (t1 - t0) + " ms");

	}
}
