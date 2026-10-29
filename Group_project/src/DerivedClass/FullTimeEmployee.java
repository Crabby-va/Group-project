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
	public double income() {
		return 0;
	}
	
	//another inhereted method from employee abstract class
	public String toString(String name, String lastname, String social_security) {
		return social_security + "| " + name + " " + lastname;
	}
}
