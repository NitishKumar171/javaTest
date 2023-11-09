package com.example.limitsservice.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitConfiguration configuration;
	
	@GetMapping(path="/limits-service")
	public LimitConfiguration retriveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
