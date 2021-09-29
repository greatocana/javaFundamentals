package javaFundamentals;

import java.util.Scanner;

public class SimpleAuthentication {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] uname = {"David", "Patric", "Ace"};
		String[] pass = {"david123","patric123","ace123"};
		
		System.out.print("Enter Username : ");
		String username = s.nextLine();
		
		System.out.print("Enter Password : ");
		String password = s.nextLine();
		
		boolean isExist = false;
		
		for(int i = 0; i < uname.length; i++) {                
			
			if(username.equals(uname[i]) && password.equals(pass[i])) {
				isExist = true;
				break;
			}
			
		}
		if(isExist) {
			System.out.println("Welcome " + uname);
		}else {
			System.out.println("Account not found...");	
		}
		
	}

}
