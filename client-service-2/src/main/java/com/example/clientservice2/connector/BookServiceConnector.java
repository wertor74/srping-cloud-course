package com.example.clientservice2.connector;

import com.example.clientservice2.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "BOOK-SERVICE")
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
