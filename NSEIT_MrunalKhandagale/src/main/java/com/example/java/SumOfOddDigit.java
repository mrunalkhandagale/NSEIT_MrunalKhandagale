package com.example.java;

import java.util.Scanner;

public class SumOfOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd number is "+sum);
        
	}

}
