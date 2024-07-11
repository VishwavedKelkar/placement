package com.leap_year_or_not.leap_year_or_not;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class LeapYearOrNotApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeapYearOrNotApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a year : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			System.out.println(year +" is a leap year ");
		}
		else if (year % 4 == 0 &&  year % 100 != 0) {
			System.out.println(year +" is a leap year ");
		}
		else{
			System.out.println(year + " is not a leap year");
		}
			sc.close();
}
}
