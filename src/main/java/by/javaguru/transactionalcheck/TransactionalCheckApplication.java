package by.javaguru.transactionalcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionalCheckApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(TransactionalCheckApplication.class, args);
        System.out.println(context);
    }

}
