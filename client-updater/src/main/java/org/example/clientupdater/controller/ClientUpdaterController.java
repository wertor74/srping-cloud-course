package org.example.clientupdater.controller;

import lombok.AllArgsConstructor;
import org.example.clientupdater.connector.ClientServiceConnector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/update")
@AllArgsConstructor
public class ClientUpdaterController {
    private final ClientServiceConnector clientServiceConnector;
    @GetMapping("/test")
    public String getClientUpdater(){
        return clientServiceConnector.getBooksFromClient();
    }
}
