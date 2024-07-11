package com.hollow_sqre_pattern.hollow_sqre_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class HollowSqrePatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(HollowSqrePatternApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();

		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1 ; j<=cols;j++){
				if((i==1 || i==rows) || (j==1 || j==cols)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
