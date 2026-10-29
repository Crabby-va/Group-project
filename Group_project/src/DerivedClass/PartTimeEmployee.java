package DerivedClass;
//get the employee class from the ParentClass package
import ParentClass.Employee;

public class PartTimeEmployee extends Employee {
	int working_hours;
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public PartTimeEmployee(String name, String lastname, String SSN, int working_hours) {
		super(name, lastname, SSN);
		this.working_hours = working_hours;
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
