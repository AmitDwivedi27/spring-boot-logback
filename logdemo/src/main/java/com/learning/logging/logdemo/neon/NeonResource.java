package com.learning.logging.logdemo.neon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NeonResource {

	Logger logger = LoggerFactory.getLogger(NeonResource.class);
	
	@RequestMapping("/neon")
	public String hello() {
		//Logger logger = LoggerFactory.getLogger("AIRRollingFile");
		logger.trace("line 1 hello from NEON trace");
		logger.error("line 2 hello from NEON error");
		return "Hello from Spring Boot NEON App";
	}

}
