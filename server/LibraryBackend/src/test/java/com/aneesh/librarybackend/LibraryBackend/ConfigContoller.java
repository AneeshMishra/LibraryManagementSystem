package com.aneesh.librarybackend.LibraryBackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.librarybackend.LibraryBackend.model.Book;

@RestController
public class ConfigContoller {
	
	Book book;
	ConfigContoller(){
		book = new Book();
		book.setName("Geeta");
		book.setDescription("Written by vyas ji");
	}
	
	@GetMapping("/allBooks")
    //@CrossOrigin(origins = "http://localhost:4200")
	public Book getAllBooks() {
		return book;
	}
}
