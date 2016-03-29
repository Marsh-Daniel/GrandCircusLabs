package labs;

import java.util.Scanner;

public class ChooseOwnAdventureGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! What is the users name? (Enter your name)");
		String name = input.nextLine();
		System.out.println("Great well " + name + " would you like to play a game? (enter 1 for yes/2 for no)");
		int answer = input.nextInt();
		if (answer ==1){
		String game = "not won";
		System.out.println("Awsome you fall down a hole into a cave and begin to wander you ");
		startGame:
		while (game!= "won"){
			
		System.out.println("come to a 3 way fork, which way do you take?(enter 1 for left 2 for center or 3 for right");
		answer = input.nextInt();
		
		if(answer == 1){
		 
		System.out.println("you come to a large cavern and find no way out you wander back after a while");
			
		}else if(answer == 2){
			System.out.println("you wander for hours and eventually get out");
			System.out.println("Great job you won!");
			break startGame;
			
		}else{		 
			System.out.println("you wander a long while before you");
			continue startGame;
		}
		}
		}
		
	
		}
		
	}


