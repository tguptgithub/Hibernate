package com.library.libraryManagement.service;

import com.library.libraryManagement.model.BookModel;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
	public BookModel getBook(int id);
	public BookModel addBook(BookModel bookModel);

	public String deleteBook(int id);

	public BookModel updateBook(BookModel bookObj);

}
