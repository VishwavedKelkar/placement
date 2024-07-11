package com.even_odd.even_odd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class EvenOddApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvenOddApplication.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

		sc.close();
	}

}
