package javaFundamentals;

import java.util.Scanner;

public class LooopQuestion {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int lives = 3;
		String answer;
		
		while (lives > 0) {
			
			System.out.println("Who is the National Hero of the Philippines?");
			System.out.println("Answer: ");
			answer = s.nextLine();
			
			if(answer.equalsIgnoreCase("Jose Rizal")){
				break;
			}else{
				lives--;
			}
		}
		if(lives > 0) {
			System.out.println("CORRECT!!!");
		}else {
			System.out.println("YOU LOST...");
		}
	}

}
