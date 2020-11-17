package com.p1.repository;

import org.springframework.data.repository.CrudRepository;

import com.p1.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>{
}
