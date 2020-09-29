package com.waleed.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waleed.dto.Book;
import com.waleed.service.BookInfoService;


@RestController
public class BookInfoController {
	
	@Autowired
	BookInfoService service;
	
	
	@RequestMapping("books/{id}")
	Book getBookById(@PathVariable Integer id) {
		return service.getBookById(id);
	}
	
	@RequestMapping("/all/{userId}")
	List<Object> getEntireBookCatalog(@PathVariable Integer userId){
		return service.getEntireBookCatalog(userId);
	}
		@RequestMapping("books/put")
		void addBook(@RequestBody Book book) {
			service.addBook(book);
		}
	}


