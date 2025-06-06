package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooksByLibrary(Long libraryId) {
        return bookRepository.findByLibraryId(libraryId);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
