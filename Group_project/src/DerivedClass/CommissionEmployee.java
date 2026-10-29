package DerivedClass;
//get the employee class from the ParentClass package
import ParentClass.Employee;

public class CommissionEmployee extends Employee {
	int sales_amount;
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public CommissionEmployee(String name, String lastname, String SSN, int sales_amount) {
		super(name, lastname, SSN);
		this.sales_amount = sales_amount;
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
