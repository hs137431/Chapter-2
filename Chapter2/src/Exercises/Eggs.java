package Exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double DozenCost, SingleCost, TotalCost, OrderDividedByDozen, SingleEggs;
		int Order, Dozen, Single;
		DozenCost = 3.25;
		SingleCost = 0.45;
		Dozen = 12;
		Single = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of eggs >> ");
		Order = input.nextInt();
		OrderDividedByDozen = Order / Dozen;
		SingleEggs = Order % OrderDividedByDozen;
		TotalCost = (OrderDividedByDozen * DozenCost) + (SingleEggs * SingleCost);
		System.out.println("You ordered " + Order / Dozen + " dozen eggs and " + 
		+ SingleEggs + " single eggs the cost will be $" + TotalCost);
		
		//System.out.println(TotalCost);
	}

}
