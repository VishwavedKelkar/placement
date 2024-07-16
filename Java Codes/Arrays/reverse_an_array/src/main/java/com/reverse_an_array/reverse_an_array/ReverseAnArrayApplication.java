package com.reverse_an_array.reverse_an_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class ReverseAnArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseAnArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		reverseArray(arr, size);
		sc.close();
	}

	public static void reverseArray(int[] arr,int size){
		int[] arr1 = new int[size];
		for(int i=0;i<size;i++){
			arr1[i] = arr[size-i-1];
		}
		System.out.println("The reverese array is : ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}

}
