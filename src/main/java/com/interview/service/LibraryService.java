package com.interview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.Repository.LibraryRepository;
import com.interview.pojo.LibraryModel;

@Service
public class LibraryService {

	@Autowired  
	LibraryRepository libraryRepository;  
	public List<LibraryModel> getAllBooks() {
		// TODO Auto-generated method stub
		List<LibraryModel> books = new ArrayList<LibraryModel>();  
		books=(List<LibraryModel>) libraryRepository.findAll();  
		LibraryModel update=new LibraryModel();
		update.setAuthor("santhosh");
		update.setTitle("mybook");
		update.setYear("2020");
		libraryRepository.save(update);
		return books; 
	}
	

}
