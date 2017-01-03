package com.jnit.app.throwaway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	static final Logger logger = LogManager.getLogger(Main.class.getName());
	//ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
	public static void main(String[] args) {
		int x = -10;
		int y = 20;
		int z = x+y;
		logger.debug("value of x is "+x);
		logger.debug("Value of y is" +y);
		if(x < 0 || y < 0){
			logger.warn(" got negative values for x or y.. please check");
		}
		System.out.println(z);
		logger.info(z);
	}

}
