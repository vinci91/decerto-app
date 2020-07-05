package eu.fitk.decertoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecertoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DecertoApplication.class, args);
		RandomNumbersGenerator randomNumbersGenerator = new RandomNumbersGenerator();
		randomNumbersGenerator.performOperation();
	}


}
