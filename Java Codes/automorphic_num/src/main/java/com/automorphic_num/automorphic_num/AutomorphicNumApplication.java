package com.automorphic_num.automorphic_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class AutomorphicNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomorphicNumApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		automorphicNumber(num);
		sc.close();

	}
	public static boolean automorphicNumber(int n){
		if(Math.pow(n,2) % 10 == n){
			System.out.println("It is an automorphic number");
			return true;
		}
		else{
			System.out.println("It is not an automorphic number");
			return false;
		}
	}

}
