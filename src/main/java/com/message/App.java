package com.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        MessageService service = context.getBean(MessageService.class);
//        service.save("Hello, Abdulmatin");
//        System.out.println("Hello");
        SpringApplication.run(App.class, args);
    }
}
