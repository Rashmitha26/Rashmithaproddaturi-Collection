package com.rashmitha.collections;

public class Details
{
	String name;
	long salary;
	Details(String name,long salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		String res="Name is: "+this.name+" Salary is: "+this.salary;
		return res;
	}
}
