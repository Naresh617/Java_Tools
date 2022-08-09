package com.naresh;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2Application {
    
	private static final Logger LOGGER = LogManager.getLogger(Log4j2Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Log4j2Application.class, args);
		
		
		LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
		
		
	}

}
