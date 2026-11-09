package Demo;

//Imported all of the classes for now...
import ParentClass.Employee;
import DerivedClass.*;	//these are all of the derived classes imported - not sure if it is needed (can be deleted)
import java.util.Scanner;	//Scanner reads what the user types

public class Main {

	Employee[] staff = new Employee[100];
	int count = 0;	//how many employees are saved in the array
	Scanner input = new Scanner(System.in);	//reads the keyboard
	final String LINE = "==================================================";	//separator line used many times
	
	public static void main(String[] args) {
		//main is static, so we create a Main object to use staff and the methods below
		Main program = new Main();
		program.menu();
	}

	//Shows the main menu again and again until the user chooses Exit
	public void menu() {
		int option;
		do {
			System.out.println(LINE);
			System.out.println("|       Choose from the menu                     |");
			System.out.println(LINE);
			System.out.println("|   1. Register Employee                         |");
			System.out.println("|   2. Print Employee Data                       |");
			System.out.println("|   3. Print by Position                         |");
			System.out.println("|   4. Print by Contract                         |");
			System.out.println("|   5. Exit                                      |");
			System.out.println(LINE);
			System.out.println("Choose option");
			System.out.print("-->");
			option = readNumber();

			//Each option calls its own method
			switch (option) {
				case 1:
					registerEmployee();
					break;
				case 2:
					printEmployeeData();
					break;
				case 3:
					printByPosition();
					break;
				case 4:
					printByContract();
					break;
				case 5:
					System.out.println(LINE);
					System.out.println("      Thank you for choosing our program");
					System.out.println(LINE);
					break;
				default:	//any other number
					System.out.println("Choose between the offered options !");
			}
		} while (option != 5);
		input.close();
	}

	//Reads a whole number. If the user types letters, it asks again instead of crashing.
	public int readNumber() {
		int number = 0;
		boolean valid = false;
		while (!valid) {
			try {
				number = Integer.parseInt(input.nextLine().trim());	//text -> int
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number!");
				System.out.print("-->");
			}
		}
		return number;
	}

	//Option 1 - reads the data of a new employee and saves it in the array
	public void registerEmployee() {
		//The array has only 100 places
		if (count == staff.length) {
			System.out.println("The staff list is full!");
			return;
		}

		System.out.println("--------------------------------------------------");
		System.out.println("1. Full Time Employee");
		System.out.println("2. Part - Time Employee");
		System.out.println("3. Commission Employee");
		System.out.println("4. Base Employee with Commission");
		System.out.println("--------------------------------------------------");
		System.out.print("-->");
		int type = readNumber();

		//A wrong type sends the user back to the main menu
		if (type < 1 || type > 4) {
			System.out.println("Choose between the offered options !");
			return;
		}

		//Data that all employees have
		System.out.println("First name");
		String name = input.nextLine();
		System.out.println("Last name");
		String lastname = input.nextLine();
		System.out.println("Social Number");
		String SSN = input.nextLine();
		System.out.println("Type of Contract (Seasonal / Annual)");
		String contract = input.nextLine();

		//A parent type variable can hold any child object (upcasting)
		Employee newEmployee;

		if (type == 1) {
			System.out.println("Weekly salary");
			int salary = readNumber();
			newEmployee = new FullTimeEmployee(name, lastname, SSN, salary);
		} else if (type == 2) {
			System.out.println("Hours of work");
			int hours = readNumber();
			newEmployee = new PartTimeEmployee(name, lastname, SSN, hours);
		} else {
			//Types 3 and 4 both need the number of sales
			System.out.println("Number of sales");
			int sales = readNumber();
			if (type == 3) {
				newEmployee = new CommissionEmployee(name, lastname, SSN, sales);
			} else {
				newEmployee = new BaseCommissionEmployee(name, lastname, SSN, sales);
			}
		}

		newEmployee.setContract(contract);	//contract is saved with the setter
		staff[count] = newEmployee;	//put the employee in the next free place
		count++;
		System.out.println("Employee registered!");
	}

	//Option 2 - prints all the data of every employee
	public void printEmployeeData() {
		if (count == 0) {
			System.out.println("No employees registered yet!");
			return;
		}
		printTitle("Employee Information");
		for (int i = 0; i < count; i++) {
			//Java runs toString() and income() of the real object type (polymorphism)
			System.out.println(staff[i].toString());
			System.out.println("Salary: " + staff[i].income() + " Euro");
			System.out.println(LINE);
		}
	}

	//Option 3 - prints the name and position of every employee
	public void printByPosition() {
		if (count == 0) {
			System.out.println("No employees registered yet!");
			return;
		}
		printTitle("Employee Position");
		for (int i = 0; i < count; i++) {
			System.out.println(staff[i].getName() + " " + staff[i].getLastname() + " - " + staff[i].getPosition());
			System.out.println(LINE);
		}
	}

	//Option 4 - prints the name and contract of every employee
	public void printByContract() {
		if (count == 0) {
			System.out.println("No employees registered yet!");
			return;
		}
		printTitle("Employee Contract");
		for (int i = 0; i < count; i++) {
			System.out.println(staff[i].getName() + " " + staff[i].getLastname() + " - " + staff[i].getContract() + " Contract");
			System.out.println(LINE);
		}
	}

	//Prints a title between two lines (DRY: written once, used 3 times)
	public void printTitle(String title) {
		System.out.println(LINE);
		System.out.println("|        " + title);
		System.out.println(LINE);
	}

}