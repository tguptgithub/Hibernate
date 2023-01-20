package com.library.libraryManagement.service;

import com.library.libraryManagement.model.BookModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class BookServiceImpl implements BookService {
	private static final Logger logger= (Logger) LoggerFactory.getLogger(BookServiceImpl.class);

	List<BookModel> bookDatabase=new ArrayList<>();

	@Override
	public BookModel getBook(int id) {
		for(int i=0;i< bookDatabase.size();i++){
			if(bookDatabase.get(i).getBookId()==id){
				return bookDatabase.get(i);
			}
		}
		return null;

		
	}

	@Override
	public BookModel addBook(BookModel bookModel) {
		BookModel bookAddition= new BookModel();
		bookAddition.setBookId(bookModel.getBookId());
		bookAddition.setName(bookModel.getName());
		bookAddition.setAuthor(bookModel.getAuthor());
		bookAddition.setPrice(bookModel.getPrice());
		logger.info("added data"+ bookModel.getBookId());
		 bookDatabase.add(bookAddition);
		 return bookAddition;
	}

	@Override
	public String deleteBook(int id) {
		bookDatabase.removeIf(x->x.getBookId()==id);
		 return null;
	}

	@Override
	public BookModel updateBook(BookModel bookModel) {
		for(int i=0;i< bookDatabase.size();i++){
			if(bookDatabase.get(i).getBookId()==bookModel.getBookId()){
				BookModel bookAddition= new BookModel();
				bookAddition.setBookId(bookModel.getBookId());
				bookAddition.setName(bookModel.getName());
				bookAddition.setAuthor(bookModel.getAuthor());
				bookAddition.setPrice(bookModel.getPrice());
				logger.info("added data"+ bookModel.getBookId());
				bookDatabase.add(bookAddition);
				return bookAddition;
			}

	}
		return null;
	}


}
