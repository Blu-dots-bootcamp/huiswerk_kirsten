package SoccerManager;

import java.util.Comparator;

public class CustomComparator implements Comparator<SoccerClub> {

	// display teams in desc order cording to points
	@Override
	public int compare(SoccerClub teamHome, SoccerClub teamOpponent) {

		if (teamHome.getPoints() > teamOpponent.getPoints())
			return -1;

		else if (teamHome.getPoints() < teamOpponent.getPoints())
			return 1;
		else {
			int goalDif = teamHome.getscoredGoalsCount() - teamHome.getreceivedGoalsCount();
			int goalDif1 = teamOpponent.getscoredGoalsCount() - teamOpponent.getreceivedGoalsCount();
			if (goalDif > goalDif1)
				return -1;
			else
				return 0;
		}
	}

}
