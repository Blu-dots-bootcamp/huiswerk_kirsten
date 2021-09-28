import java.util.ArrayList;

public class ArrayListCollection {
	
	public void main(String[] args) {
		// assignment 1:
		// vul een array met 1 miljoen records (allemaal zelfde naam)
		// wijzig steeds van 1 record (de laatste, de middelste en de eerste) de naam
		// zoek naar dit record en laat zien hoe lang dit duurt
//		String[] nameList = new String[10];
//		for (int i = 1; i <= 10; i++)
//			
//		{
//			System.out.println("Cersei Lannister");
//		}
		ArrayList<String> personName = new ArrayList<String>();
		for (int i = 0; i < 1000000; i++) {
			personName.add(new String("Cersei Lannister"));
			//display
			System.out.println(personName.get(i));
		}
//		int first = 0;
//		int last = Array.length - 1;
//		int middle = (first + last) / 2;

		
	}	
		
}
