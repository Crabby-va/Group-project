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
	
	//For overriding the parent's position name.
	@Override
	public String getPosition() {
		return "Base Employee with commission";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBase salary: " + " euro (10% of the base salary)";
	}
	
}
