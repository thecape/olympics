package com.tokyo.olympics.dao;

import com.tokyo.olympics.beans.SportsBean;

public interface SportsDataInterface {

	public SportsBean getSportDetails (String sportsName, String gender);
	
}
