package com.revature.models;
// daves employee
public class Employee {

	private int employee_id;
	private String f_name;
	private String l_name;
	private String address;
	private String city;
	private String state;
	private String zip;
	 
	private String hire_date;
	private int role_id;

	
	//boilerplate code---------------------------------------------------------------- alt + shift + s (or click the source tab)
	
	//no args constructor
	public Employee() {
		super();
	 
	}

	//all args constructor
	public Employee(int employee_id, String f_name, String l_name,String address, String city, String state, String zip, String hire_date, int role_id) {
		super();
		this.employee_id = employee_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	
		this.hire_date = hire_date;
		this.role_id = role_id;
	}

	//all args minus employee_id constructor, so we can insert new employees
	public Employee(String f_name, String l_name, String address, String city, String state, String zip, String hire_date, int role_id) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
				
		this.hire_date = hire_date;
		this.role_id = role_id;
	}

	//so we can print out each object's fields instead of the object's memory location
	@Override
	public String toString() {
//		return "Employee [employee_id=" + employee_id + ", f_name=" + f_name + ", l_name=" + l_name + ", hire_date=" +
//				", address= " + address + ", city= " + city + ", state= " + state + ", zip= " + zip +
//				 hire_date + ", role_id=" + role_id + "]";
		return "Student # " + employee_id + " " + l_name + "," + f_name + " joined on " + hire_date + " subject # = " + role_id;
//		", address= " + address + ", city= " + city + ", state= " + state + ", zip= " + zip +
//		 hire_date + ", role_id=" + role_id + "]";
		
		
		
	}

	//assigns each object a hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employee_id;
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());		
 		
		result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + role_id;
		return result;
	}

	//lets us compare objects by their hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employee_id != other.employee_id)
			return false;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (address == null) {
		if (other.address != null)
			return false;
		} else if (!f_name.equals(other.address))
			return false;
	
		if (city == null) {
		if (other.city != null)
			return false;
		} else if (!f_name.equals(other.city))
		return false;		
		
		if (state == null) {
		if (other.state != null)
			return false;
		} else if (!f_name.equals(other.state))
		return false;		
		
		if (zip == null) {
		if (other.zip != null)
			return false;
		} else if (!f_name.equals(other.zip))
		return false;		
 
		if (hire_date == null) {
			if (other.hire_date != null)
				return false;
		} else if (!hire_date.equals(other.hire_date))
			return false;
		if (l_name == null) {
			if (other.l_name != null)
				return false;
		} else if (!l_name.equals(other.l_name))
			return false;
		if (role_id != other.role_id)
			return false;
		return true;
	}

	
	//need these to access our fields because we made them private
	public int getEmployee_id() {
		return employee_id;
	}
	
	//we can comment this out if we want, we won't ever be setting employee id
//	public void setEmployee_id(int employee_id) {
//		this.employee_id = employee_id;
//	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	public String getAddress() {
	return address;
	}

	public void setAddress(String address) {
	this.address = address;
	}
	
	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}
	
	public String getState() {
	return state;
	}

	public void setState(String state) {
	this.state = state;
	}
	
	public String getZip() {
	return zip;
	}

	public void setZip(String zip) {
	this.zip = zip;
	}
	

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
	
}
