package com.example.clientservice2.service;

import com.example.clientservice2.connector.BookServiceConnector;
import com.example.clientservice2.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Client2ServiceImpl implements Client2Service{
    private final BookServiceConnector bookServiceConnector;
    @Override
    public List<Book> getAllBooksFromClient() {
        return bookServiceConnector.getAllBooks();
    }
}
