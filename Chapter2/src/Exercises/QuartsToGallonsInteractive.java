package Exercises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quartsInGallons = 4;
		
		int quartsNeeded;
		int GallonsNeeded;
		int extraQuarts;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed >> ");
		quartsNeeded = input.nextInt();
		
		GallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		System.out.println("You have " + GallonsNeeded + " gallons and "
				+ extraQuarts + " quarts left over");
	}

}
