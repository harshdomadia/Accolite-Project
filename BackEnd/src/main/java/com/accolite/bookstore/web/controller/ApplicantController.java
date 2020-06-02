package com.accolite.bookstore.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.bookstore.model.Applicant;
import com.accolite.bookstore.mysql.dao.ApplicantDao;

//@RestController
public class ApplicantController {
	/*
	@Autowired 
	private ApplicantDao dao;
	@PostMapping("/addApplicant")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Applicant> addApplicant(@RequestBody Applicant applicant) {
		dao.save(applicant);
		return (List<Applicant>) dao.findAll();
		
		
	}
	@GetMapping("/getApplicant")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Applicant> getApplicant(){
		return (List<Applicant>) dao.findAll();
	}*/
	
	

}
