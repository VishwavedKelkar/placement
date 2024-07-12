package com.rhombus_star_pattern.rhombus_star_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class RhombusStarPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhombusStarPatternApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int row = sc.nextInt();

		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				 System.out.print("*");
			}
			System.out.println();
			for(int j=0;j<=i;j++)
				System.out.print(" ");
		}

		sc.close();
	}

}

