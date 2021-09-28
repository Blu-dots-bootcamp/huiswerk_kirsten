package SoccerManager;


	
	public class SoccerClub extends SportClub {

		private int winCount;
		private int defeatCount;
		private int scoredGoalsCount;
		private int receivedGoalsCount;
		private int points;
		private int matchesPlayed;

		public int getWinCount() {
			return winCount;
		}

		public void setWinCount(int wincount) {
			winCount = wincount;
		}

		public int getdefeatCount() {
			return defeatCount;
		}

		public void setdefeatCount(int defeatcount) {
			defeatCount = defeatcount;
		}

		public int getscoredGoalsCount() {
			return scoredGoalsCount;
		}

		public void setscoredGoalsCount(int scoredgoalscount) {
			scoredGoalsCount = scoredgoalscount;
		}
		
		public int getreceivedGoalsCount() {
			return receivedGoalsCount;
		}

		public void setsreceivedGoalsCount(int receivedgoalscount) {
			receivedGoalsCount = receivedgoalscount;
		}
		
		public int getPoints() {
			return points;
		}

		public void setPoints(int Points) {
			points = Points;
		}

		public int getmatchesPlayed() {
			return matchesPlayed;
		}

		public void setmatchesPlayed(int i) {
			matchesPlayed = i;
		}
	}


