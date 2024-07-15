package com.smallest_and_largest_num_in_array.smallest_and_largest_num_in_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SmallestAndLargestNumInArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallestAndLargestNumInArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the array : ");
		int[] arr = new int[size];
		for(int i=0 ; i < arr.length;i++){
			arr[i] = sc.nextInt();
		}

		//smallest number 
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		//largest number 
		int max = arr[0];
		for(int i=0 ; i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		//Entered Array
		System.out.println("The entered array is : ");
		for(int i=0 ; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		//output
		System.out.println();
		System.out.println("The smallest number in the array is : "+min+" and the largest number is : "+max);
		sc.close();
	}
}
