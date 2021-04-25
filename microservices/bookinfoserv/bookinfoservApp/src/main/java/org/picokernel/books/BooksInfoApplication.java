package org.picokernel.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // NOTE: Optional
public class BooksInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooksInfoApplication.class, args);
    }
}
