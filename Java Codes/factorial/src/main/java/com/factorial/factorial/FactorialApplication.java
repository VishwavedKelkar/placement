package com.factorial.factorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class FactorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactorialApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int facto = Factorial.fact(n);
		System.out.println("The factorial of the number "+n+" is "+facto);

		sc.close();
	}
}

class Factorial{
	public static int fact(int n){

		if(n==0 || n==1){
			return 1;
		}
		return n * fact(n-1);
	}
}
