package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PocApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocApplication.class, args);
        System.out.println("\nREADY TO TEST");
    }

}
