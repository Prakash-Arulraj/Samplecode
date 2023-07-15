package org.emp;

public class Employee {
	
	public void empId(int id) {
		
		System.out.println("id:"+id);
		
	}
	public static void main(String[] args) {
		Employee l = new Employee();
		l.empId(12345);
	}

}
