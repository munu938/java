package day_3;
//it is java bean
public class Employee {
	
	//class is blueprint for object
	private  String employee_name;
	private  double employee_salary;
	private String employee_department;
	
	//constructor it is the same as methodbbut itdoes not return any thing explicitly but they are returning implicitly
	
	//default 
	public Employee() {
		
	}
	//if we arent creating any apramiterized constructor then their is no need to create default
	//but if we are creating any paramiterized constructor then we must have to create default one
	//parameter
		
			public Employee(String name, double salary, String department) {
		
		this.employee_name=name;
		this.employee_department=department;
		this.employee_salary=salary;
		
				
	}
	//copy
	
	
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public double getEmployee_salary() {
	return employee_salary;
}
public void setEmployee_salary(double employee_salary) {
	this.employee_salary = employee_salary;
}
public String getEmployee_department() {
	return employee_department;
}
public void setEmployee_department(String employee_department) {
	this.employee_department = employee_department;
}
}
