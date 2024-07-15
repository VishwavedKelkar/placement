package com.second_smallest_number_in_array.second_smallest_number_in_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.*;

@SpringBootApplication
public class SecondSmallestNumberInArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSmallestNumberInArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		secSmallestNum(arr);
		sc.close();
	}

	public static Array[] secSmallestNum(int[] arr){
		int min = arr[0];
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] < min)
				min = arr[i];
				index = i;
		}
		System.out.println("The smallest number is : "+min);

		int[] new_array = new int[arr.length-1];
		
		for(int i=0,k=0;i<arr.length;i++){
			if(i!=index){
				new_array[k] = arr[i];
				k++;
			}
		}
		//System.out.println("The new array is : ");
		for(int i=0;i<new_array.length;i++)
			System.out.print(" "+new_array[i]);
		//}

		//second smallest number 
		int min2 = new_array[0];
		for(int i=0;i<new_array.length;i++){
			if(new_array[i] < min2)
				min2 = new_array[i];
		}
		System.out.println();
		System.out.println("The second smallest number is : "+min2);
		
		return null;
	}

}
