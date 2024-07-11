package com.sum_of_n_natural_num.sum_of_n_natural_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SumOfNNaturalNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumOfNNaturalNumApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of natural numbers");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of " + n + " natural numbers is " + sum);
		
		sc.close();
	}

}
