package com.revature.models;

import java.util.Scanner;

import com.revature.daos.EmpCollection;

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
			System.out.println("Choose the number of your choice  ");
		
			Scanner scan = new Scanner(System.in);
		
			int input = scan.nextInt();
			int EmpAction;
			
			switch(input) 
			
			{
				case 1: // display all employees
				{
					System.out.println("");
					System.out.println("Display all employees");
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
					System.out.println("Enter employee ID");
					System.out.println("");
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
					System.out.println("");
					System.out.println("Exit");
					System.out.println("");
					System.out.println("Good Bye");
					displayMenu = false;
					break;
				}
				
				
				
				
				
			}
		}
		
	}

	
	
	
}
