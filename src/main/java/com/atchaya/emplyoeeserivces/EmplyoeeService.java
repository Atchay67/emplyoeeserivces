package com.atchaya.emplyoeeserivces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmplyoeeService {
	
	@Autowired
   private EmplyoeeRepository repo;
	
	// Inserting the record to the table in database
   public void save (Emplyoee empl)
   {
	   repo.save(empl) ;}
}
