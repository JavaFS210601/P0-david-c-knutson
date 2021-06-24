package com.revature.models;

import com.revature.throwables.MyCheckedException;
import com.revature.throwables.MyError;

import java.util.Scanner;

import com.revature.daos.EmpCollection;
import com.revature.throwables.MyCheckedException;
import com.revature.throwables.MyUncheckedException;

public class Menu {
	
	EmpCollection ec = new EmpCollection(); // New employee collection
	
	

	public void display() 
		{
		
		boolean displayMenu = true; //this will toggle whether the menu 
									//options continue to display to the user 
		while(displayMenu) 
		{
			System.out.println("  ");
			System.out.println("Welcome to Employee Management System");
			System.out.println("  ");
			System.out.println("1. Display all employees");
			System.out.println("2. Find an employee");
			System.out.println("3. Add a new employee");
			System.out.println("4. Update an employee");
			System.out.println("5. Delete an employee");
			System.out.println("6. exit");
			System.out.println("  ");
			System.out.print("Choose the number of your choice----> ");
		
			Scanner scan = new Scanner(System.in);
		
			int input = scan.nextInt();
			int EmpAction;
			
//			try { //this will TRY a block of code that may or may not throw an Exception
//				System.out.println("Try block is starting...");
//				throwChecked();
//			} catch(MyUncheckedException e) {
//				System.out.println("I wont run - I can only catch MyUncheckedException");
//			} catch(MyCheckedException e) {
//				System.out.println("Hello from the catch block!");
//				System.out.println("I catch MyCheckedExceptions");
//			} catch (Exception e) {
//				System.out.println("I could've caught any old Exception!");
//				System.out.println("This is good practice for catching anything you may not have accounted for");
//			} finally {
//				System.out.println("Hello from the finally block! I will ALWAYS run!");
//			}
//			
			
			
			
			
			
			
			switch(input) 
			
			{
				case 1: // display all employees
				{
					//System.out.println(" \n\n\n\n\n\n");
					System.out.println("");
					System.out.println("Employees ");
					EmpSet[] empArray = ec.getAllEmpSets(); //get all EmpSets
					for(EmpSet emps : empArray)
					{
						System.out.println(emps); 
					}

					break;
				}
						
				case 2: // find an employee
				{
					System.out.println("");
					System.out.println("Find an employee");
					System.out.println("");
					System.out.print("Enter employee ID -----> ");
					//System.out.println("");
					int idInput = scan.nextInt(); // take employee ID 
					scan.nextLine();
					EmpSet empSet = ec.getEmpSetById(idInput); // find employee 
					System.out.println(empSet); // print employee info					
					break;
				}
				
				case 3: // Add an employee
				{
					EmpAction = 3;
					System.out.println("");
					System.out.println("Add a new employee");
					System.out.println("");
					System.out.println("What is the employee's zip code");
					System.out.println("");
					int zipInput = scan.nextInt();
					scan.nextLine();
					System.out.println("What is the employee's name");
					System.out.println("");
					String nameInput = scan.nextLine();
					ec.addEmpSet(new EmpSet (zipInput,nameInput),EmpAction);  // add to Emp Set
					System.out.println(nameInput + " EmpSet with " + zipInput + " zip added!");
					
					break;
				}
				 
				case 4: // Update an employee
				{
					EmpAction = 4;
					System.out.println("");
					System.out.println("Update an employee");
					System.out.println("");
					System.out.println("What is the employee's zip code");
					System.out.println("");
					int zipInput = scan.nextInt();
					scan.nextLine();
					System.out.println("What is the employee's name");
					System.out.println("");
					String nameInput = scan.nextLine();
					ec.addEmpSet(new EmpSet (zipInput,nameInput),EmpAction);  // update to Emp Set
					System.out.println(nameInput + " EmpSet with " + zipInput + " zip added!");
					
					break;
				}
				case 5: 
				{
					System.out.println("");
					System.out.println("Delete an employee");
					break;
				}
				case 6: 
				{
				 
					//System.out.println(" \n\n\n\n\n\n");
					//System.out.println("Exit");
					System.out.println("");
					System.out.println("Good Bye");
					displayMenu = false;
					break;
				}
				
				
				
				
				
			}
		}
		
	}

	public static void throwError() throws MyError {
		System.out.println("I'm going to throw an error!!!");
		throw new MyError("Error Thrown :(");
	}
	
	public static void throwChecked() throws MyCheckedException {
		System.out.println("I'm going to throw a Checked Exception!!!");
		throw new MyCheckedException();
	}
	
	public static void throwUnchecked() throws MyUncheckedException {
		System.out.println("I'm going to throw an Unchecked Exception!!!");
		throw new MyUncheckedException();
	}
	
	
}
