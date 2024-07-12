package com.palindrome.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class PalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromeApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if( palindrome.palindromeNum(n) == n )
			System.out.println("The given number is a palindrome");
		else
			System.out.println("It is not a palindrome");

		sc.close();
		
	}
}

class palindrome {
	public static int palindromeNum(int n) {
		int rem,rev = 0;

		while(n!=0){
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/ 10;
		}
		return rev;		
	}
}
