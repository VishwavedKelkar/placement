package com.prime_num_in_range.prime_num_in_range;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class PrimeNumInRangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumInRangeApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=n ; i<=m;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n){

		if(n < 2){
			return false;
		}

		for(int i =2 ; i < n ;i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;

	}

}
