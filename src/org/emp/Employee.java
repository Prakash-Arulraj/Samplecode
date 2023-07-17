package org.emp;

public class Employee {
	
	public void empId(int id) {
		
		System.out.println("id:"+id);
		
	}
	
	private void branch() {
		System.out.println("This is Prakash Branch");

	}
	
	public static void main(String[] args) {
		Employee l = new Employee();
		l.empId(12345);
	}

}
