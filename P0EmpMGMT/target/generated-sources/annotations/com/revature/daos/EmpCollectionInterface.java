package com.revature.daos;

import com.revature.models.EmpSet;



public interface EmpCollectionInterface 

{

	EmpSet[] getAllEmpSets();  // shows all employees
	
	EmpSet getEmpSetById (int idInput);  // will return one employee
	
	void addEmpSet(EmpSet empSet , int EmpAction); // will add one employee
}
