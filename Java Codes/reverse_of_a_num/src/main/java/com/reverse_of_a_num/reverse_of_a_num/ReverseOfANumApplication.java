package com.reverse_of_a_num.reverse_of_a_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ReverseOfANumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseOfANumApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int reversed=reverse.reverseNum(num);
		System.out.println("The reverse of the number "+num+" is "+reversed);
		
		sc.close();
	}
}

class reverse{
	public static int reverseNum(int n){
		int rev = 0;
		int rem;
		while(n != 0){
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
}
