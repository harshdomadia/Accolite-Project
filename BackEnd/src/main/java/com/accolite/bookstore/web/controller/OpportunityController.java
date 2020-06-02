package com.accolite.bookstore.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.accolite.bookstore.model.Opportunity;
import com.accolite.bookstore.mysql.dao.OpportunityDao;

@RestController
public class OpportunityController {
	@Autowired 
	private OpportunityDao dao;
	@PostMapping("/api/create")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Opportunity> addData(@RequestBody Opportunity opportunity) {
		dao.save(opportunity);
		return (List<Opportunity>) dao.findAll();
		
		
	}
	@GetMapping("/api/get")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Opportunity> getData(){
		return (List<Opportunity>) dao.findAll();
	}
	
	
	@DeleteMapping("/api/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public void deleteData(@PathVariable Integer id) {
		dao.deleteById(id);
	}
	
	@PutMapping("/api/update")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Opportunity> updateData(@RequestBody Opportunity opportunity){
		dao.save(opportunity);
		return (List<Opportunity>) dao.findAll();
		
	}

}
