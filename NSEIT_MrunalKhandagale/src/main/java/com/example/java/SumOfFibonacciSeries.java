package com.example.java;

import java.util.Scanner;

public class SumOfFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=1;
        int num3=0;
        int sum=0;
        System.out.println("Enter number");
        int number= sc.nextInt();

        for(int i=3;i<=number;i++){
            num3=num1+num2;
            num2=num3;
            num1=num2;
            sum=sum+num3;
        }
        System.out.println("Sum of fibonacci numbers is ");
        System.out.println(sum);
	}

}
