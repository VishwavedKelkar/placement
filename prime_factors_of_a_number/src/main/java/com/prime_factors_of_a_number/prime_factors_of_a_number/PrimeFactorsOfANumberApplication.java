package com.prime_factors_of_a_number.prime_factors_of_a_number;

import java.util.*;

public class PrimeFactorsOfANumberApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		prime.primeFactor(num);

		sc.close();
	}
}

class prime{
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	public static void primeFactor(int n){
		System.out.println("The prime factors of the "+n+" are : ");
		for(int i = 2; i <= n ; i++){
			if(isPrime(i) && n % i == 0){
				System.out.print(i+" ");
			}
		}
	}
}
