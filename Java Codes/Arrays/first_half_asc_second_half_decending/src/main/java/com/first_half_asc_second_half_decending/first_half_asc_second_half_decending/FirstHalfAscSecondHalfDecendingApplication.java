package com.first_half_asc_second_half_decending.first_half_asc_second_half_decending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class FirstHalfAscSecondHalfDecendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstHalfAscSecondHalfDecendingApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		int a;
		for(a=0;a<size;a++){
			arr[a] = sc.nextInt();
		}
		int temp;
		for(int i = 0;i<size-1;i++){
			for(int j=i+1;j<size/2;j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int i = size/2;i<size;i++){
			for(int j=i+1;j<size-1;j++){
				if(arr[j] < arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
