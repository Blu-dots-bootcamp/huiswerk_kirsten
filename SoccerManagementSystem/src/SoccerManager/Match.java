package SoccerManager;

import java.util.Date;

public class Match {

	private SportClub teamHome;
	private SportClub teamOpponent;
	private int teamHomeScore;
	private int teamOpponentScore;
	private Date date;
	
	public SportClub getTeamHome() {
		return teamHome;
	}
	
	public void setTeamHome (SportClub teamHome) {
		this.teamHome = teamHome;
	}
	
	public SportClub getTeamOpponent() {
		return teamOpponent;
	}
	
	public void setTeamOpponent (SportClub teamOpponent) {
		this.teamOpponent = teamOpponent;
	}
	
	public int getTeamHomeScore() {
		return teamHomeScore;
	}
	
	public void setTeamHomeScore (int teamHomeScore) {
		this.teamHomeScore = teamHomeScore;
	}
	
	public int getTeamOpponentScore() {
		return teamOpponentScore;
	}
	
	public void setTeamOppnonent (int teamOpponentScore) {
		this.teamOpponentScore = teamOpponentScore;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate (Date date) {
		this.date = date;
	}
}
