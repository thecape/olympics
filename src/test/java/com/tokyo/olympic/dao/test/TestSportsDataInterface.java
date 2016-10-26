package com.tokyo.olympic.dao.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tokyo.olympics.beans.SportsBean;
import com.tokyo.olympics.dao.SportsDataInterface;
import com.tokyo.olympics.dao.impl.SportsDataInterfaceImpl;
import com.tokyo.olympics.service.GenerateRandomnNumbers;
import com.tokyo.olympics.service.impl.GenerateRandomnNumbersImpl;



public class TestSportsDataInterface {
	
	List<String> list = new ArrayList<String>();
	SportsDataInterface sportsDataInterface = new SportsDataInterfaceImpl() ;
	

	
	GenerateRandomnNumbers generateRandomnNumbers = new GenerateRandomnNumbersImpl();
	Save save = new Save();
	@Test
	public void testGetSportDetails (){
		try{
		SportsBean sportsBean = sportsDataInterface.getSportDetails("Kabaddi", "F");
		String fileExtension = save.saveFile("fileName");
		Assert.assertEquals(true, sportsBean.getResult());
		Assert.assertEquals("Kabaddi", sportsBean.getSportsName());
		Assert.assertEquals("F", sportsBean.getGender());
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
}
