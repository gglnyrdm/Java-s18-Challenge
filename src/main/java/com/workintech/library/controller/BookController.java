package com.workintech.library.controller;

import com.workintech.library.entity.Book;
import com.workintech.library.service.AuthorService;
import com.workintech.library.service.BookService;
import com.workintech.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;
    private AuthorService authorService;
    private CategoryService categoryService;
    @Autowired
    public BookController(BookService bookService, AuthorService authorService, CategoryService categoryService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book find(@PathVariable Long id){
        return bookService.find(id);
    }


}
