package javaFundamentals;

import java.util.Scanner;

public class PracticeMethod1 {

	public static String iAmchristian() {
		return "I am Christian hehe";
	}
	
	public static void loop() {
		int i = 0;
		while (i < 5 ) {
			
			System.out.println(i + " Hey!!!");
			
			i++;
			
		}
		System.out.println();
	}
	
	public static void answer() {
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
