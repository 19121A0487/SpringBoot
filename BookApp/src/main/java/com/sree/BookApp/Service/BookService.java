package com.sree.BookApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sree.BookApp.Entity.BookEntity;
import com.sree.BookApp.Repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo br;
	
	public List<BookEntity> getAllBooks() {
		List<BookEntity> list=(List<BookEntity>) br.findAll();
		return list;
		
		
		
	}

	public BookEntity getBookByID(int i) {
		BookEntity b=br.findById(i);
		return b;
	}
	
	
	public BookEntity InsertBook(BookEntity b) {
		return br.save(b);
	}
	
	public String updateBook(BookEntity b,int i) {
		
		BookEntity b1 =br.findById(i);
		b1.setName(b.getName());
		b1.setAuthor(b.getAuthor());
		
		br.save(b1);
		return "Updated......";
	}

	public String deleteBook(int i) {
		br.deleteById(i);
		return "deleted......";
	}
	
	

}
