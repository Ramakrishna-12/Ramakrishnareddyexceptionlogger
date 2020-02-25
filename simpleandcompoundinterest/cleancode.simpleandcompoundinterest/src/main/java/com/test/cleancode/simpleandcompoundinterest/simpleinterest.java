package com.test.cleancode.simpleandcompoundinterest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class simpleinterest {
	static Logger logger=LogManager.getLogger(App.class);
	void calculate(double principle,double rate,double time)
	{
		double amount=( principle* rate * time ) /100;
		logger.info("Simple Interest="+amount);
	}

}
