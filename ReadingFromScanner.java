/*import java.util.Scanner;

public class ReadingFromScanner{
	public static void main(String[] args){
		Scanner myInput= new Scanner(System.in);
		System.out.println("Enter your Name");

		String myName=myInput.nextLine();
		System.out.println("The name is "+myName);
	}
}
*/

import java.util.*;

public class ReadingFromScanner{
	public static void main(String[] args){
		try{

		Scanner myInput=new Scanner(System.in);
		System.out.println("Enter  your name");
		String myName=myInput.nextLine();
		System.out.println("Enter your age");
		int myAge=myInput.nextInt();
		System.out.println("Enter your percetage");
		float myPerce=myInput.nextFloat();
		System.out.println("Are you sure? true/false");
		boolean myBoolean =myInput.nextBoolean();

		System.out.println("Your name is "+myName);
		System.out.println("Your Age is "+myAge);
		System.out.println("Your Percentage is "+myPerce);
		if (myBoolean==true){
			System.out.println("This is verified");
		}
		else{
			System.out.println("This is unverified");
		}

		} catch(InputMismatchException e){
			System.out.println("Invalid Input");
		}
	}
}