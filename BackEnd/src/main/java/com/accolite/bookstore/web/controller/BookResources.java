package com.accolite.bookstore.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.*;

@RestController
public class BookResources {

	@GetMapping("/books")
	public List<String> getAllBooks() {
		List<String> data = new ArrayList<>();
		data.add("Hello");
		return data;
	}

	
}
