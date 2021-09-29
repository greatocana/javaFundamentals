package javaFundamentals;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("math		: ");
		float math = s.nextFloat();
		
		System.out.print("ap		: ");
		float ap = s.nextFloat();
		
		System.out.print("english		: ");
		float english = s.nextFloat();
		
		System.out.print("science		: ");
		float science = s.nextFloat();
		
		System.out.print("filipino	: ");
		float filipino = s.nextFloat();
		
		float ave = (math + ap + english + science + filipino) / 5;
		
		System.out.println();
		System.out.println("Average		: " + ave);
		
		if (ave > 100) {
			System.out.println("Invalid Grade!");
		}else if (ave >= 95) {
			System.out.println("with highest honors!");
		}else if (ave >= 90 ) {
			System.out.println("with honors!");
		}else if (ave >= 75) {
			System.out.println("passed!");
		}else{
			System.out.println("failed...");
		}

	}

}
