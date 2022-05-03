package FinalProject;

import java.util.ArrayList;

public class BankMain {

    public static void main(String[] args){

        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Adding Employees into ArrayList
        employees.add(new Employee("Peter", "Esposito", 10001, "peter.esposito@sunydutchess.edu", 3410, "Student"));
        employees.add(new Employee("Akrum", "Gafur", 10010, "akrum.gafur@sunydutchess.edu", 2730, "student"));
        employees.add(new Employee("Caleb", "Herrera", 10011, "caleb.herrera@sunydutchess.edu", 2780, "Student"));
        employees.add(new Employee("John", "Maksuta", 10100, "john.maksuta@sunydutchess.edu", 3290, "Student"));
        employees.add(new Employee("Viri", "Herrera", 10101, "viridiana.martinherrera@sunydutchess.edu", 4450, "Student"));
        employees.add(new Employee("Brandon", "Mohammed", 10110, "brandon.mohammed@sunydutchess.edu", 4020, "Student"));
        employees.add(new Employee("Christopher", "Shenton", 10111, "christopher.shenton@sunydutchess.edu", 3880, "Student"));
        employees.add(new Employee("Lucas", "Stoffel", 11000, "lucas.stoffel@sunydutchess.edu", 2750, "Student"));
        employees.add(new Employee("Appolo", "Tankeh", 11001, "appolo.tankeh@sunydutchess.edu", 2430, "Teacher"));

        // Printing out ArrayList
        System.out.println("Base Print:");
        printAll(employees);
        
        // Testing Withdraw and deposit methods
        System.out.println("\nWithdraw test:");
        employees.get(8).withdraw(900);
        print(employees.get(8));

        System.out.println("\nDeposit test:");
        employees.get(0).deposit(2000);
        print(employees.get(0));

        System.out.println("\nWithdrawing Random number from each employee:");
        for (Employee em : employees){
            double randomNumb = Math.round(Math.random() * (200 - 100) + 100);
            em.withdraw(randomNumb);        
        }

        System.out.println("\nPrint after transactions:");
        printAll(employees);



    }

    public static void print(Employee e) {

		System.out.println(e.IDnum + " | " + e.firstname + " " + e.lastname + " | " + e.Email + " | $" + e.balance + " | " + e.EmployeeType + 
        " | ");
        System.out.println(" ----------------------------------------------- ");
		
	}

    public static void printAll(ArrayList<Employee> e) {

        for (Employee em : e) {
            print(em);
        }

    }

}
