                                                                                                                                                  
root@---:~/docker-compose-java-demo/src/main/java/com/example/demo# nano DemoApplication.java
package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/")
    public String home() {
        return "Hello from Docker Compose + Java + MySQL!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}












