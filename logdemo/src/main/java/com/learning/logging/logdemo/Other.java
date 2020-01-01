package com.learning.logging.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Other {

	Logger logger = LoggerFactory.getLogger(Other.class);
	
	@RequestMapping("/other")
	public String hello() {
		//Logger logger = LoggerFactory.getLogger("AIRRollingFile");
		logger.trace("line 1 hello from Other trace");
		logger.error("line2 hello from Other error");
		return "Hello from Spring Boot NEON App";
	}
}
