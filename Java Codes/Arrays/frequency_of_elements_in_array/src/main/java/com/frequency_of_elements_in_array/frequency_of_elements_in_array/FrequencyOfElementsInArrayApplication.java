package com.frequency_of_elements_in_array.frequency_of_elements_in_array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class FrequencyOfElementsInArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrequencyOfElementsInArrayApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		numberFreqFinder(arr);
		sc.close();
	}

	public static void numberFreqFinder(int[] arr){
		boolean[] visited = new boolean[arr.length];
		for(int i=0;i<arr.length;i++){
			if(!visited[i]){
				int count = 0;
				for(int j=0;j<arr.length;j++){
					if(arr[i]==arr[j]){
						count++;
						visited[j] = true;
					}
				}
				System.out.println(arr[i]+" occurs : "+count+" time"+ (count>1?"s":""));
			}
		}
	}
}
