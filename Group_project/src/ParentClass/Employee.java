package ParentClass;

public abstract class Employee {
	
	//3 private instance variables for all employees
	private String name;
	private String lastname;
	private String SSN; //social security number
	
	
	//NAME setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//lastname setters and getters
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	//Social security number setters and getters
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	//Custom made constructor that will utilize the setters conditions as well!!
	public Employee(String name, String lastname, String SSN) {
		super();
		setName(name);
		setLastname(lastname);
		setSSN(SSN);
	}

	//Abstract methods for all of the employees to utilize 
	public abstract double income();
	public abstract String toString(String name, String lastname, String social_security);
	
}

