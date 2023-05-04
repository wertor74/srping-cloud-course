package com.example.clientservice.controller;

import ch.qos.logback.core.Context;
import com.example.clientservice.ClientServiceApplication;
import com.example.clientservice.connector.BookServiceConnector;
import com.example.clientservice.model.Book;
import com.example.clientservice.service.ClientService;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.util.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.getProperty;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {
    private final BookServiceConnector bookServiceConnector;

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return bookServiceConnector.getAllBooks();
    }

    @GetMapping("/test")
    public String getBooksFromClient() {
        return "client";
    }

}
