package _01_Lambda_Methods;

import java.util.Iterator;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	String in = "repeat";
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, in);
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		System.out.println();
		
		printCustomMessage( (s) -> {
			String out = "";
			for(int i = in.length(); i > 0; i--) {
				out+=in.substring(i-1, i);
			}
			System.out.println(out);
		}, in);
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		System.out.println();
		
		printCustomMessage( (s) -> {
			String out = "";
			for(int i = 0; i < in.length(); i++) {
				if(i%2==1) {
					out+=in.substring(i, i+1).toUpperCase();
				}
				else {
					out+=in.substring(i, i+1).toLowerCase();
				}
			}
			System.out.println(out);
		}, in);
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		System.out.println();
		
		printCustomMessage( (s) -> {
			String out = in.substring(0, 1);
			for(int i = 1; i < in.length(); i++) {
				out+="."+in.substring(i, i+1);
			}
			System.out.println(out);
		}, in);
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		System.out.println();
		
		printCustomMessage( (s) -> {
			String out = "";
			for(int i = 0; i < in.length(); i++) {
				String j = in.substring(i, i+1);
				if(!j.equals("a") && !j.equals("e") && !j.equals("u") && !j.equals("i") && !j.equals("o")) {
					out+=j;
				}
			}
			System.out.println(out);
		}, in);
	}
	
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
