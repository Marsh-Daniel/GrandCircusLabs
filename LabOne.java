package labs;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Welcome to Grand Cirucs' Room Detail Generator!");
			
			System.out.println("Enter Length: ");			
			float length = input.nextFloat();
			
			System.out.println("Enter Width: ");
			float width = input.nextFloat();
			
			float perimeter = (width * 2) + (length * 2);
			System.out.println("The Perimeter of your room is: " + perimeter);
			
			float area = width * length;
			System.out.println("The Area of your room is: " + area);
			
			System.out.println("Would You Like to Continue??: y/n");
			cont = input.next();

		}
		input.close();
	}

}
