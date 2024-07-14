package com.strong_number.strong_number;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class StrongNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrongNumberApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		Strong.isStrongNum(num);

		sc.close();
	}
}

class Strong{
	public static int isStrongNum(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int temp = n;
		while(temp>0){
			int rem = temp%10;
			list.add(rem);
			temp = temp/10;
			}

		for(int i=0 ; i<list.size();i++){
			int fact = 1;
			for(int j=1;j<=list.get(i);j++){
				fact = fact*j;
			}
			sum = sum + fact;
		}
		if(sum == n){
			System.out.println("Strong Number");
		}
		else{
			System.out.println("Not a Strong Number");
		}
		return sum;

//		int d1 = n % 10;
//		int n1 = n / 10;
//		int d2 = n1 % 10;
//		int n2 = n1 / 10;
//		int d3 = n2 % 10;
//
//		if(Factorial(d3)+Factorial(d2)+Factorial(d1) == n){
//			System.out.println("Strong Number");
//		}
//		else{
//			System.out.println("Not a Strong Number");
//		}
//
//		return 0;
//	}
//	public static int Factorial(int n){
//		if(n == 0 || n == 1){
//			return 1;
//		}
//		else{
//			return n * Factorial(n-1);
//		}
//	}
	}
}
