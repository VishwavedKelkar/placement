package com.factors_of_a_num.factors_of_a_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class FactorsOfANumApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactorsOfANumApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Factors of " + num + " are : ");
		//for(int i = 1 ; i <= num ; i++ ){
		//	if(num % i == 0){
		//		System.out.print(i+" ");
		//	}
		//}
		Factors.facotrsOfNumber(num);
		sc.close();
	}
}

class Factors{
	public static int facotrsOfNumber(int n){
		for(int i = 1 ; i <= n ; i++ ){
			if(n % i == 0){
				System.out.print(i+" ");
			}
		}
		return 0;
	}
}
