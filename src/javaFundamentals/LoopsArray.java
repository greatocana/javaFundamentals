package javaFundamentals;

import java.util.Scanner;

public class LoopsArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] names = {"DOG", "CAT", "MOUSE", "BIRD"};
		
		System.out.print("Search 		:");
		String search = s.next();
		
		int i = 0;
		
		while(i < names.length) {
			if(names[i].equalsIgnoreCase(search)) {
				
				System.out.println();
				System.out.println("OMG!!! May " + names[i]);
				break; // stops the loop
				
			}
			i++;
		}
		//array length -counts the number of array
		System.out.println();
		System.out.println("Number of Animals :" +" " + names.length);
	}
}