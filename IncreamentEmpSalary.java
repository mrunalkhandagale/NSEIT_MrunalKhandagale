package com.assignment.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;

class Employee{
	String name;
	double sal;
	
	Employee(String name, double sal){
		this.name=name;
		this.sal=sal;
		
	}
	public String toString() {
		
		return name+":"+sal;
		
	}

	
}



public class IncreamentEmpSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		employee(al);
		System.out.println("Before Increamented: "+al);
		Predicate<Employee> p1=emp->emp.sal<30000;
		Function<Employee,Employee> f1=emp->{
			emp.sal=emp.sal+2500;
			return emp;
		};
		ArrayList<Employee> al1=new ArrayList<Employee>();
		for(Employee e:al) {
			if(p1.test(e)) {
				al1.add(f1.apply(e));
			}
			
		}
		System.out.println("Increamented salary is: "+al1);
	}

	private static void employee(ArrayList<Employee> al) {
		// TODO Auto-generated method stub
		al.add(new Employee("amar",20000));
		al.add(new Employee("sanket",25000));
		al.add(new Employee("sachin",35000));
		al.add(new Employee("ankit",12000));
	}	

}
