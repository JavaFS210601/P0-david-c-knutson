package com.revature;

import com.revature.models.Menu;


//private static final Logger Log = LogManager.getLogger(Launcher.class);

//CLI (command line interface) application
//The user can enter inputs into a menu to create,read,update or delete and employee.
public class Launcher 
	{
		
	public static void main(String[] args) 
		{	 
			Menu menu = new Menu();   
			menu.display();  
		}
	
	}