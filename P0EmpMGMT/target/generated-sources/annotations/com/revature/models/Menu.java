package com.revature.models;
// daves menu
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import com.revature.daos.EmployeeDao;
 
public class Menu {
	
	EmployeeDao ed = new EmployeeDao();
	
	//Menu display options
	public void display() {
		
		
		boolean displayMenu = true; //Main menu control
		final Logger log = LogManager.getLogger(Menu.class);
		
		//greeting
		System.out.println("*====================================================*");
		System.out.println("Company X Employee Management System");
		System.out.println("*====================================================*");
		
		
		// Main Menu Loop
		while(displayMenu) {
			 
			System.out.println(" ");
			
			
			//menu options
			System.out.println("1. Display Employees");
			System.out.println("2. Add a New Employee ");
			System.out.println("3. Update an employee");
			System.out.println("4. Delete an employeee");
			System.out.println("5. Exit");
			
			System.out.println("----------------");
			System.out.print("CHOOSE A NUMBER -> ");
			Scanner scan = new Scanner(System.in); //User input
			//int input = scan.nextInt();
			String input = scan.nextLine();
//			private static final Logger Log = LogManager.getLogger(Launcher.class);
//			log.info("add method is running!");
		
			//parse the user input after they choose a menu option, and move to the next line
			//String input = scan.nextLine().toLowerCase();
				
			//switch statement that takes the user input, and does some logic depending on that input
			switch(input) 
			{
			
			case "1": 
			{
				log.info("listing all employees"); 
				System.out.println("Company X Employee List  ");
				System.out.println(" ");
				//List of All Employee populated from getEmployee method in EmployeeDao
				List<Employee> employee = ed.getEmployee(); 
				
				//loop and print employee
				for(Employee e : employee) {
					System.out.println(e);
					//System.out.println(e.getEmployee_id()+ ") "+ e.getF_name() + " "+ e.getL_name());
					
				}
				
				break;
			}
			
			case "2": // Add a new employee
			{ 
				
				//Input the following  employee's information.
				
				System.out.println(" ");
				System.out.print("Enter Employee First Name -> ");
				String f_name = scan.nextLine();
				//System.out.println(" ");
				System.out.print("Enter Employee Last Name -> ");
				String l_name = scan.nextLine();
				//System.out.println(" ");
				System.out.print("Enter Employee Address -> ");
				String address = scan.nextLine();
				//System.out.println(" ");
				System.out.print("Enter Employee City -> ");
				String city = scan.nextLine();
				//System.out.println(" ");
				System.out.print("Enter Employee State -> ");
				String state = scan.nextLine();
				//System.out.println(" ");
				System.out.print("Enter Employee zip -> ");
				int zip = scan.nextInt();
				System.out.println(" ");
				System.out.println("1. CEO");
				System.out.println("2. Vice President ");
				System.out.println("3. Director");
				System.out.println("4. Supervisor");
				System.out.println("5. Grunt");
				System.out.println(" ");
				System.out.print("Enter Employee Role_id -> ");
				int roleId = scan.nextInt();
				scan.nextLine(); //because without any nextLine, your enter keystroke will be grabbed as the next input
				System.out.println(" ");
		 
				//System.out.println("Enter Role Id: 1)Manager 2)Fry Cook 3)Cashier 4)Marketing 5)Nepotism");
				//int roleId = scan.nextInt();
				//scan.nextLine(); //because without any nextLine, your enter keystroke will be grabbed as the next input
				
				//Send this employee information to create a new Employee object to send to a DAO method
				//This is using the all-args minus employee_id constructor
				Employee newEmployee = new Employee(f_name, l_name,address,city,state,zip, roleId);  
				
				//Put the new Employee into the addEmployee() method in the EmployeeDao
				ed.addEmployee(newEmployee);
				
				break;
			}
			
			case "3": // Update employees salary
			{
				
				System.out.println("Company X Employees ");
				
				//this is using the already existing getEmployee() method
				List<Employee> employee = ed.getEmployee(); 
				
				//Print out each Employee from the List one by one for the user to see
				for(Employee e : employee) {
					System.out.println(e);
				}
				
				System.out.println("----------------------------------------------------");	
				System.out.print("Enter employee ID -> ");
				int idInput = scan.nextInt();
				scan.nextLine();
				System.out.println(" ");
				System.out.print("Enter number of new role -> ");
				int roleInput = scan.nextInt();
				scan.nextLine();
				System.out.println(" ");
				ed.changeRole(idInput, roleInput); //we're going to supply the user inputs as arguments to this DAO method
				
				break;
			}
			
			case "4": // Delete an employee
			{
				log.warn(" You are about to remove this employee");
				System.out.println("Company X Employee list");
				
				//this is using the already existing getEmployee() method
				List<Employee> employee = ed.getEmployee(); 
				
				//Print out each Employee from the List one by one for the user to see
				for(Employee e : employee) {
					System.out.println(e);
				}
				
				System.out.println("------------------------------");
				
				System.out.println("Enter employee id to remove");

				int idInput = scan.nextInt();
				scan.nextLine();
				
				ed.removeEmployee(idInput);
				
				break;
			}
			
			case "5": {
				System.out.println(" ");
				System.out.println("You are exiting the program");
				displayMenu = false;
				break;
			}
			
			default: {
				log.warn(" User typed incorrect choice ");
				System.out.println("PLEASE CHOOSE A NUMBER FROM THE OPTIONS BELOW "); //in case user input doesn't match any cases
				System.out.println(" ");
				break;
			}
			
			
			
			}
			
		}
		
		
	}
	
	
}
