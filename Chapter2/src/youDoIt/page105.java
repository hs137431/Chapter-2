package youDoIt;

import java.util.Scanner;

public class page105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber, secondNumber, sum, difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextInt();
		System.out.print("Please enter an integer >> ");
		secondNumber = input.nextInt();
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = (double) sum / 2;
		
		System.out.print(firstNumber + " + " + secondNumber + " = " + sum + " ");
		System.out.print(firstNumber + " - " + secondNumber + " = " + difference + " ");
		System.out.print("The average of " + firstNumber + " and " + secondNumber + " is " + average + " ");
	}

}
