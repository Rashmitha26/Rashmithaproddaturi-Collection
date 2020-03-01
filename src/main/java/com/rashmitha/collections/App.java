package com.rashmitha.collections;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
    	MyCollection myCollection=new MyCollection();
    	System.out.println("eneter number of employees(>10)");
    	int number=scanner.nextInt();
    	System.out.println("enter details");
    	for(int i=0;i<number;i++) {
    		String name=scanner.next();
    		long sal=scanner.nextLong();
    		Details details=new Details(name,sal);
    		myCollection.add(details);
    	}
        
        char select='y';
        while(select=='y') {
        	System.out.println("Enter operation to be performed.\n1. Add 2. Remove 3. Fetch 4. Print");
        	int option=scanner.nextInt();
        	switch(option) {
        	case 1:System.out.println("Enter name and salary of employee");
        			String name=scanner.next();
        			long sal=scanner.nextLong();
        			myCollection.add(new Details(name,sal));
        			break;
        	case 2:System.out.println("Enter the index at which the object should be removed");
        			int n=scanner.nextInt();
        			myCollection.delete(n);
        			break;
        	case 3:System.out.println("Enter the index at which details are to be fetched");
        			int n1=scanner.nextInt();
        			Details fetched=myCollection.get(n1);
        			if(fetched!=null) System.out.println(myCollection.get(n1));
        			break;
        	case 4:myCollection.print();
        			break;
        	default:System.out.println("Enter valid option");
        			break;
        	}
        	System.out.println("Do you want to continue (y/n)");
        	select=scanner.next().charAt(0);
        }
        scanner.close();
    }
}
