package Week1;
import java.util.*;

class Add2Integers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program adds two numbers");
		
		System.out.println("Enter 1st number: ");
		int n1 = scan.nextInt();
        
		System.out.println("Enter 2nd number: ");
		int n2 = scan.nextInt();
        
        int total = n1 + n2;
        System.out.println("The total is " + total + ".");

        scan.close();
	}

}


    
