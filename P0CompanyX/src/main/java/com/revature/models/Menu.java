package com.revature.models;
// daves menu
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.EmployeeDao;
import com.revature.daos.RoleDao;

public class Menu {
	
	//we need to instantiate the dao classes to use their methods in this class
	EmployeeDao ed = new EmployeeDao();
	RoleDao rd = new RoleDao();
	
	//All of the menu display options and control flow are contained in this method
	public void display() {
		
		boolean displayMenu = true; //this toggles whether the menu continues after user input
		Scanner scan = new Scanner(System.in); //Scanner object to parse user input		
		final Logger log = LogManager.getLogger(Menu.class);
		
		//greeting
		System.out.println("*====================================================*");
		System.out.println("College X Technical Student Assistance System");
		System.out.println("*====================================================*");
		
		
		//display the menu options as long as displayMenu is true
		while(displayMenu) {
			
			System.out.println("----------------");
			System.out.println("CHOOSE AN OPTION");
			System.out.println("----------------");
			
			
			System.out.println("  ");
			System.out.println("Welcome to Technical Student Assistance System");
			System.out.println("  ");
			System.out.println("1. Display all student assistants");
			System.out.println("2. Find a student by subject ");
			System.out.println("3. Add a new student assistant");
			System.out.println("4. Change students subject");
			System.out.println("5. Delete an student");
			System.out.println("6. Student subject description");
			System.out.println("7. Change student compensation ");	
			System.out.println("8. Exit system");
			System.out.println("  ");
			System.out.print("Input the number of your selection ---> ");
		
			//Scanner scan = new Scanner(System.in);
		
			String input = scan.nextLine().toLowerCase();			
			//int EmpAction; 
	 	
			//menu options
//			System.out.println("employees -> show all employees");
//			System.out.println("employeeByTitle -> get employees of a certain title"); //this is new as of Saturday - requires join!
//			System.out.println("add -> add a new employee ");
//			System.out.println("changerole -> change an employee's role");
//			System.out.println("fire -> fire an employee");
//			System.out.println("roleInfo -> get information about a certain role"); //this is new as of Saturday
//			System.out.println("changeSalary -> change a role's salary"); //this is new as of Saturday
//			System.out.println("exit -> exit the application");
			
			
			//parse the user input after they choose a menu option, and move to the next line
			//String input = scan.nextLine().toLowerCase();
			
			
			//switch statement that takes the user input, and does some logic depending on that input
			switch(input) {
			
			case "1": {    // lists all employees
				System.out.println("  ");
				log.info("User selected all students");
				System.out.println("  ");
				System.out.println("Collecting Students");
				System.out.println("  ");
				//List of Employees that gets populated by the getEmployees method in our EmployeeDao
				List<Employee> employees = ed.getEmployees(); 
				
				//Print out each Employee from the List one by one for the user to see
				System.out.println("------------------------------------");
				for(Employee e : employees) {
					//a prettier way to return all employees (instead of relying on the toString method, seen in the other cases)
					//making use of a getter and String concatenation
					System.out.println(e.getEmployee_id() + ") " + e.getF_name() + " " + e.getL_name() + ", joined on " + e.getHire_date());
				}
				System.out.println("------------------------------------");
				break;
			}
			
			case "2": {
				System.out.println("  ");
				log.info("User select searching subject");
				System.out.println("  ");
				//System.out.println("Enter Employee Role to Search: (Case Sensitive! e.g. \\\"Fry Cook\\\")");
				System.out.println("Technical Student Assistance Subject List");
				System.out.println("  ");
				System.out.println("1. Managing Director");
				System.out.println("2. Java");
				System.out.println("3. HTML");
				System.out.println("4. Python");
				System.out.println("5. SQL");
				System.out.println("6. C++");
				System.out.println("7. R");
				System.out.println("  ");
				System.out.print("Input the number --> ");
				String roleChoice = scan.nextLine();
				String roleInput = null;
				switch(roleChoice) {
				case "1": {
					roleInput = "Managing Director";
					break;
				}
				
				case "2": {
					roleInput = "Java";
					break;
				}
				case "3": {
					roleInput = "HTML";
					break;
				}
				case "4": {
					roleInput = "Python";
					break;
				}
				case "5": {
					roleInput = "SQL";
					break;
				}
				case "6": {
					roleInput = "C++";
					break;
				}
				case "7": {
					roleInput = "R";
					break;
				}
				 
				default: {
					System.out.println("================!!!!!!!================");
					log.warn("input an incorrect number");
			
					System.out.println("Please enter a number from the list"); //in case user input doesn't match any cases
					System.out.println("================!!!!!!!================");
					break;
				}
				}
				
				//String roleInput = scan.nextLine(); //get user's input for Role to search by

				List<Employee> employees = ed.getEmployeesByRole(roleInput); //get the List of Employees from the dao
				System.out.println("--------------------------------------------------------");
				for(Employee e : employees)
				{
					System.out.println(e); //print them out one by one via the enhanced for loop
				}
				System.out.println("--------------------------------------------------------");
				break;				
				
			}
			
			case "3": {
				System.out.println("  ");
				log.info("User select adding a student assistant");
				System.out.println("  ");
				//we need to prompt the user for the employee's name, and their role id
				//we'll have to come up with some functionality to get the current date for the hire_date field
				System.out.print("Enter Student's First Name --> ");
				String f_name = scan.nextLine();
				System.out.println("  ");
				System.out.print("Enter Employee Last Name --> ");
				String l_name = scan.nextLine();
				System.out.println("  ");
				System.out.print("Enter Student's Address --> ");
				String address = scan.nextLine();
				System.out.println("  ");
				System.out.print("Enter Student's City --> ");
				String city = scan.nextLine();
				System.out.println("  ");
				System.out.print("Enter Student's State --> ");
				String state = scan.nextLine();
				System.out.println("  ");
				System.out.print("Enter Student's Zip --> ");
				String zip = scan.nextLine();
				System.out.println("  ");
				System.out.println("Technical Student Assistance Subject List");
				System.out.println("  ");
				System.out.println("1. Managing Director");
				System.out.println("2. Java");
				System.out.println("3. HTML");
				System.out.println("4. Python");
				System.out.println("5. SQL");
				System.out.println("6. C++");
				System.out.println("7. R");
				System.out.println("  ");
				System.out.print("Input the number --> ");
				 
				 
				int roleId = scan.nextInt();
				scan.nextLine(); //because without any nextLine, your enter keystroke will be grabbed as the next input
				System.out.println("  ");
				//Given all this information, we'll create a new Employee object to send to a DAO method
				//This is using the all-args minus employee_id constructor
				Employee newEmployee = new Employee(f_name, l_name,address,city,state,zip,"placeholder", roleId); //placeholder for hire_date, will be changed
				
				//Put the new Employee into the addEmployee() method in the EmployeeDao
				ed.addEmployee(newEmployee);
				
				break;
			}
			
			case "4" : {
				System.out.println("  ");
				log.info("User select changing an student assistants Subject");
				System.out.println("  ");
				System.out.println("These are the students subjects ");
				System.out.println("  ");
				//this is using the already existing getEmployees() method
				List<Employee> employees = ed.getEmployees(); 
				
				//Print out each Employee from the List one by one for the user to see
				for(Employee e : employees) {
					System.out.println(e);
				}
				
				System.out.println("--------------------------------------------------------");
				
				System.out.print("Enter the ID of the student who's subject is changing --> ");
				int idInput = scan.nextInt(); //the user enters the ID of the employee to change the role of
				scan.nextLine();
				System.out.println("--------------------------------------------------------");
				System.out.println("Technical Student Assistance Subject List");
				System.out.println("  ");
				System.out.println("1. Managing Director");
				System.out.println("2. Java");
				System.out.println("3. HTML");
				System.out.println("4. Python");
				System.out.println("5. SQL");
				System.out.println("6. C++");
				System.out.println("7. R");
				System.out.println("  ");
				System.out.println("Input the number --> ");
				 
				 
				int roleInput = scan.nextInt();
				scan.nextLine();
				
				ed.changeRole(idInput, roleInput); //we're going to supply the user inputs as arguments to this DAO method
				
				break;
			}
			
			case "5": {
				System.out.println("  ");
				log.info("User select deleting an student assistant");
				System.out.println("  ");
				System.out.println("These are the student assistants on staff.  Who would you like to remove:");
				System.out.println("  ");
				//this is using the already existing getEmployees() method
				List<Employee> employees = ed.getEmployees(); 
				System.out.println("---------------------------------------------------------------");
				//Print out each Employee from the List one by one for the user to see
				for(Employee e : employees) {
					System.out.println(e);
				}
				System.out.println("---------------------------------------------------------------");
	
				
				System.out.print("Enter the student id of the student to remove --> ");
				int idInput = scan.nextInt();
				scan.nextLine();
				System.out.println("  ");
				//example of some foolproofing, in this case we don't want employees with id = 1 (aka managers) 
				if(idInput == 1) {
					System.out.println("  ");
					System.out.println("================!!!!!!!================");
					System.out.println("can't remove Managing Director!!!");
					System.out.println("------------------------------");
					log.warn("User attempted to delete a Managing Director.  Only VP can remove");
					System.out.println("================!!!!!!!================");
					System.out.println("  ");
				} else {
					ed.removeEmployee(idInput);		
				}
				
				break;
			}
			
			case "6": {
				System.out.println("  ");
				log.info("User select subject description");
				System.out.println("  ");
				System.out.println("Which subject would you like to view");
				System.out.println("  ");
				System.out.println("Technical Student Assistance Subject List");
				System.out.println("  ");
				System.out.println("1. Managing Director");
				System.out.println("2. Java");
				System.out.println("3. HTML");
				System.out.println("4. Python");
				System.out.println("5. SQL");
				System.out.println("6. C++");
				System.out.println("7. R");
				System.out.println("  ");
				System.out.print("Input the number --> ");
				String titleInput = scan.nextLine();
				System.out.println("  ");
//				System.out.println("Enter the subject to change: ");
//				System.out.println("  ");
				 
//				String roleChoice = scan.nextLine();
				System.out.println("  ");
				 
			
				String roleInput = null;
				switch(titleInput) {
				case "1": {
					roleInput = "Managing Director";
					break;
				}
				case "2": {
					roleInput = "Java";
					break;
				}
				case "3": {
					roleInput = "HTML";
					break;
				}
				case "4": {
					roleInput = "Python";
					break;
				}
				case "5": {
					roleInput = "SQL";
					break;
				}
				case "6": {
					roleInput = "C++";
					break;
				}
				case "7": {
					roleInput = "R";
					break;
				}
				 
				default: {
					System.out.println("================!!!!!!!================");
					log.warn("input an incorrect number");
					System.out.println("Please enter a number from the list"); //in case user input doesn't match any cases
					System.out.println("================!!!!!!!================");
					break;
				}
				}
				//String titleInput = scan.nextLine();
				
				List<Role> returnedRole = rd.getRoleByTitle(roleInput);
				System.out.println("--------------------------------------------------------");
				for (Role r : returnedRole) {
					System.out.println(r);
				}
				System.out.println("--------------------------------------------------------");
				System.out.println("  ");
				break;
			}
			
			case "7": {
				System.out.println("  ");
				log.info("User selected student assistant compensation change");
				System.out.println("  ");
				
				System.out.println("Technical Student Assistance Subject List");
				System.out.println("  ");
				System.out.println("1. Managing Director");
				System.out.println("2. Java");
				System.out.println("3. HTML");
				System.out.println("4. Python");
				System.out.println("5. SQL");
				System.out.println("6. C++");
				System.out.println("7. R");
				System.out.println("  ");
				System.out.println("Input the number  ");
				System.out.println("  ");
				System.out.print("Enter the subject to change compensation for --> ");
				System.out.println("  ");
				//String titleInput = scan.nextLine();
				String roleChoice = scan.nextLine();
				//System.out.println("  ");
				System.out.print("Enter New compensation amount --> ");
				System.out.println("  ");
				int salaryInput = scan.nextInt();
				scan.nextLine(); 
				System.out.println("  ");
				String roleInput = null;
				switch(roleChoice) {
				case "1": {
					roleInput = "Managing Director";
					break;
				}
				case "2": {
					roleInput = "Java";
					break;
				}
				case "3": {
					roleInput = "HTML";
					break;
				}
				case "4": {
					roleInput = "Python";
					break;
				}
				case "5": {
					roleInput = "SQL";
					break;
				}
				case "6": {
					roleInput = "C++";
					break;
				}
				case "7": {
					roleInput = "R";
					break;
				}
				 
				default: {
					System.out.println("================!!!!!!!================");
					log.warn("input an incorrect number");
					System.out.println("Please enter a number from the list"); //in case user input doesn't match any cases
					System.out.println("================!!!!!!!================");
					break;
				}
				}
				 
//				System.out.println("Enter subject to change: ");
//				System.out.println("  ");
//				String titleInput = scan.nextLine();
//				
//				System.out.println("Enter New compensation amount:");
//				System.out.println("  ");
//				int salaryInput = scan.nextInt();
//				scan.nextLine(); 
				
				rd.updateRoleSalary(salaryInput, roleInput);
				System.out.println("--------------------------------------------------------");
				System.out.println(roleInput + " compensation has been changed to " + "$" + salaryInput);
				System.out.println("--------------------------------------------------------");
				break;
			}
			
			case "8": {
				System.out.println("  ");
				
				log.info("System Exit");
				log.info("Good Bye");
				System.out.println("==============================  ");
				System.out.println("You have exited the system");
				System.out.println("==============================  ");
				System.out.println("Good Bye  ");
				System.out.println("==============================  ");
				System.out.println("  ");
				displayMenu = false;
				break;
			}
			
			default: {
				System.out.println("================!!!!!!!================");
				log.warn("User attempted to insert a wrong number");
				System.out.println("Please enter a number from the list"); //in case user input doesn't match any cases
				System.out.println("================!!!!!!!================");
				break;
			}
			
				
			}
			

			
			
		}
		
		
	}
	
	
}
