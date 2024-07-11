package com.sqaure_star.sqaure_star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SqaureStarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqaureStarApplication.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of a square : ");
		int n = sc.nextInt();

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
