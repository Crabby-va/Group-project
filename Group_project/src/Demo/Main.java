package Demo;

//Imported all of the classes for now...
import ParentClass.Employee;
//import DerivedClass.*;	//these are all of the derived classes imported - not sure if it is needed (can be deleted)

import java.util.Scanner;//The Scanner import reads what the user types in console.

public class Main {

	Employee[] staff = new Employee[100];
	int count = 0;//How many employees are saved in the array.
	Scanner input = new Scanner(System.in);//Reads keyboard inputs in the console.
	final String LINE = "===============================";//A String output in console for visual distinction and better readability.
	
	public static void main(String[] args) {
		
		//The main method is static, so it can't use staff or menu(). So we created a Main object for using them.
		Main program = new Main();
		program.menu();
	}
	
	public void menu() {
		int option = 0; //saves the selected option and is initialized for the switch
		boolean active = true; //checks if the user is still active on this program
		
		String[] available_options = {	//a string array that saves the available options of the program
				"===============================",
				"| Choose from the menu |",
				"===============================",
				"| 1. Register Employee |",
				"| 2. Print Employee Data |",
				"| 3. Print by Position |",
				"| 4. Print by Contract |",
				"| 5. Exit |",
				"==============================="
		};
		
		do {
			for (String options : available_options) {
				System.out.println(options);
			}
			System.out.print("Choose a number of the listed options: ");
			try {
				option = input.nextInt();
			} catch (Exception e) {
				System.out.println("Something went wrong when recieving your option number!");
			}
			input.nextLine();
			
			//the program functions and features!
			switch (option) {
			case 1: 				//registering an employee
				
				break;				//break is the end of the option
			case 2: 				//printing employee data
				
				break;
			case 3: 				//printing by position
				
				break;
			case 4:					//printing by contract
				
				break;
			case 5:					//exiting the program
				active = false;
				break;
			default:
				System.out.println("Invalid option! Make sure the number is an existing option!");
				break;
			}
			
		} while(active);
		
		System.out.println("Thank you for using our program!");
		//input.close();
	}

}
