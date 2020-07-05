package eu.fitk.decertoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecertoApp {

	public static void main(String[] args) {

		SpringApplication.run(DecertoApp.class, args);
		Generator randomNumbersGenerator = new Generator();
		randomNumbersGenerator.performOperation();
	}


}
