package com.armstrong_in_range.armstrong_in_range;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ArmstrongInRangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmstrongInRangeApplication.class, args);

		ArmstrongNumber.armstrongNum();
	}
}

class ArmstrongNumber{
	public static void armstrongNum(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the range : ");
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		for(int i = lower ; i <= upper;){
				int rem = i % 10;
				sum = rem * rem * rem;
				i = i / 10;
		}
		sc.close();
	}
}
