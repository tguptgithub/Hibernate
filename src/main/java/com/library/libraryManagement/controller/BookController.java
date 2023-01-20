package com.library.libraryManagement.controller;

import com.library.libraryManagement.model.BookModel;
import com.library.libraryManagement.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class BookController {
 @Autowired
    BookServiceImpl bookObj;
    @GetMapping("/book/{bookId}")
    public ResponseEntity<BookModel>  getBook(@PathVariable int bookId){
       return new ResponseEntity( bookObj.getBook(bookId), HttpStatus.OK);
    }

    @PostMapping("/book")
   public ResponseEntity<BookModel> addBook(@RequestBody BookModel bookmodel){
       return new ResponseEntity(bookObj.addBook(bookmodel), HttpStatus.OK);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable int bookId){
        return new ResponseEntity("Deleted successfully"+ bookId , HttpStatus.OK);
    }

    @PutMapping("/book/update")
    public ResponseEntity<BookModel> updateBook(@RequestBody BookModel bookmodel){
        return new ResponseEntity(bookObj.updateBook(bookmodel) , HttpStatus.OK);
    }

}

