package DerivedClass;

public class BaseCommissionEmployee extends CommissionEmployee {
	
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public BaseCommissionEmployee(String name, String lastname, String SSN, int sales_amount) {
		super(name, lastname, SSN, sales_amount);
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
