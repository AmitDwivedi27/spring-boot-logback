package com.learning.logging.logdemo.air;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirResource {

	Logger logger = LoggerFactory.getLogger(AirResource.class);
	
	@RequestMapping("/air")
	public String hello() {
		//Logger logger = LoggerFactory.getLogger("AIRRollingFile");
		logger.trace("line 1 hello from AIR trace");
		logger.error("line 2 hello from AIR error");
		return "Hello from Spring Boot AIR App";
	}

	
}
