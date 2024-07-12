package com.fibonacci_upto_n.fibonacci_upto_n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class FibonacciUptoNApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibonacciUptoNApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number upto which you want to print the fibonacci series");
		int n = sc.nextInt();
		System.out.println("The fibonacci series is ");
		int a = 0,b=1;
		System.out.print(a+" ,"+b+" ,");
		for(int i=2;i<n;i++){
			int c = a+b;
			a=b;
			b=c;
			System.out.print(c + " ,");
		}
		sc.close();
	}
}
