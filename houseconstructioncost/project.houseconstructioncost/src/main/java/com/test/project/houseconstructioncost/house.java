package com.test.project.houseconstructioncost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class house {

	static Logger logger=LogManager.getLogger(house.class);
	void constructioncost(String materialstandard,int area,int automatedhome)
	{
		if(automatedhome==1 && materialstandard.equals("high standard"))
		{
			int cost=2500 * area;
			logger.info("house construction cost="+cost);
		}
		else if(materialstandard.equals("high standard"))
		{
			int cost=1800 * area;
			logger.info("house construction cost="+cost);
		}
		else if(materialstandard.equals("above standard"))
		{
			int cost=1500 * area;
			logger.info("house construction cost="+cost);
		}
		else if(materialstandard.equals("standard"))
		{
			int cost=1200 * area;
			logger.info("house construction cost="+cost);
		}
		else
		{
			logger.info("enter the correct given options");
		}
		
	}
}
