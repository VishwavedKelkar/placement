package com.nth_term_in_fibonacci_series.nth_term_in_fibonacci_series;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class NthTermInFibonacciSeriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NthTermInFibonacciSeriesApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number upto which you want a fibonacci series : ");
		int n = sc.nextInt();
		int next,first=0,second=1;
		int[] arr = new int[n];
		arr[0] = first;
		arr[1] = second;
		System.out.println("The fibonacci series containing "+n+" numbers is : ");
		//System.out.print(first+" ,"+second+" ");

		for(int i=2;i<n;i++){
			next = first + second;
			System.out.print(first+" ,");
			arr[i] = next;
			first = second;
			second = next;
		}
		System.out.println();
		System.out.println("Enter the nth number you want to find out from the fibonacci series of "+n+" elements");
		int a = sc.nextInt();

		if(a<=n){
			System.out.println("The "+a+"th element is : "+arr[a-1]);
		}
		else{
			System.out.println("Invalid input");
		}
		sc.close();
	}
}
