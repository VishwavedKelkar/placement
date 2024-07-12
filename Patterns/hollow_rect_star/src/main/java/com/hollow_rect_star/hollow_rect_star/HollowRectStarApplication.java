package com.hollow_rect_star.hollow_rect_star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class HollowRectStarApplication {

	public static void main(String[] args) {
		SpringApplication.run(HollowRectStarApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sides of a rectangle : ");
		int len = sc.nextInt();
		int hght = sc.nextInt();
		System.out.println();

		for(int i=1;i<=len;i++){
			for(int j=1;j<=hght;j++){
				if(i==1 || i==len || j==1 || j== hght){
					System.out.print("*");
				}
				else	
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
