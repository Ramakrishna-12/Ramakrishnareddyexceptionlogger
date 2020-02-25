package com.test.cleancode.simpleandcompoundinterest;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	static Logger logger=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner obj=new Scanner(System.in);
        
        logger.info("Enter principle amount");
        double principle=obj.nextDouble();
        
        logger.info("Enter interest rate");
        double rate=obj.nextDouble();
        
        logger.info("Enter time period");
        double time=obj.nextDouble();
        
        simpleinterest simpleinterestobject=new simpleinterest();
        simpleinterestobject.calculate(principle,rate,time);
        
        compoundinterest compoundinterestobject= new compoundinterest();
        compoundinterestobject.calculate(principle,rate,time);
        
    }
}
