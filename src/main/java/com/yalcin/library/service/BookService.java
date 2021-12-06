package com.yalcin.library.service;

import java.util.List;

import com.yalcin.library.model.Author;
import com.yalcin.library.model.Book;
import com.yalcin.library.model.Publisher;

public interface BookService {
	List<Book> getAllBooks();
	void saveBook(Book book);
	Book getBookById(long id);
	void deleteBook(long id);
	List<Book> getSearchBooks(String searchWord);
	List<Author> getAllAuthorForBooks();
	List<Publisher> getAllPublisherForBooks();
	List<Book> getAllOrderedBooks();
	List<Book> getAllOrderedBooksWithLimit();

}
