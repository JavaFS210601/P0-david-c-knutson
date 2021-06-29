package com.revature.models;

public class EmpSet 
{
	public int EmpSetId; /*we'll use this to uniquely identify each 
						EmpSet object  setting this to be public so 
						that we can set the id in the addEmpSet method*/
	int zip;
	String name;
	
	
	//no args constructor (chose constructor from super class)
	public EmpSet() 
	{
		super();
	
	}
	//all-args constructor (chose constructor from fields)
	public EmpSet(int EmpSetID, int zip, String name) 
	{
		super();
		this.EmpSetId = EmpSetID;
		this.zip = zip;
		this.name = name;

	
	}
	//all-args constructor - id (chose constructor from fields)
	public EmpSet(int zip, String name) 
	{
		super();
		//this.EmpSetId = EmpSetID;
		this.zip = zip;
		this.name = name;


	}


	@Override
	public String toString() {
		return "LegoSet [EmpSetId= " + EmpSetId + ", zip= " + zip + ", name=" + name + "]";
}


}
