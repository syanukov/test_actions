package io.apinity.bfi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BfiApplication {

  public static void main(String[] args) {
    System.out.println("**** hello from skipped ***");
    SpringApplication.run(BfiApplication.class, args);
  }

}
