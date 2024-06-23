package com.sree.BookApp.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.BookApp.Entity.BookEntity;
import com.sree.BookApp.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@GetMapping("/sri")
	public String getname() {
		return "hai";
	}
	
	
	@GetMapping("/book")
	public List<BookEntity> getAllBooks() {
		
		return bs.getAllBooks();
		
	}
	
	@GetMapping("/book/{id}")
	public BookEntity getBookByID(@PathVariable("id")int i){
		
		return bs.getBookByID(i);
	}
	
	
	@PostMapping("/book")
	public BookEntity InsertBook(@RequestBody BookEntity b) {
		
		return  bs.InsertBook(b);
		
	}
	
	@PutMapping("/book/{id}")
	public String updateBook(@RequestBody BookEntity b,@PathVariable("id")int i) {
		
		return bs.updateBook(b, i);
		
	}
	
	
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable("id")int i) {
		
		return bs.deleteBook(i);
		
	}
	
	
	
	
}
