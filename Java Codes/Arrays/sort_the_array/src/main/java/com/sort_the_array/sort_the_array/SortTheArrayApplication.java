package com.sort_the_array.sort_the_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SortTheArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortTheArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		sortArray(arr);
	}

	public static void sortArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The sorted array is : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

