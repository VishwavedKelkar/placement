package com.sum_of_digits_of_num.sum_of_digits_of_num;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication


class sum_of_digits_of_num{
	public static int sum(int n){
		int sum = 0;
		while(n>0){
			int rem = n%10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}
}

public class SumOfDigitsOfNumApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SumOfDigitsOfNumApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		if(num == 0 ){
			System.out.println("Sum of digits of 0 is 0");
		}
		int result = sum_of_digits_of_num.sum(num);
		System.out.println("The addition of the digits of the number "+num+" is "+result);

		sc.close();

	}
}

