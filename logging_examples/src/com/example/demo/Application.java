package com.example.demo;
import  java.util.logging.*;
import java.io.IOException;
import com.example.demo.utils.*;

public class Application {

//	SimpleFormatterr form;
//	static Logger logger = Logger.getLogger(Application.class.getClass().getName());
	
	
	
	 private static Logger logger;

	  static {
	      String path = Application.class.getClassLoader().getResource("logging.properties").getFile();

//	      System.out.println(path);
	
	    System.setProperty("java.util.logging.config.file",path);

	      logger = Logger.getLogger(Application.class.getName());
	      
	}

		public static void main(String[] args) {
		
		//	logger.setLevel(Level.INFO);
	
			Logger logger = LoggingUtility.getLogger(Application.class);
			
	try {
		FileHandler handler = new FileHandler("mylog",true);
		logger.addHandler(handler);
	} catch (SecurityException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
		logger.severe("1-sever message");
		logger.warning("2-warining message");
		logger.info("3-java.util.logger configured successfully");
		logger.fine("4-finer meassage");

	}

}
