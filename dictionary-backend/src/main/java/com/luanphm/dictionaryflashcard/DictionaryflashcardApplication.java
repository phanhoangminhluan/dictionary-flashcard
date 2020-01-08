package com.luanphm.dictionaryflashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DictionaryflashcardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DictionaryflashcardApplication.class, args);
    }

}
