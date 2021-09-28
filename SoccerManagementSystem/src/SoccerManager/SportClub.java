package SoccerManager;

public abstract class SportClub {

	private String name;
	private String location;
	private String statistics;

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((SportClub) obj).name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatistics() {
		return statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

}
