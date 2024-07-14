package com.abundant_num.abundant_num;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class AbundantNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbundantNumApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		isAbundant(num);
		sc.close();
	}

	public static int isAbundant(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=n/2;i++){
			if(n % i == 0){
				list.add(i);
			}
		}
		System.out.println(list);
		int sum = 0;
		for(int i=0;i<=list.size()-1;i++){
			sum = sum + list.get(i);
		}
		if(sum > n){
			System.out.println("The entered number is an abundant number");
		}
		else{
			System.out.println("The entered number is not an abundant number");
		}
		return sum;
	}
}
