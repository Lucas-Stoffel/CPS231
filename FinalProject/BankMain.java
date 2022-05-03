package FinalProject;

import java.util.ArrayList;

public class BankMain {

    public static void main(String[] args){

        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Employees
        Employee em1 = new Employee("Peter", "Esposito", 10001, "peter.esposito@sunydutchess.edu", 3410, "Student");
        Employee em2 = new Employee("Akrum", "Gafur", 10010, "akrum.gafur@sunydutchess.edu", 2730, "student");
        Employee em3 = new Employee("Caleb", "Herrera", 10011, "caleb.herrera@sunydutchess.edu", 2780, "Student");
        Employee em4 = new Employee("John", "Maksuta", 10100, "john.maksuta@sunydutchess.edu", 3290, "Student");
        Employee em5 = new Employee("Viri", "Herrera", 10101, "viridiana.martinherrera@sunydutchess.edu", 4450, "Student");
        Employee em6 = new Employee("Brandon", "Mohammed", 10110, "brandon.mohammed@sunydutchess.edu", 4020, "Student");
        Employee em7 = new Employee("Christopher", "Shenton", 10111, "christopher.shenton@sunydutchess.edu", 3880, "Student");
        Employee em8 = new Employee("Lucas", "Stoffel", 11000, "lucas.stoffel@sunydutchess.edu", 2750, "Student");
        Employee em9 = new Employee("Appolo", "Tankeh", 11001, "appolo.tankeh@sunydutchess.edu", 2430, "Teacher");
        // Adding into ArrayList
        employees.add(em1);
        employees.add(em2);
        employees.add(em3);
        employees.add(em4);
        employees.add(em5);
        employees.add(em6);
        employees.add(em7);
        employees.add(em8);
        employees.add(em9);
        // Printing out ArrayList
        printAll(employees);
        // Testing Withdraw and 
        em9.withdraw(900);
        print(em9);

        em1.deposit(2000);
        print(em1);

        for (Employee em : employees){
            double randomNumb = Math.round(Math.random() * (200 - 100) + 100);
            em.withdraw(randomNumb);        
        }

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
