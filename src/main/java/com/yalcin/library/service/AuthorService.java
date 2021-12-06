package com.yalcin.library.service;

import java.util.List;

import com.yalcin.library.model.Author;

public interface AuthorService {
	List<Author> getAllAuthors();
	void saveAuthor(Author author);
	Author getAuthorById(long id);
	void deleteAuthor(long id);
}
