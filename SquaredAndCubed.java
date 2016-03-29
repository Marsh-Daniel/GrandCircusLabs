package labs;

import java.util.Scanner;

public class SquaredAndCubed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Learn your sqaures and cubes!");
		System.out.print("Enter Your number: ");
		int number = input.nextInt();
		System.out.println("Number     Squared     Cubed");
		System.out.println("======     =======     =====");
		for(int i=1;i<number; i++){
			System.out.println(number + "          "+((int)Math.pow(i, 2))+"          "+ ((int)Math.pow(i, 3)));
		}
	}

}
