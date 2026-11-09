package DerivedClass;
//get the employee class from the ParentClass package
import ParentClass.Employee;

public class FullTimeEmployee extends Employee {
	double salary;
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public FullTimeEmployee(String name, String lastname, String SSN, double salary) {
		super(name, lastname, SSN);
		this.salary = salary;
	}

	//the inhereted method from employee abstract class
	@Override
	public double income() {
		return salary;
	}
	
	//another inhereted method from employee abstract class
	public String toString(String name, String lastname, String social_security) {
		return social_security + "| " + name + " " + lastname;
	}
	
	//Returns the name of the FullTimeEmployee position.
	@Override
	public String getPosition() {
		return "Full Time Employee";
	}
	
	//super.toString() gives the name, social number with the getters. And the FullTimeEmployee adds the position (job role) and salary.
	@Override
	public String toString() {
		return super.toString() + "\nPosition: "  +  getPosition() + "\nBase Salary: " + salary + " Euro";
	}
	
}
