package com.armstrong_num.armstrong_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ArmstrongNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmstrongNumApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		if(num == Armstrong.armstrongNumber(num))
		System.out.println("The entered number is an Armstrong number"); 
		else
		System.out.println("The entered number is not an Armstrong number");

		sc.close();
	}
}

class Armstrong{
	public static int armstrongNumber(int n){
		int sum = 0;
		int temp = n;
		while(temp != 0){
			int n1 = temp % 10;
			sum = sum + (n1 * n1 * n1);
			temp = temp / 10;
		}
		return sum;
	}
}
