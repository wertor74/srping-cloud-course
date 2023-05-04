package org.example.clientupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientUpdaterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientUpdaterApplication.class, args);
    }
}
