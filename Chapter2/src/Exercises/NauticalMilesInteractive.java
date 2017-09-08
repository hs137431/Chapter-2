package Exercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometers, miles;
		int nauticalMiles;
		Scanner input = new Scanner(System.in);
		kilometers = 1.852;
		miles = 1.150779;
		System.out.print("Enter number of nautical miles >> ");
		nauticalMiles =  input.nextInt();
		kilometers = kilometers * nauticalMiles;
		miles = miles * nauticalMiles;
		
		// add stuff to say in console
		System.out.println("There are " + miles + " miles or " + kilometers + " kilometers in " 
		+ nauticalMiles + " nautical miles");
	}

}
