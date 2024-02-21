package com.workintech.library.service;

import com.workintech.library.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author find(Long id);
    Author save(Author author);
    Author delete(Long id);
}
