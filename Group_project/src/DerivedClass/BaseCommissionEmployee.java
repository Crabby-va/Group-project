package DerivedClass;

public class BaseCommissionEmployee extends CommissionEmployee {
	
	private final double BASE_SALARY = 1000; //The fixed base salary in euros.
	private final double BONUS_RATE = 0.10; //The added bonus 10% from the base salary.
	
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public BaseCommissionEmployee(String name, String lastname, String SSN, int sales_amount) {
		super(name, lastname, SSN, sales_amount);
	}

	//the inhereted method from employee abstract class
	public double income() {//For calculating base salary + commission + 10% bonus.
		return BASE_SALARY + super.income() + BASE_SALARY * BONUS_RATE;
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
