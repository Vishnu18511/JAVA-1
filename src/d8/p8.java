package d8;

import java.util.*;

class Employee {

	String name;
	String department;
	int salary;

	Employee(String name,String department,int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
		public String toString() {
			return name + " - " + department + " - " + salary;
		}
}

public class p8{
	
	public static void main(String[]args) {
		List<Employee>employee=Arrays.asList(
		new Employee("ravi","IT",60000),
		new Employee("rahul","HR",50000),
		new Employee("priya","IT",50000),
		new Employee("rahul","HR",50000),
		new Employee("rahul","HR",50000)
		);

}
}