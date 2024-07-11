package com.sum_of_n_num.sum_of_n_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SumOfNNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumOfNNumApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of elements");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++){
			sum = sum + i;
		}

		System.out.println("the sum is : "+sum);
		sc.close();
	}

}
