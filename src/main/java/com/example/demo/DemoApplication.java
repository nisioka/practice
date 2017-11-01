package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DemoApplication
 * @since 1.0.0
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * main.
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println("hoge fuga piyo");
		SpringApplication.run(DemoApplication.class, args);
	}
}
