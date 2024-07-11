package com.sum_of_n_from_range.sum_of_n_from_range;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class SumOfNFromRangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumOfNFromRangeApplication.class, args);
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.println("Enter the starting number of the range : ");
		int n1 = sc.nextInt();

		System.out.println("Enter the ending number from the range ");
		int n2 = sc.nextInt();

		for(int i=n1;i<=n2;i++){
			sum = sum+i;
		}
		System.out.println("The sum from the range  "+n1 + " to "+n2+" is : "+sum);

		sc.close();
	}

}
