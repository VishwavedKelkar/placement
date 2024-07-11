
//check if a number is positive or negative

package com.code1.code1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class num_pos_neg {

	public static void main(String[] args) {
		SpringApplication.run(num_pos_neg.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		if(num > 0){
			System.out.println("The number is positive");
		}
		else if(num < 0){
			System.out.println("The number is negative");
		}
		else{
			System.out.println("The number is zero");
		}
	}

}
