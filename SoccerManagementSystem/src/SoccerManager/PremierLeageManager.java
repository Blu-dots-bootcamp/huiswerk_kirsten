package SoccerManager;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PremierLeageManager implements LeagueManager {

	private final int numberOfClubs;
	private final ArrayList<SoccerClub> league;
	private final Scanner scanner;
	private final ArrayList<Match> matches;

	public PremierLeageManager(int numberOfClubs) {

		this.numberOfClubs = numberOfClubs;
		league = new ArrayList<>();
		matches = new ArrayList<>();
		scanner = new Scanner(System.in);
		displayMenu();
	}

	private void displayMenu() {

		while (true) {
			System.out.println("Premier League Menu");
			System.out.println("Create new team and add it to league (PRESS1)");
			System.out.println("Delete existing team from league (press2)");
			System.out.println("Display Statistics for team (PRESS 3)");
			System.out.println("Display the Premier League Table (PRESS4)");
			System.out.println("Add a played Match (PRESS 5 )");
			// System.out.println("Delete existing team from league (press2)");
			String line = scanner.nextLine();
			int command = 0;
			try {
				command = Integer.parseInt(line);
			} catch (Exception e) {

			}
			switch (command) {
			case 1:
				addTeam();

				break;
			case 2:
				deleteTeam();
			default:
				System.out.println("Wrong command");

			}
		}
	}

	private void addTeam() {
			if (league.size() == numberOfClubs) {
				System.out.println("Can't add more clubs in league:");
				return;
			}
	
	
		
		SoccerClub club = new SoccerClub();
		System.out.println("Insert Club Name");
		String line = scanner.nextLine();
		club.setName(line);
		
		if(league.contains(club)) {
			System.out.println("This club is already in the league");
			return;
		}
		System.out.println("Insert Club Location");
		line = scanner.nextLine();
		club.setLocation(line);
		league.add(club);
	}
	
	private void deleteTeam() {
		System.out.println("Insert club name: ");
		String line = scanner.nextLine();
		for(SoccerClub club : league) {
			if(club.getName().equals(line)) {
				league.remove(club);
				System.out.println("Club" + club.getName() + "removed");
				return;
			}
		}
	
		System.out.println("No such in league");
	}
}