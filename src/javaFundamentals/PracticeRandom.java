package javaFundamentals;

import java.util.Random;

public class PracticeRandom {

	public static void main(String[] args) {
		
		Random numRandom = new Random(); // random number generator ......
		int x = numRandom.nextInt(6) +1; // pick 1 to 6 ... the +1 is to not include 0 
		
		System.out.println(x);

	}

}
