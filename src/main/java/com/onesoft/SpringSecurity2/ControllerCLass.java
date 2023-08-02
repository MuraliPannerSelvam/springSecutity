package com.onesoft.SpringSecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCLass {
	
	@GetMapping(value="/student")
	public String getStudent() {
		return "Access for Students Only";
	}
	
	@GetMapping(value="/trainer")
	public String getTrainer() {
		return "Access for Trainers Only";
	}
	
	@GetMapping(value="/manager")
	public String getManager() {
		return "Access for Managers Only";
	}

}
