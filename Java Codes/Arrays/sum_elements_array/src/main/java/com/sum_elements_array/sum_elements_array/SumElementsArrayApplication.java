package com.sum_elements_array.sum_elements_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SumElementsArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumElementsArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();

		System.out.println("Enter the array elements : ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The sum of the array elements is : "+sumOfElementsInArray(arr));

		sc.close();
	}

	public static int sumOfElementsInArray(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		return sum;
	}

}
