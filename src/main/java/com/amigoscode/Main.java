package com.amigoscode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse hello(){
        return new GreetResponse("Hello I'm Costas", List.of("Python", "JS"), new Person("Kostas"));
    }

    record Person(String name){};
    record GreetResponse(String greet, List<String> favLanguages, Person person){};
}
