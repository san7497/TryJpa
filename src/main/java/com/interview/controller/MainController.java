package com.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interview.pojo.LibraryModel;
import com.interview.service.LibraryService;

@RestController
public class MainController {
	
	@Autowired  
	 LibraryService libraryService; 
	
	 @RequestMapping(value = "/getBooks", method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
	   public List <LibraryModel> hello() {
		 return libraryService.getAllBooks();   
	   }
}
