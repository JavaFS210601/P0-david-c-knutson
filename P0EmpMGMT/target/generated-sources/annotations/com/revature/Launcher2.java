package com.revature;

import com.revature.models.Menu2;


//private static final Logger Log = LogManager.getLogger(Launcher.class);

//CLI (command line interface) application
//The user can enter inputs into a menu to create,read,update or delete and employee.
public class Launcher2 
	{
		
	public static void main(String[] args) 
		{	 
			Menu2 menu = new Menu2();   
			menu.display();  
		}
	
	}