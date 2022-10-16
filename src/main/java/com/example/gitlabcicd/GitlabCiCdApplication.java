package com.example.gitlabcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
public class GitlabCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitlabCiCdApplication.class, args);
    }

    @GetMapping("/test")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("say Coder24!");
    }

}
