package com.smallest_num_in_array.smallest_num_in_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SmallestNumInArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallestNumInArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int size = sc.nextInt();
		int small = 0;
		int[] arr = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0 ; i<arr.length ; i++){
			small = arr[0];
			if(arr[i] < small){
				small = arr[i];
			}
		}

		System.out.println("The entered array is : ");
		for(int i=0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("The smallest element from the above array is : "+small);
		sc.close();
	}

}
