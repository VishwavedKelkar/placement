package com.perfect_square.perfect_square;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class PerfectSquareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfectSquareApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if(isPerfectSquare(num))
			System.out.println("It is a perfect square");
		else	
			System.out.println("It is not a perfect square");

		sc.close();
	}

	static boolean isPerfectSquare(int n){


		if(n >= 0){
			int sqreroot = (int)Math.sqrt(n);
			return (sqreroot*sqreroot==n);
		}
		return false;

	}

}
