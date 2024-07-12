package com.power_of_a_num.power_of_a_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class PowerOfANumApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerOfANumApplication.class, args);
		Scanner sc = new Scanner(System.in);
//
		//System.out.println("Enter the number (base) : ");
		//int base = sc.nextInt();
		//System.out.println("Enter the power : ");
		//int power = sc.nextInt();
		//int b = 1;
		//if(base == 1 || base == 0){
		//	System.out.println("The answer is : 1");
		//}
		//else{
		//	for(int i=1;i<=power;i++){
		//		b  = b * base;
		//	}
		//	System.out.println("The answer is : "+b);
		//}
		//sc.close();


		System.out.println("Enter the number (base) : ");
		int base = sc.nextInt();
		System.out.println("Enter the power : ");
		int power = sc.nextInt();

		System.out.println(base+" ^ "+power+" is : "+Math.pow(base, power));
		sc.close();
	}

}
