package com.largest_element_in_array.largest_element_in_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class LargestElementInArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LargestElementInArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);
		int max=0;

		int arr[] = new int[5];
		System.out.println("Enter the array : ");

		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		//loop for finding the largest element in the array
			for(int j=0;j<arr.length;j++){
				max  = arr[0];
				if(arr[j]>max){
					max = arr[j];
				}
			}
		System.out.println("The entered array is : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Largest element in the array is : "+max);

		sc.close();
	}

}
