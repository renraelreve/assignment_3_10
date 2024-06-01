package com.example.assignment_3_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Assignment310Application {

  private static final Logger logger = (Logger) LoggerFactory.getLogger(Assignment310Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Assignment310Application.class, args);
  }

}
