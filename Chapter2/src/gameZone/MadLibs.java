package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String wordEst;
		String bodyPartPlural;
		String anAnimal, aNoun, PluralNoun;
		
		int a, b, c;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a color >> ");
		color = input.nextLine();
		System.out.print("Enter a word ending in est >> ");
		wordEst = input.nextLine();
		System.out.print("Enter the plural form of any body part >> ");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter any animal >> ");
		anAnimal = input.nextLine();
		System.out.print("Enter a noun >> ");
		aNoun = input.nextLine();
		System.out.print("Enter a plural noun >> ");
		PluralNoun = input.nextLine();
		System.out.print("Enter a number >> ");
		a = input.nextInt();
		System.out.print("Enter another number >>");
		b = input.nextInt();
		c = a - b;
		System.out.println("The " + color + " Dragon is the " + wordEst + " Dragon of all. it has " + c + bodyPartPlural + ", and a(n)" + anAnimal + "shaped like a " + aNoun + "it loves to eat " + PluralNoun + ", although it will feast on nearly anything");
	}

}
