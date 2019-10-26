package ali.ashique.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ali.ashique"})
public class JokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesAppApplication.class, args);
    }

}

