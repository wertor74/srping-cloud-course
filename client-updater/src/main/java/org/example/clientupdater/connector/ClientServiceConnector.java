package org.example.clientupdater.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CLIENT-SERVICE")
public interface ClientServiceConnector {
    @GetMapping("/api/client/test")
    String getBooksFromClient();
}
