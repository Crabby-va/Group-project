package DerivedClass;
//get the employee class from the ParentClass package
import ParentClass.Employee;



public class PartTimeEmployee extends Employee {
	private int working_hours;
	private final double HOURLY_RATE = 400; //The hourly rate paid. final meaning it cannot change.
	
	//Constructor - when adding new instance variables please change the constructor accordingly!!!
	public PartTimeEmployee(String name, String lastname, String SSN, int working_hours) {
		super(name, lastname, SSN);
		this.working_hours = working_hours;
	}

	//the inhereted method from employee abstract class
	@Override
	public double income() {
		//For calculating and outputting hours x hourly rate.
		return working_hours * HOURLY_RATE;
	}
	
	//another inhereted method from employee abstract class
	public String toString(String name, String lastname, String social_security) {
		return social_security + "| " + name + " " + lastname;
	}
	
	//For returning the name of this employee class position.
	@Override
	public String getPosition() {
		return "Part Time Employee";
	}
	
	//super.toString() gives the name and social number. PartTimeEmployee class adds its position and salary.
	@Override
	public String toString() {
		return super.toString() + "\nPosition: " + getPosition() + "\nNumber of hours worked: " + working_hours + "\nHourly rate: " + HOURLY_RATE + " euros.";
	}
	
}