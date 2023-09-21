package com.atchaya.emplyoeeserivces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmplyoeeController {
	
	@Autowired
	private EmplyoeeService service;
	
	@PostMapping("/Empyloeeservice")
	public void add(@RequestBody Emplyoee empl)
	{
	  service.save(empl);
	}

}
