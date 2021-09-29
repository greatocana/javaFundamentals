package javaFundamentals;

import java.util.Date;
import java.util.Scanner;

public class PracticeSwitch {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Month		: ");
		int month = s.nextInt();

		System.out.print("Day		: ");
		int day = s.nextInt();
		
		System.out.print("Year		: ");
		int year = s.nextInt();
		
		String monthword = "";
		
		switch (month) {
			case 1:
				monthword = "January";
				break;
			case 2:
				monthword = "February";
				break;
			case 3:
				monthword = "March";
				break;
			case 4:
				monthword = "April";
				break;
			case 5:
				monthword = "May";
				break;
			case 6:
				monthword = "June";
				break;
			case 7:
				monthword = "July";
				break;
			case 8:
				monthword = "August";
				break;
			case 9:
				monthword = "September";
				break;
			case 10:
				monthword = "October";
				break;
			case 11:
				monthword = "Noverber";
				break;
			case 12:
				monthword = "December";
				break;
		}
		
		
		if (monthword == "") {
			
			System.out.println("Invalid Month...");
			
		}else if(monthword == "February" && day > 28) {
			
			System.out.println("February has only 28 days...");
			
		}else if (day > 31 || day <= 0) {
				
			System.out.println("invalid Day...");
				
		}else {
			
			System.out.println();
			System.out.println(monthword + " " + day + " " + year );
			
			}
		
		
		
		// Instantiate a Date object
	      Date date = new Date();

	      // display time and date using toString()
	      System.out.println(date.toString());
	}
}
