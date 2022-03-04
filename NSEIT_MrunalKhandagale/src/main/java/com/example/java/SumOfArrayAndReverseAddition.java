package com.example.java;

import java.util.Scanner;

public class SumOfArrayAndReverseAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int n=6;
        int [] arr = new int[n];
        int sum=0;
        int rev=0;
        int rem;
        System.out.println("enter numbers");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
            if(arr[i]>number){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);

        while(sum>0){
            rem=sum%10;
            rev=(rev*10)+rem;
            sum=sum/10;

        }
        System.out.println("Reverse number is "+rev);
	}

}
