package Exercises;

import java.util.Scanner;

public class InchesTofeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches, feet;
		feet = 12;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of inches >> ");
		inches = input.nextInt();
		System.out.println("You have " + inches / feet + " feet and " + inches % feet + " inches");
	}

}
