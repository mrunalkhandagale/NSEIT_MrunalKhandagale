package com.assignment.java;
import java.util.function.*;
import java.util.Scanner;


public class CountRemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();

		Function<String,Integer> f1= s1->s1.length()-s1.replaceAll(" ", "").length();
		Integer i1=f1.apply(str);
		System.out.println("Total White space is:  "+i1);
	}

}
