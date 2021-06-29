package com.revature.daos;

import com.revature.models.EmpSet;



public class EmpCollection implements EmpCollectionInterface
	{
	EmpSet[] empSets = 
		{
			new EmpSet(1,11111,"Dave"),
			new EmpSet(2,22222,"Al"),
			new EmpSet(3,33333,"Sally"),
			new EmpSet(4,44444,"Julie")	
		};
	
//	@Override
	public EmpSet[] getAllEmpSets() 
		{
			return empSets;  // return entire array of EmpSets
		};
	
//	@Override
	public EmpSet getEmpSetById(int idInput) 
		{
			return empSets[idInput - 1]; //return the empset at index idInput - 1
		}

	 
//	@Override
	public void addEmpSet(EmpSet empSet,int EmpAction) // This takes a EmpSet object as a parameter
											//  menu will ask for inputs to construct the object
	{
		
		switch(EmpAction)
		{
			case 3: // add employees
			{
				EmpSet[] newArray = new EmpSet[empSets.length +1]; // a bigger array to add new EmpSet.
				for(int i = 0; i<empSets.length; i++) 
				{
					newArray[i] = empSets[i];
				}	
				empSet.EmpSetId = newArray.length; 
				newArray[empSets.length] = empSet;
				empSets = newArray;  //assign the new Array to the main Array we're using
				break;
	 		
			}
			
			case 4: // Update employee
			{
				EmpSet[] newArray = new EmpSet[empSets.length]; // same size array
				for(int i = 0; i<empSets.length; i++)
				{
					newArray[i] = empSets[i];
				}	
				empSet.EmpSetId = newArray.length; 
				newArray[empSets.length] = empSet;
				empSets = newArray;  //assign the new Array to the main Array we're using
				break;
	 		
			}
			
			case 5: // Delete employee
			{
				EmpSet[] newArray = new EmpSet[empSets.length]; // same size array 
				for(int i = 0; i<empSets.length; i++) 
				{
					newArray[i] = empSets[i];
				}	
				empSet.EmpSetId = newArray.length; 
				newArray[empSets.length] = empSet;
				empSets = newArray;  //assign the new Array to the main Array we're using
				break;
	 		
			}
			}
		
	}
	 
		
	}
	
	
	


