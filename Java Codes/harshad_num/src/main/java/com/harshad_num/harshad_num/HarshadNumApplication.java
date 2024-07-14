package com.harshad_num.harshad_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class HarshadNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarshadNumApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();

		isHarshadNum(num);

		sc.close();
	}

	public static int sumOfDigits(int n){
		int sum = 0;
		while(n>0){
			sum = sum + n%10;
			n = n / 10;
		}
		return sum;
	}

	public static void isHarshadNum(int n){
		//int result = sumOfDigits(n);
		//System.out.println(result);

		if(n % sumOfDigits(n) == 0){
			System.out.println("It is a Harshad number ");
		}
		else{
			System.out.println("It is not a Harshad number ");
		}
	}
}
