package com.prime_num.prime_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class PrimeNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();

		if(n < 2){
			System.out.println("Not a prime number");
		}

		for(int i=2;i<n;i++){
			if(n % i == 0){
				System.out.println("Not a prime number");
				break;
			}
			else{
				System.out.println("Prime number");
				break;
			}
		}
	}

}
