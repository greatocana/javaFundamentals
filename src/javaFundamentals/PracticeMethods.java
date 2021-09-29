package javaFundamentals;

public class PracticeMethods {
	
		//Global variable ..
		static String name = "Chan... ";
		
		
	public static void main(String[] args) {
		
		
		
		
		//this. calling method from another class / use code from another file
		PracticeMethod1 a = new PracticeMethod1(); //this should be the same name as the public class name in PracticeMethod1...
		String christian = a.iAmchristian(); 
		System.out.println(christian);
		a.loop();
		
		//overloading method
		System.out.println(add(5, 5));
		System.out.println(add(5, 5, 5));
		
		System.out.println();
		addHi("Christian");
		
		System.out.println();
		System.out.println(name);
		
		//loop question method...
		System.out.println();
		a.answer();
	}
	//Sample overloading method (return)
	static int add(int num1, int num2) { 
		
		return num1 + num2;
		
	}
	static int add(int num1, int num2, int num3) {
			
			return num1 + num2 + num3;
			
		}
	//simple calling method
	public static void addHi(String s) {
		//add Hi...
		System.out.println("Hi " + s);
	}
	
	static void sayChan() {
		System.out.println(name);
	}
}
