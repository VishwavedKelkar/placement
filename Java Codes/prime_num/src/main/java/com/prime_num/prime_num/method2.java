package com.prime_num.prime_num;
import java.util.Scanner;
import java.lang.Math;

public class method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not prime number");
        }
    }

    static boolean isPrime(int n){
        if(n<=1)
            return false;
        else if (n == 2 )
            return true;
        else if( n % 2 == 0 )
            return false;

        for(int i=3 ; i<Math.sqrt(n);i+=2){
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
