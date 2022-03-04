package com.example.java;

import java.util.Scanner;

public class DistanceBetweenTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter X1 Value");
        int x1=sc.nextInt();
        System.out.println("Enter Y1 Value");
        int y1=sc.nextInt();
        System.out.println("Enter X2 Value");
        int x2=sc.nextInt();
        System.out.println("Enter Y2 Value");
        int y2=sc.nextInt();

        double dis=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("Distance between the two points is");
        System.out.println(Math.round(dis));
        
	}
	

}
