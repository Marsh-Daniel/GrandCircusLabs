package labs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println("Please enter a number: ");
		long number = input.nextLong();
		long result = 1;
		for(int i=1 ;i<= number; i++){
			
			result = result * i;
		}
		System.out.println(result);
input.close();
	}
}
