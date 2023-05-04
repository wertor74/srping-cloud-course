package com.example.clientservice2.controller;

import com.example.clientservice2.model.Book;
import com.example.clientservice2.service.Client2Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class Client2Controller {

    @GetMapping("/test")
    public String getBooksFromClient() {
        return "client2";
    }
}
