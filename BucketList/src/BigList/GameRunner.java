package BigList;

import java.util.ArrayList;
import java.util.List;


import BigList.Game.Category;
import BigList.Game.Level;





public class GameRunner  {
	
	
	public class OnlineGame extends Game {

		protected String website;
		
		public OnlineGame(String title, Category category, Level level, String website) {
			super(title, category, level);
			this.website = website;
		}
		
		public String toString() {
			return "ik doe wat ik wil, ga naar website " + website + ", titel=" + title;
		}

	}
	public static void main(String args[]) throws Exception {
		
		List <Game> games = new ArrayList<Game>();
		games.add(new Game("Grand Theft", Category.ADVENTURE, Level.MODERATE));
		games.add(new Game("FIFA 2020", Category.SPORT, Level.MODERATE));
		games.add(new Game("World of warcraft", Category.ADVENTURE, Level.DIFFICULT));

		for (Game game : games) {
			//System.out.println(game);
		}
	
		OnlineGame a = new OnlineGame("Tetris", Category.ADVENTURE, Level.DIFFICULT, "http://www.tetris.com");
		Game b = new Game("Just dance", Category.SPORT, Level.MODERATE);
		
		
		Game c = a;

		test(0);
		
	}

	
	public static void test(int a)   {
		
		try {
			int b = 10/a;
			System.out.println("hallo hier zijn we " + b);

		}
		catch (Exception e) {
			System.err.println("Sorry dit doen we niet");
		}
		
	}
}