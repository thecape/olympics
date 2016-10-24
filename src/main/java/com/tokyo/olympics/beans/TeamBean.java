package com.tokyo.olympics.beans;

public class TeamBean {
	private String teamName;
	
	private String country;
	
	private Integer squadSize;
	
	private String captain;
	
	private String gender;
	
	private Boolean teamResult;
	
	private String sportsName;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSquadSize() {
		return squadSize;
	}

	public void setSquadSize(Integer squadSize) {
		this.squadSize = squadSize;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getTeamResult() {
		return teamResult;
	}

	public void setTeamResult(Boolean teamResult) {
		this.teamResult = teamResult;
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

}
