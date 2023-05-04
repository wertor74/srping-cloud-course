package com.example.clientservice.controller;

import com.example.clientservice.ClientServiceApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.getProperty;
import static java.lang.System.getenv;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class TestClientController {
    private static final Logger LOG = Logger.getLogger(TestClientController.class.getName());
    @GetMapping
    public String home() {
        String home = "Client-Service running at port: " + getenv("local.server.port");
        LOG.log(Level.INFO, home);
        return home;
    }

}
