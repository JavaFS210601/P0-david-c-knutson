package com.revature.daos;

import com.revature.models.EmpSet;
 


public interface EmpCollectionInterface 

{

	EmpSet[] getAllEmpSets();  // shows all employees
	
	EmpSet getEmpSetById (int idInput);  // will return one employee
	
	void addEmpSet(EmpSet empSet , int EmpAction); // will add one employee
	
	//void UpdateEmpSet(EmpSet empSet, int ); // will add one employee	
}

//LegoSet[] getAllLegoSets(); //this method will show the user all LegoSets in the database
//
//LegoSet getLegoSetById(int idInput); //this method will return one LegoSet of a given id 
//
//void addLegoSet(LegoSet legoSet); //t