package com.test.cleancode.simpleandcompoundinterest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class compoundinterest {
	static Logger logger=LogManager.getLogger(App.class);
	void calculate(double principle,double rate,double time)
	{
		double amount= principle*(Math.pow((1+rate/ 100),time));
		logger.info("compound Interest="+amount);
	}

}
