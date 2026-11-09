package DerivedClass;
//get the employee class from the ParentClass package
import ParentClass.Employee;

public class CommissionEmployee extends Employee {
	int sales_amount;
	protected final double COMMISSION_PER_SALE = 700;  //the euro quantity for each sale. Which is protected, so the child class can use it.
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public CommissionEmployee(String name, String lastname, String SSN, int sales_amount) {
		super(name, lastname, SSN);
		this.sales_amount = sales_amount;
	}

	//the inhereted method from employee abstract class
	public double income() {
		//The salary is dependent on the quantity of sales.
		return sales_amount * COMMISSION_PER_SALE;
	}
	
	//another inhereted method from employee abstract class
	public String toString(String name, String lastname, String social_security) {
		return social_security + "| " + name + " " + lastname;
	}
	
	@Override
	public String getPosition() {
		return "Commission Employee";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPosition: " + getPosition() + "\nNumber of the sales: " + sales_amount + "\nCommision per sale: " + COMMISSION_PER_SALE + " euros.";
	}

}
