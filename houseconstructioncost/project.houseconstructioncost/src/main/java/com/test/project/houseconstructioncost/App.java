package com.test.project.houseconstructioncost;

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
        
        logger.info("enter type of material standard like");
        logger.info("standard,above standard,high standard");
        String materialstandard=obj.nextLine();
        
        logger.info("enter total area of house");
        int area=obj.nextInt();
        
        logger.info("press 1 for fully automated home or else press 0");
        int automatedhome=obj.nextInt();
        
        house housecost=new house();
        housecost.constructioncost(materialstandard,area,automatedhome);
    }
}
