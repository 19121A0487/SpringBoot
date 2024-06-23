package com.sree.BookApp.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sree.BookApp.Entity.BookEntity;

@Repository
public interface BookRepo extends CrudRepository<BookEntity, Integer> {

	BookEntity findById(int i);
	
	
}
