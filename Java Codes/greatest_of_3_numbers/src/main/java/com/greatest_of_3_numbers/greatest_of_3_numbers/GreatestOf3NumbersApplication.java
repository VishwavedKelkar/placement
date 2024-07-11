package com.greatest_of_3_numbers.greatest_of_3_numbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class GreatestOf3NumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatestOf3NumbersApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();

		if(a>b){
			if(a>c){
				System.out.println("Number "+a+" is greatest");
			}
			else{
				System.out.println("Number "+c+" is greatest");
			}
		}
		else{
			if(b>c){
				System.out.println("Number "+b+" is greatest");
			}
			else{
				System.out.println("Number "+c+" is greatest");
			}
		}
		sc.close();
	}

}
