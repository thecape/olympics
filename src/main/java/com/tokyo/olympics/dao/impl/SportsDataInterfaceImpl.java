package com.tokyo.olympics.dao.impl;

import com.tokyo.olympics.beans.SportsBean;
import com.tokyo.olympics.dao.SportsDataInterface;

public class SportsDataInterfaceImpl implements SportsDataInterface{
	

	public SportsBean getSportDetails(String sportsName, String gender) {
		
		//data access and u would have a data bean
		SportsBean sportsBean = new SportsBean();
		sportsBean.setSportsName(sportsName);
		sportsBean.setGender(gender);
		sportsBean.setResult(true);
		return sportsBean;
	}


}
