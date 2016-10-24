package com.tokyo.olympics.beans;

import java.time.Duration;

public class SportsBean {
	private String sportsName;
	
	private Duration sportsDuration;
	
	private String sportsType;
	
	private String gender;
	
	private Boolean result;
	
	private Integer teamSize;

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public Duration getSportsDuration() {
		return sportsDuration;
	}

	public void setSportsDuration(Duration sportsDuration) {
		this.sportsDuration = sportsDuration;
	}

	public String getSportsType() {
		return sportsType;
	}

	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
}
