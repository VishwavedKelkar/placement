package com.grtstof2.grtstof2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Grtstof2Application {

	public static void main(String[] args) {
		SpringApplication.run(Grtstof2Application.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();

		if(a>b){
			System.out.println("the number "+a+" is greatest");
		}
		else{
			System.out.println("the number "+b+" is greatest");	
		}
		sc.close();
	}

}
