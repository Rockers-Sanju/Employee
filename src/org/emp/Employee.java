package org.emp;

public class Employee {
private void empId() {
	System.out.println("0291");
}	
	private void empName() {
		System.out.println("sanjeev");
}
	private void empDob() {
		System.out.println("05.08.1994");
}
	private void empPhone() {
		System.out.println("9094006642");
}	
	private void empEmail() {
		System.out.println("sanju.dntopn@gmail.com");
}	
	private void empAddress() {
		System.out.println("chennai");
}	
	public static void main(String[] args) {
		
	//ClassName Objname = new ClassName();

	Employee e = new Employee();
	
	//method call - ojectName.methodName();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
	
	}
	
}

